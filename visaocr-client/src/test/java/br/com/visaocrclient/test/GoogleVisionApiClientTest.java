package br.com.visaocrclient.test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.services.vision.v1.VisionScopes;

import br.com.visaocrclient.GoogleVisionApiClient;


public class GoogleVisionApiClientTest {

	private GoogleCredential credenciais;
		
	
	@Before
	public void configura_credenciais() {
		try {
			credenciais = GoogleCredential.getApplicationDefault().createScoped(VisionScopes.all());
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	
	@Test
	public void deve_realizar_requisicao_para_api_vision() {
		
		GoogleVisionApiClient cliente = new GoogleVisionApiClient(credenciais);
		String caminhoImagem = GoogleVisionApiClient.class.getResource("/teste.jpg").getPath();
		caminhoImagem = caminhoImagem.replaceFirst("^/(.:/)", "$1");
		List<String> caminhosImagens = Arrays.asList(caminhoImagem);
		
		List<String> resultado = cliente.enviarImagensParaEfetuarOCR(caminhosImagens);
		
		org.junit.Assert.assertFalse(resultado.isEmpty());
		org.junit.Assert.assertTrue(resultado.get(0).contains("COU) 343482"));
		
		
	}
	
	
	
}
