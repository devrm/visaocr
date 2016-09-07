package br.com.visaocrparser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Classe utilizada para extrair os dados da nota (texto puro)
 * 
 * @author rodmafra
 *
 */
public class ExtratorDadosNota {

	private static final String EXTRATOR_CNPJ = "\\s*\\d{2}\\s*\\.\\s*\\d{3}\\s*\\.\\s*\\d{3}\\s*\\/\\s*\\d{4}\\s*-\\s*\\d{2}\\s*";
	
	
	private String textoNota;

	public ExtratorDadosNota(String textoNota) {
		this.textoNota = textoNota;
	}
	
	public DadosNota extrairTodasInformacoes() {
		
		DadosNota dadosNota = new DadosNota();
		
		dadosNota.setCnpj(extrairCnpj());
		
		return dadosNota;
	}
	
	private String extrairCnpj() {
		String resultado = "";
		Pattern p = Pattern.compile(EXTRATOR_CNPJ);
		
		Matcher matcher = p.matcher(this.textoNota);
		
		if (matcher.find()) {
			resultado = matcher.group();
			resultado = resultado.replaceAll("\\s*[^0-9]", "");
		}
		
		return resultado;
	}
	
	
}
