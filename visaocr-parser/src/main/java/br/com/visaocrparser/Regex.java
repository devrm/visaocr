package br.com.visaocrparser;

/**
 * @author rodmafra
 *
 */
public class Regex {
	
	public static final String EXTRATOR_CNPJ = "\\d{2}\\s*(\\.\\s*\\d{3}\\s*){2}\\/\\s*\\d{4}\\s*-*\\d{2}";
	public static final String EXTRATOR_APENAS_NUMEROS = "\\s*[^0-9]";
	public static final String EXTRATOR_COO = "CCF.*\\n([0-9 ]*)";
	public static final String EXTRATOR_COO_MESMA_LINHA = "C[0Oo ]{2}\\s*[: ][0-9 ]*";
	public static final String EXTRATOR_DATA_NOTA = "\\d{2}[\\/7]\\d{2}[\\/7]\\d{4}";
	public static final String EXTRATOR_VALOR_TOTAL = "TOTAL.*\\n([PD]inheiro\\n)?([\\w ]*\\d{1,3}\\s*[,.]\\s*\\d{1,3})";
	public static final String EXTRATOR_MONETARIO_VALOR_TOTAL = "\\d{1,3}[.,]\\d{1,3}";

}
