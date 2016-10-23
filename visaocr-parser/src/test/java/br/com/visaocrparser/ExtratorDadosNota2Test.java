package br.com.visaocrparser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import br.com.visaocr.domain.DadosNota;

public class ExtratorDadosNota2Test {
	
	String textoNota = "";
	{
		try {
			textoNota = new String(Files.readAllBytes(Paths.get(ExtratorDadosNota2Test.class.getResource("/teste2.txt").getPath())));
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	
	
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
		Assert.assertTrue(StringUtils.equals(dadosNota.getCoo(), "325366"));
	}
	
	@Test
	public void deve_extrair_valor_total_corretamente() {
		ProcessoExtracaoDadosNota extrator = new ProcessoExtracaoDadosNota(textoNota);
		
		DadosNota dadosNota = extrator.extrairNotaApenasComValorTotal();
		
		Assert.assertTrue(StringUtils.equals(dadosNota.getValorTotal(), "64,50"));
	}
	
	
	@Test
	public void deve_extrair_data_corretamente() {
		ProcessoExtracaoDadosNota extrator = new ProcessoExtracaoDadosNota(textoNota);
		
		DadosNota dadosNota = extrator.extrairNotaApenasComData();
		
		Assert.assertTrue(StringUtils.equals(dadosNota.getData(), "13/08/2016"));
	}
	
}
