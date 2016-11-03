package br.com.visaocr.domain;

import lombok.Data;

/**
 * 
 * Armazena o resultado da analise ocr juntando com a extracao dos dados 
 * do texto analisado
 * 
 * @author rodmafra
 *
 */
@Data
public class ResultadoAnaliseOCR {

	private DadosNota dadosNota;
	private Imagem imagem;
	
}
