package logicaProgramacao;

public class DecisaoLogica {
	//19.	Entrar via teclado, com dois valores distintos. Exibir o maior deles.
	public int getMaior(int val1, int val2) {
		if (val1 > val2) {
			return val1;
		}
		return val2;
	}
	
	//25.	Entrar com o peso e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Veja tabela da relação peso/altura².
	public String getPesoIdeal(double peso, double altura) {
		double r = peso / (altura * altura);
		if (r < 20) {
			return "Abaixo do peso";
		} else if (r >= 20 && r < 25 ) {
			return "Peso ideal";
		}
		return "Acima do peso";
		
	}
	
	//21.	Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso contrário, enviar mensagem avisando que os números são idênticos.
	public Object getMaiorIgual(int val1, int val2) {
		if (val1 > val2) {
			return val1;
		}else if (val2 > val1) {
			return val2;
		}
		return "numeros identicos";
	}
	
	//26.	A partir de três valores que serão digitados, verificar se formam ou não um triângulo. Em caso positivo, exibir sua classificação: “Isósceles, escaleno ou eqüilátero”. Um triângulo escaleno possui todos os lados diferentes, o isósceles, dois lados iguais e o eqüilátero, todos os lados iguais. Para existir triângulo é necessário que a soma de dois lados quaisquer seja maior que o outro, isto, para os três lados.
	public String getTriangulo(int a, int b, int c) {
		
		if (a + b > c || a+c > b || b + c > a) {
			if (a != b && a != c && b != c) {
				return "escaleno";
			}else if (a == b && a == c) {
				return "equilátero";
			}else if (a == b || a == c || c == b) {
				return "isóceles";
			}
		}
		return "não é um triangulo";
			
	}



}
