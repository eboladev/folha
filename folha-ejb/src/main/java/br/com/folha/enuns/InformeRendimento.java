package br.com.folha.enuns;

public enum InformeRendimento {

	NAO_CONSIDERAR('N', "N�o Considerar"), RENDIMENTO_TRIBUTAVEL('R', "Rendimento Tribut�vel")
	, DEDUCAO_INSS('I', "Dedu��o INSS"), DEDUCAO_PENSAO('P', "Dedu��o Pens�o");
	
	private char sigla;
	private String valor;
	
	private InformeRendimento(char sigla, String valor){
		this.sigla = sigla;
		this.valor = valor;
	}

	public char getSigla() {
		return sigla;
	}

	public void setSigla(char sigla) {
		this.sigla = sigla;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
