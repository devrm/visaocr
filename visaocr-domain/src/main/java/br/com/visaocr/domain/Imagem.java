package br.com.visaocr.domain;

import java.io.File;

import lombok.Data;

@Data
public class Imagem {
	
	private Integer id;
	private String caminho;
	private String caminhoDestino;
	
	public Imagem(String caminho) {
		this.caminho = caminho;
	}
	
	
	public String extraiNomeImagem() {
		
		if (caminho == null) {
			return "";
		} else {
			return caminho.substring(caminho.lastIndexOf(File.separatorChar)+1, caminho.length()); 
		}
		
	}
	
	
}
