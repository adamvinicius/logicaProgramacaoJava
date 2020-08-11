package logicaProgramacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecisaoLogicaTest {
	DecisaoLogica decisaoLogica = new DecisaoLogica();
	@Test
	public void validaMaiorValor1() {
		int val1 = 10;
		int val2 = 9;
		assertEquals(10, decisaoLogica.getMaior(val1, val2));
	}
	@Test
	public void validaMaiorValor2() {
		int val1 = 5;
		int val2 = 6;
		assertEquals(6, decisaoLogica.getMaior(val1, val2));
	}
	
	@Test
	public void validaAbaixoDoPeso() {
		double peso = 60;
		double altura = 1.75;
		String r = decisaoLogica.getPesoIdeal(peso, altura);
		assertEquals("Abaixo do peso", r);
	}
	@Test
	public void validaPesoIdeal() {
		double peso = 75;
		double altura = 1.75;
		String r = decisaoLogica.getPesoIdeal(peso, altura);
		assertEquals("Peso ideal", r);
	}
	
	@Test
	public void validaAcimaDoPeso() {
		double peso = 100;
		double altura = 1.75;
		String r = decisaoLogica.getPesoIdeal(peso, altura);
		assertEquals("Acima do peso", r);
	}
	
	@Test
	public void validaMaiorIgualVal1() {
		int val1 = 10;
		int val2 = 9;
		int maior = (int) decisaoLogica.getMaiorIgual(val1, val2);
		assertEquals(10, maior);
	}
	
	@Test
	public void validaMaiorIgualVal2() {
		int val1 = 10;
		int val2 = 11;
		int maior = (int) decisaoLogica.getMaiorIgual(val1, val2);
		assertEquals(11, maior);
	}
	
	@Test
	public void validaMaiorIgual() {
		int val1 = 10;
		int val2 = 10;
		String igual = (String) decisaoLogica.getMaiorIgual(val1, val2);
		assertEquals("numeros identicos", igual);
	}
	
	
}
