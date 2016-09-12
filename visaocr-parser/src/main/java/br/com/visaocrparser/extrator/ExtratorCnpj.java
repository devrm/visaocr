package br.com.visaocrparser.extrator;

import java.util.regex.Matcher;

import org.apache.commons.lang3.StringUtils;

import br.com.visaocrparser.Regex;

public final class ExtratorCnpj extends Extrator {

	public ExtratorCnpj(String textoParaExtrair) {
		super(textoParaExtrair);
	}

	@Override
	public String extrair() {
		
		String resultado = StringUtils.EMPTY;
		
		Matcher matcher = Extrator.patternCnpj.matcher(super.textoParaExtrair);
		
		if (matcher.find()) {
			resultado = matcher.group();
			resultado = resultado.replaceAll(Regex.EXTRATOR_APENAS_NUMEROS, StringUtils.EMPTY);
		}
		
		return resultado;
	}

}
