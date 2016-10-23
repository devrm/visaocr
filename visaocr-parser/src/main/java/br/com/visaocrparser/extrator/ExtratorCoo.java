package br.com.visaocrparser.extrator;

import java.util.regex.Matcher;

import org.apache.commons.lang3.StringUtils;

import br.com.visaocrparser.Regex;

public final class ExtratorCoo extends Extrator {

	public ExtratorCoo(String textoParaExtrair) {
		super(textoParaExtrair);
	}

	@Override
	public String extrair() {
		String resultado = StringUtils.EMPTY;
		
		Matcher matcher = Extrator.patternCoo.matcher(super.textoParaExtrair);
		Matcher matcherMesmaLinha = Extrator.patternCooMesmaLinha.matcher(super.textoParaExtrair);
		
		if (matcherMesmaLinha.find()) {
			resultado = matcherMesmaLinha.group();
		} else if (matcher.find()) {
			resultado = matcher.group(1);
		}
		
		int indiceCharDoisPontos = resultado.indexOf(":");
		if (resultado.indexOf(":") > 0) {
			resultado = resultado.substring(indiceCharDoisPontos, resultado.length());
		}
		resultado = resultado.replaceAll(Regex.EXTRATOR_APENAS_NUMEROS, "");
		resultado = resultado.replaceAll("\\s*", "");
		
		return resultado;
	}

}
