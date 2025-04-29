class ExemploMetodo {
	// criando um método que irá somar dois valores
	// na hora de criar o método, depois do seu nome (somar) é obrigatório os "(" e ")" que correspondem aos argumentos
	// o double é o tipo de dado que o método irá devolver quando for chamado
	public static double somar(double x, double y){
		
		// cria uma variavel para armazenar a soma de x e y
		double resultado = x + y;
		
		return resultado;	// devolve o resultado para quem chamou
		
	}
	
	// crie um médodo chamado subtrair e chame ele, 
	// exibindo o resultado na tela
	
	public static double subtrair (double x, double y){
		return x - y;	// retonando o resultado sem usar uma variavel para armazenar o resultado
	}
	
	// Correção do exercício 1
	// Crie uma função chamada metrosToKM, que recebe um número 
	// inteiro representando uma distância em metros e a 
	// transforma em km.
	
	public static double metrosToKM(double metros) {
		return metros / 1000;	// conversão de metros para km
	} 
	
	public static void main (String args[]) {
		
		double a = 34;
		double b = 41.89;
		
		// criando uma variavel para armazenar o resultado da soma
		double resultSoma = somar(a, b);
		
		System.out.printf("%f + %f = %f \n", a, b, resultSoma );
		
		// chamando o método subtrair sem usar a variavel auxiliar
		// a própria chamada ao método será o argumento que o printf exige
		System.out.printf("%f - %f = %f \n", a, b, subtrair(a, b) );
		
		// chamando o método que irá fazer a conversão
		double distancia = 5809;
		
		System.out.printf("%f correspondem a %.2f km \n", distancia, metrosToKM(distancia) );
	}
	
}
