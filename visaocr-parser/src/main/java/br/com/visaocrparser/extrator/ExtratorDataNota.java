package br.com.visaocrparser.extrator;

import java.util.regex.Matcher;

import org.apache.commons.lang3.StringUtils;

/**
 * @author rodmafra
 *
 */
public final class ExtratorDataNota extends Extrator {

	private static final String EXTRATOR_DATA_COM_SETE = "\\d{2}7\\d{2}7\\d{4}";

	public ExtratorDataNota(String textoParaExtrair) {
		super(textoParaExtrair);
	}

	@Override
	public String extrair() {
		
		String resultado = StringUtils.EMPTY;
		
		Matcher matcher = patternDataNota.matcher(super.textoParaExtrair);
		
		if (matcher.find()) {
			resultado = matcher.group();
			if (resultado.matches(EXTRATOR_DATA_COM_SETE)) {
				StringBuilder resultadoBuilder = new StringBuilder(resultado);
				resultado = resultadoBuilder.replace(2, 3, "/").replace(5, 6, "/").toString();
			}
		}
		
		return resultado;
	}

}
