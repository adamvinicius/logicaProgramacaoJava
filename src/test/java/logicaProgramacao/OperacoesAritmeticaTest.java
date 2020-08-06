package logicaProgramacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OperacoesAritmeticaTest {
	OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();
	@Test
	public void validaAreaRetangulo() {
		int area;
		area = opAritmeticas.getAreaRetangulo(10, 10);
		assertEquals(100, area);
	}
	
	@Test
	public void validaMediaAritmetica() {
		float media = opAritmeticas.getMediaAritmetica(5, 7, 9, 6);
		
		assertEquals(6.75, media, 0);
	}
	
	@Test
	public void conversaoReais() {
		double reais = opAritmeticas.getReais(5.29, 5);
		assertEquals(26.45, reais, 0);
	}
	
	@Test
	public void exponencial() {
		double exp = opAritmeticas.getExponencial(2, 3);
		assertEquals(8, exp, 0);
		
	}
	
	
}
