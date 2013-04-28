package br.com.folha.enuns;

import java.util.ArrayList;
import java.util.List;

public enum CodigoRecolhimento {

	COD_115(115L, "Recolhimento ao FGTS e informa��es � Previd�ncia Social"),
	COD_130(130l, "Recolhimento ao FGTS e informa��es � Previd�ncia Social relativas ao trabalhador avulso portu�rio"),
	COD_135(135L, "Recolhimento ao FGTS e informa��es � Previd�ncia Social relativas ao trabalhador avulso n�o portu�rio"),
	COD_145(145L, "Recolhimento ao FGTS de diferen�as apuradas pela CAIXA"),
	COD_150(150L, "Recolhimento ao FGTS e informa��es � Previd�ncia Social de empresa prestadora de servi�os com cess�o de m�o-de-obra e empresa de trabalho tempor�rio (Lei n� 6.019/74), em rela��o aos empregados cedidos, ou de obra de constru��o civil � empreitada parcial"),
	COD_155(155L, "Recolhimento ao FGTS e informa��es � Previd�ncia Social de obra de constru��o civil � empreitada total ou obra pr�pria"),
	COD_211(211L, "Declara��o para a Previd�ncia Social de cooperativa de trabalho relativa aos contribuintes individuais cooperados que prestam servi�os a tomadores"),
	COD_307(307L, "Recolhimento de Parcelamento do FGTS"),
	COD_317(317L, "Recolhimento de Parcelamento do FGTS de empresa com tomador de servi�os"),
	COD_327(327L, "Recolhimento de Parcelamento de d�bito com o FGTS, priorizando os valores devidos aos trabalhadores"),
	COD_337(337L, "Recolhimento de Parcelamento de d�bito com o FGTS de empresas com tomador de servi�os, priorizando os valores devidos aos trabalhadores"),
	COD_345(345L, "Recolhimento de parcelamento de d�bito com o FGTS relativo � diferen�a de recolhimento, priorizando os valores devidos aos trabalhadores"),
	COD_418(418L, "Recolhimento recursal para o FGTS"),
	COD_604(604L, "Recolhimento ao FGTS de entidades com fins filantr�picos � Decreto-Lei n� 194, de 24/02/1967 (compet�ncias anteriores a 10/1989)"),
	COD_608(608L, "Recolhimento ao FGTS e informa��es � Previd�ncia Social relativos a dirigente sindical"),
	COD_640(640L, "Recolhimento ao FGTS para empregado n�o optante (compet�ncia anterior a 10/1988)"),
	COD_650(650L, "Recolhimento ao FGTS e informa��es � Previd�ncia Social relativo a Anistiados, Reclamat�ria Trabalhista, Reclamat�ria Trabalhista com Reconhecimento de V�nculo, Acordo, Diss�dio ou Conven��o Coletiva, Comiss�o de Concilia��o Pr�via ou N�cleo Intersindical de Concilia��o Trabalhista"),
	COD_660(660L, "Recolhimento exclusivo ao FGTS relativo a Anistiados, Convers�o de Licen�a Sa�de em Acidente de Trabalho, Reclamat�ria Trabalhista, Acordo, Diss�dio ou Conven��o Coletiva, Comiss�o de Concilia��o Pr�via ou N�cleo Intersindical de Concilia��o Trabalhista");
	
	private Long codigo;
	private String descricao;
	
	private CodigoRecolhimento(Long codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Long getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getDescricaoAbreviada() {
		if(descricao.length() < 60)
			return codigo + " - " + descricao.substring(0, descricao.length());
		return codigo + " - " + descricao.substring(0, 60);
	}
	
	public static List<CodigoRecolhimento> getAsList(){
		List<CodigoRecolhimento> lista = new ArrayList<CodigoRecolhimento>();
		for(int i = 0; i < CodigoRecolhimento.values().length; i++){
			lista.add(CodigoRecolhimento.values()[i]);
		}
		return lista;
	}
}
