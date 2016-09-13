package br.com.visaocr.domain;

import lombok.Getter;
import lombok.Setter;

public class ResultadoVisionAPI {
	
	@Getter @Setter
	private String textoNota;
	
	@Getter
	private StringBuilder jsonResultado = new StringBuilder();

	public void appendJsonResultado(final String texto) {
		this.jsonResultado.append(texto);
	}
	
}
