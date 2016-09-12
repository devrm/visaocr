package br.com.visaocrparser;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class ExtratorDadosNotaTest {

	
	private String textoNota = 
			"AUTO POSTO BANDEIRA PAULISTA LTDA\r\nRUA BANDEIRA PAULISTA, NO 370\r\nTAIM BIBI SAO PAULO SP CEP:04532-010\r\nCNPJ:54. 480. 496/0001-77\r\nIE 111.269.656. 113\r\nIM: 9.225. 963-4\r\n1270872016 16:30:53 CCF 300234 C00:325062\r\nCNPJ/CPF consumidor:"+
		    "NOME: 1-*** CONSUMIDOR PADRAO\r\nEND:RUA BANDEIRA PAULISTA, 370\r\nCUPOM FISCAL\r\nITEH CODIGO DESCR ICAO QTD UN VL UNIT RS) ST VLITEH( RS)\r\n17622300870003 DROPS RATG ICE 34G fON FT\r\nTOTAL R$\r\nDinheiro\r\n1,75\r\nMD5 81566C 4254E668EE4B87F775FD3C78DA"+
		    "OBRIGADO VOLTE SEMPRE\r\nAplicativo REZENDE SISTEMAS TTUA\r\nBEMATECH MP-4000 TH FI ECF-IF\r\nVERSAO:01. 00.01 ECF 008 LJ:0001\r\nQQQQQQQQQTETITYEIT 12/08/2016 16:30:57\r\nFAB:BE09 121010001 13165 10\r\n";
	
	@Test
	public void deve_extrair_cnpj_corretamente() {
		ProcessoExtracaoDadosNota extrator = new ProcessoExtracaoDadosNota(textoNota);
		
		DadosNota dadosNota = extrator.extrairNotaApenasComCnpj();
		
		Assert.assertTrue(StringUtils.equals(dadosNota.getCnpj(), "54480496000177"));
		
	}
	
	@Test
	public void deve_extrair_coo_corretamente() {
		ProcessoExtracaoDadosNota extrator = new ProcessoExtracaoDadosNota(textoNota);
		
		DadosNota dadosNota = extrator.extrairNotaApenasComCoo();
		
		Assert.assertTrue(StringUtils.equals(dadosNota.getCoo(), "325062"));
	}
	
	@Test
	public void deve_extrair_valor_total_corretamente() {
		ProcessoExtracaoDadosNota extrator = new ProcessoExtracaoDadosNota(textoNota);
		
		DadosNota dadosNota = extrator.extrairNotaApenasComValorTotal();
		
		Assert.assertTrue(StringUtils.equals(dadosNota.getValorTotal(), "1,75"));
	}
	
	
	@Test
	public void deve_extrair_data_corretamente() {
		ProcessoExtracaoDadosNota extrator = new ProcessoExtracaoDadosNota(textoNota);
		
		DadosNota dadosNota = extrator.extrairNotaApenasComData();
		
		Assert.assertTrue(StringUtils.equals(dadosNota.getData(), "12/08/2016"));
	}
	
}
