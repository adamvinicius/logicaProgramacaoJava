package logicaProgramacao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.junit.Test;

public class EstruturaRepeticaoTest {
	EstruturaRepeticao estruturaRepeticao = new EstruturaRepeticao();
	@Test
	public void exibeTabuadaCinco() {
		estruturaRepeticao.getTabuadaCinco();
	}
	
	@Test
	public void exibeSomaInteirosUmACem() {
		estruturaRepeticao.somaNumerosPositivosUmACem();
	}
	@Test
	public void exibeValorInverso() {
		List<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(2);
		listaNumeros.add(5);
		listaNumeros.add(7);
		listaNumeros.add(8);
		listaNumeros.add(12);
		listaNumeros.add(13);
		listaNumeros.add(17);
		listaNumeros.add(21);
		listaNumeros.add(25);
		listaNumeros.add(28);
		estruturaRepeticao.exibirValorOrdemInversa(listaNumeros);
	}
	
	@Test
	public void ExibeConstanteMultiplicativa() {
		int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
				12, 13, 14, 15, 16, 17, 18, 19, 20};
		int constante = 5;
		estruturaRepeticao.constanteMultiplicativa(vetor, constante);
		
	}
	
	@Test
	public void exibeListaNomeIdade() {
		List<LinkedHashMap<String, Object>> listMap = new ArrayList<LinkedHashMap<String,Object>>();
		LinkedHashMap<String, Object> map1 = new LinkedHashMap<>();
		LinkedHashMap<String, Object> map2 = new LinkedHashMap<>();
		LinkedHashMap<String, Object> map3 = new LinkedHashMap<>();
		LinkedHashMap<String, Object> map4 = new LinkedHashMap<>();
		LinkedHashMap<String, Object> map5 = new LinkedHashMap<>();
		map1.put("nome", "Joao");
		map1.put("idade", "35");
		map2.put("nome", "Thiago");
		map2.put("idade", "45");
		map3.put("nome", "Leia");
		map3.put("idade", "51");
		map4.put("nome", "Adam");
		map4.put("idade", "28");
		map5.put("nome", "Jose");
		map5.put("idade", "21");
		listMap.add(map1);
		listMap.add(map2);
		listMap.add(map3);
		listMap.add(map4);
		listMap.add(map5);
							
		estruturaRepeticao.exibeDados(listMap);
	}
}
