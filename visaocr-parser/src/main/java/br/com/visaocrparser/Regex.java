package br.com.visaocrparser;

/**
 * @author rodmafra
 *
 */
public class Regex {
	
	public static final String EXTRATOR_CNPJ = "\\s*\\d{2}\\s*\\.\\s*\\d{3}\\s*\\.\\s*\\d{3}\\s*\\/\\s*\\d{4}\\s*-\\s*\\d{2}\\s*";
	public static final String EXTRATOR_APENAS_NUMEROS = "\\s*[^0-9]";
	public static final String EXTRATOR_COO = "C\\S\\S:\\d{6}";
	public static final String EXTRATOR_VALOR_TOTAL = "[\\d],+(\\d+)";
	public static final String EXTRATOR_DATA_NOTA = "\\d{2}\\/\\d{2}\\/\\d{4}";

}
