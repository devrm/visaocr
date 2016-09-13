package br.com.visaocr.domain.constantes;

public enum StatusAnalise {
	
	PENDENTE(0), OK(1), ERRO(2), INCONSISTENTE(3);
	
	private int status;
	
	private StatusAnalise(int status) {
		this.status = status;
	}
	
	public int getStatus() {
		return this.status;
	}
	
}
