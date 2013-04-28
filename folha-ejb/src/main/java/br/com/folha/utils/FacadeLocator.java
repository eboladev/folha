package br.com.folha.utils;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.folha.enuns.TipoException;
import br.com.folha.exception.AppException;



public class FacadeLocator {

	/*
	 * Vari�veis comuns do Service Locator
	 */
	private static InitialContext initialContext;
	public static final String LOCAL = "local";
	public static final String REMOTE = "remote";
	private static final String EARNAME = "java:global/folhaEar/Folha-Pagamento-EJB";

	/**
	 * M�todo respons�vel por retornar o nome do ear que foi publicado.
	 * Necess�rio para realizar o lookUp nos servicos disponibilizados.
	 * @return
	 */
	private static String getEarName() {
		return EARNAME;
	}

	/**
	 * Construtor do Contexto de Inicializa��o do JNDI do Servidor de Aplica��es
	 */
	private static Context getInitialContext() throws NamingException {
		initialContext = new InitialContext();
		return initialContext;
	}

	/**
	 * Recupera o facade publicado no servidor atrav�s da interface.
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getService(Class<T> t) throws Exception, IllegalArgumentException {
		if(t == null)
			throw new IllegalArgumentException("Null n�o � um valor valido para obter o facade.");
		Local local = t.getAnnotation(Local.class);
		Remote remote = t.getAnnotation(Remote.class);
		if(local == null && remote == null){
			throw new IllegalArgumentException("A classe passada como argumento n�o � um EJB Local ou Remoto.");
		}
		try {
			String facade = getEarName() + "/" + t.getSimpleName() + "!" + t.getPackage().getName() +"." + t.getSimpleName();
			return (T) getInitialContext().lookup(facade);
		} catch (NamingException e) {
			e.printStackTrace();
			throw new AppException("N�o foi poss�vel execu��o a opera��o desejada. Erro: "	+ e.getMessage(), TipoException.ERROR);
		}
	}

}
