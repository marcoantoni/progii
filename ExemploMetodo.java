import java.util.Scanner;	// import do Scanner para poder ler do teclado

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
	
	// exemplo de método sem retorno
	// métodos sem retorno são uteis em algumas situações, como por exemplo, fazer uma leitura do teclado.
	public static void lerTeclado() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o número 1 \n");
		float n1 = sc.nextFloat();
		
		System.out.printf("Digite o número 2 \n");
		float n2 = sc.nextFloat();
		
		// Nesse exemplo, depois de ler do teclado, está sendo chamado o método somar, que será responsável por somar os dois valores
		// aqui consegue-se dividir o problema em duas partes: a leitura do teclado e um método responsável pelo calculo.
		// a variavel soma terá armazenado o que a função somar retornou  
		
		double soma = somar(n1, n2);
		
		System.out.printf("%f + %f = %f \n", n1, n2, soma);
	}
	
	public static void main (String args[]) {
		
		lerTeclado();
		
		// comentando as 3 linhas abaixo, pois os valores serão lidos do teclado
		double a = 34;
		double b = 41.89;
		
		// criando uma variavel para armazenar o resultado da soma
		//double resultSoma = somar(a, b);
		
		//System.out.printf("%f + %f = %f \n", a, b, resultSoma );
		
		// chamando o método subtrair sem usar a variavel auxiliar
		// a própria chamada ao método será o argumento que o printf exige
		System.out.printf("%f - %f = %f \n", a, b, subtrair(a, b) );
		
		// chamando o método que irá fazer a conversão
		double distancia = 5809;
		
		System.out.printf("%f correspondem a %.2f km \n", distancia, metrosToKM(distancia) );
	}
	
}
