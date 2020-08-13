package logicaProgramacao;

import java.util.LinkedHashMap;
import java.util.List;

public class EstruturaRepeticao {
	//35.	Exibir a tabuada do número cinco no intervalo de um a dez.
	public void getTabuadaCinco() {
		int valor = 5;
		for (int i = 1; i < 11; i++) {
			System.out.println("5 x "+i+" = "+(valor*i));
		}
	}
	//39.	Exibir a soma dos números inteiros positivos do intervalo de um a cem.
	public void somaNumerosPositivosUmACem() {
		int soma = 0;
		for (int i = 1; i < 101; i++) {
			soma = soma + i;
		}
		System.out.println(soma);
	}
	
	//52.	Armazenar dez números na memória do computador. Exibir os valores na ordem inversa à da digitação.
	public void exibirValorOrdemInversa(List<Integer> listaNumeros) {
		for (int i = 9; i >= 0 ; i--) {
			System.out.println(listaNumeros.get(i));
		}
	}
	
	//55.	Armazenar vinte valores na memória. Após a digitação, entrar com uma constante multiplicativa que deverá multiplicar cada um dos valores do vetor e armazenar o resultado em outro vetor, porém em posições equivalentes. Exibir os vetores na tela.
	public void constanteMultiplicativa(int[] vetor, int constante) {
		int[] resultado = new int[20];
		for (int i = 0; i < vetor.length; i++) {
			resultado[i] = vetor[i] * constante;
			System.out.println(vetor[i]);
			System.out.println(resultado[i]);
		}
	}
	
	//57.	Armazenar o nome e idade de 5 pessoas. Após a digitação, exibir os dados (nome e idade) de todas as pessoas.
	public void exibeDados(List<LinkedHashMap<String, Object>> listMap) {
		for (LinkedHashMap<String, Object> map : listMap) {
			System.out.println("nome: "+map.get("nome")+" idade: "+map.get("idade"));
			
		}
	}
}
