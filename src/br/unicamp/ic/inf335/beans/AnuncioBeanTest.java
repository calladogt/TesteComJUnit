package br.unicamp.ic.inf335.beans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnuncioBeanTest {

	@Test
	void test_desconto() {
		ProdutoBean celular = new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",1250.0,"Poucos riscos, estado de novo.");
		AnuncioBean anuncio = new AnuncioBean();
		anuncio.setProduto(celular);
		anuncio.setFotosUrl(null);
		anuncio.setDesconto(0.1);
		assertEquals(1250*0.9,anuncio.getValor());
	}
	
	@Test
	void test_desconto_min() {
		ProdutoBean celular = new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",1250.0,"Poucos riscos, estado de novo.");
		AnuncioBean anuncio = new AnuncioBean();
		anuncio.setProduto(celular);
		anuncio.setFotosUrl(null);
		anuncio.setDesconto(0.0);
		assertEquals(1250.0,anuncio.getValor());
	}
	
	@Test
	void test_desconto_max() {
		ProdutoBean celular = new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",1250.0,"Poucos riscos, estado de novo.");
		AnuncioBean anuncio = new AnuncioBean();
		anuncio.setProduto(celular);
		anuncio.setFotosUrl(null);
		anuncio.setDesconto(1.0);
		assertEquals(0.0, anuncio.getValor());
	}
}
