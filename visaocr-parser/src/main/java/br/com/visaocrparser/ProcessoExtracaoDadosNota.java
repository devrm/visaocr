package br.com.visaocrparser;

import br.com.visaocr.domain.DadosNota;
import br.com.visaocrparser.extrator.ExtratorCnpj;
import br.com.visaocrparser.extrator.ExtratorCoo;
import br.com.visaocrparser.extrator.ExtratorDataNota;
import br.com.visaocrparser.extrator.ExtratorValorTotal;

/**
 * 
 * Classe utilizada para extrair os dados da nota (texto puro)
 * 
 * @author rodmafra
 *
 */
public class ProcessoExtracaoDadosNota {

	private String textoNota;

	public ProcessoExtracaoDadosNota(String textoNota) {
		this.textoNota = textoNota;
	}
	
	public DadosNota extrairTodosOsDadosDaNota() {
		
		DadosNota dadosNota = new DadosNota();
		
		dadosNota.setCnpj(new ExtratorCnpj(textoNota).extrair());
		dadosNota.setCoo(new ExtratorCoo(textoNota).extrair());
		dadosNota.setData(new ExtratorDataNota(textoNota).extrair());
		dadosNota.setValorTotal(new ExtratorValorTotal(textoNota).extrair());
		
		return dadosNota;
	}
	
	
	
	public DadosNota extrairNotaApenasComCnpj() {
		
		DadosNota dadosNota = new DadosNota();
		dadosNota.setCnpj(new ExtratorCnpj(textoNota).extrair());
		
		return dadosNota;
	}
	
	
	public DadosNota extrairNotaApenasComCoo() {
		
		DadosNota dadosNota = new DadosNota();
		dadosNota.setCoo(new ExtratorCoo(textoNota).extrair());
		
		return dadosNota;
	}
	
	
	public DadosNota extrairNotaApenasComValorTotal() {
		
		DadosNota dadosNota = new DadosNota();
		dadosNota.setValorTotal(new ExtratorValorTotal(textoNota).extrair());
		
		return dadosNota;
	}
	
	public DadosNota extrairNotaApenasComData() {
		
		DadosNota dadosNota = new DadosNota();
		dadosNota.setData(new ExtratorDataNota(textoNota).extrair());
		
		return dadosNota;
	}
	
	
}
