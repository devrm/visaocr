package br.com.visaocrparser.extrator;

import java.util.regex.Matcher;

import org.apache.commons.lang3.StringUtils;

/**
 * @author rodmafra
 *
 */
public final class ExtratorDataNota extends Extrator {

	public ExtratorDataNota(String textoParaExtrair) {
		super(textoParaExtrair);
	}

	@Override
	public String extrair() {
		
		String resultado = StringUtils.EMPTY;
		
		Matcher matcher = patternDataNota.matcher(super.textoParaExtrair);
		
		if (matcher.find()) {
			resultado = matcher.group();
		}
		
		return resultado;
	}

}
