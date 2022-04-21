package br.unicamp.ic.inf335.beans;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class ProdutoBeanTest {
	
	private static ArrayList<ProdutoBean> produtos_testados = new ArrayList<ProdutoBean>();
	private static ArrayList<ProdutoBean> produtos_ordenados = new ArrayList<ProdutoBean>();
	
	@Test
	void test_ordenacao() {
		
		ProdutoBean nProg1 = new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",1250.0,"Poucos riscos, estado de novo.");
		produtos_testados.add(nProg1);
		ProdutoBean nProg2 = new ProdutoBean("CD00002","Prod 2 ...", "Bla Bla Bla",1100.0,"Bla Bla Bla");
		produtos_testados.add(nProg2);
		ProdutoBean nProg3 = new ProdutoBean("CD00003","Prod 3 ...", "Bla Bla Bla",120.0,"Bla Bla Bla");
		produtos_testados.add(nProg3);
		ProdutoBean nProg4 = new ProdutoBean("CD00004","Prod 4 ...", "Bla Bla Bla",1300.0,"Bla Bla Bla");
		produtos_testados.add(nProg4);
		ProdutoBean nProg5 = new ProdutoBean("CD00005","Prod 5 ...", "Bla Bla Bla",9400.0,"Bla Bla Bla");
		produtos_testados.add(nProg5);
		ProdutoBean nProg6 = new ProdutoBean("CD00006","Prod 6 ...", "Bla Bla Bla",1500.0,"Bla Bla Bla");
		produtos_testados.add(nProg6);
		
		Collections.sort(produtos_testados);
		
		produtos_ordenados.add(nProg3);
		produtos_ordenados.add(nProg2);
		produtos_ordenados.add(nProg1);
		produtos_ordenados.add(nProg4);
		produtos_ordenados.add(nProg6);
		produtos_ordenados.add(nProg5);
		
		assertEquals(true, produtos_testados.equals(produtos_ordenados));
	}
	
	@Test
	void test_compareTo() {
		ProdutoBean produto1 = new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",1250.0,"Poucos riscos, estado de novo.");
		ProdutoBean produto2 = new ProdutoBean("CD00002","Celular Galaxy S20", "128 Gb",1500.0,"Novo.");
		
		assertEquals(-1, produto1.compareTo(produto2));
	}

}
