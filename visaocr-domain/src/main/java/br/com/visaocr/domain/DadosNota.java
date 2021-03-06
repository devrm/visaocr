package br.com.visaocr.domain;

import java.time.format.DateTimeFormatter;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class DadosNota {

	public static final DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String cnpj;
	private String coo;
	private String data;
	private String valorTotal;
	private StatusNota statusNota;
	
	public enum StatusNota {
		PENDENTE_OCR(0), OK_OCR(1), ERRO_OCR(2), INCONSISTENTE_OCR(3);
		
		private int status;

		private StatusNota(int status) {
			this.status = status;
		}

		public int getStatus() {
			return this.status;
		}
	}
	
}
