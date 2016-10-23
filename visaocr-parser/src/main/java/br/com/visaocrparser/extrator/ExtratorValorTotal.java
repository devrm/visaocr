package br.com.visaocrparser.extrator;

import java.util.regex.Matcher;

import org.apache.commons.lang3.StringUtils;

public final class ExtratorValorTotal extends Extrator {

	public ExtratorValorTotal(String textoParaExtrair) {
		super(textoParaExtrair);
	}

	@Override
	public String extrair() {
		String resultado = StringUtils.EMPTY;
		
		Matcher matcher = Extrator.patternValorTotal.matcher(super.textoParaExtrair);
		
		if (matcher.find()) {
			resultado = matcher.group(2);
			
			Matcher matcherValorMonetario = Extrator.patternMonetarioValorTotal.matcher(resultado);
			
			if (matcherValorMonetario.find()) {
				resultado = matcherValorMonetario.group();
			}
			
			resultado = resultado.replaceAll("\\s*", "").replace(".", ",");
		}
		
		return resultado;
	}

}
