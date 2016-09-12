package br.com.visaocrparser.extrator;

import java.util.regex.Pattern;

import br.com.visaocrparser.Regex;

public abstract class Extrator {

	protected static Pattern patternCnpj;
	protected static Pattern patternCoo;
	protected static Pattern patternValorTotal;
	protected static Pattern patternDataNota;
	protected String textoParaExtrair;
	
	protected Extrator(String textoParaExtrair) {
		this.textoParaExtrair = textoParaExtrair;
	}
	
	static {
		patternCnpj = Pattern.compile(Regex.EXTRATOR_CNPJ);
		patternCoo = Pattern.compile(Regex.EXTRATOR_COO);
		patternValorTotal = Pattern.compile(Regex.EXTRATOR_VALOR_TOTAL);
		patternDataNota = Pattern.compile(Regex.EXTRATOR_DATA_NOTA);
	}

	protected abstract String extrair();

}
