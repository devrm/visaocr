package br.com.visaocr.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class DadosNota {

	private String cnpj;
	private String coo;
	private String data;
	private String valorTotal;
	
}
