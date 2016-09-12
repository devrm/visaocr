package br.com.visaocrparser.extrator;

import java.util.regex.Matcher;

import org.apache.commons.lang3.StringUtils;

public final class ExtratorCoo extends Extrator {

	public ExtratorCoo(String textoParaExtrair) {
		super(textoParaExtrair);
	}

	@Override
	public String extrair() {
		String resultado = StringUtils.EMPTY;
		
		Matcher matcher = Extrator.patternCoo.matcher(super.textoParaExtrair);
		
		if (matcher.find()) {
			resultado = matcher.group();
			resultado = resultado.substring(4, resultado.length());
		}
		
		return resultado;
	}

}
