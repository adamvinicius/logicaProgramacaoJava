package logicaProgramacao;

public class OperacoesAritmeticas {
	//1.	Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
	public int getAreaRetangulo(int base, int altura) {
		int area = base * altura;
		return area;
	}
	
	//6.	Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
	public float getMediaAritmetica(float a, float b, float c, float d) {
		float media = (a + b + c + d) / 4f;
		return media;
	}
	
	//15.	Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).
	public double getReais(double cotacao, double qdDolar) {
		double reais = cotacao * qdDolar;
				
		return reais;
	}
	
	//17.	Entrar via teclado com dois valores quaisquer “X” e “X”. Calcular e exibir o cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
	public double getExponencial(double x, double y) {
		double exp = Math.pow(x, y);
		return exp;
	}
}
