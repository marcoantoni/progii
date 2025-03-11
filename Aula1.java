class Aula1 {
	public static void main (String args[]) {
		String nome = "Murilo";	// declaracao de uma variavel do tipo string
		
		int idade = 16; 	// declaracao de uma variavel do tipo int
		
		float peso = 58.4f; // declaração de uma variavel do tipo float. é obrigatório colocar o f ao declarar um float

		char sexo = 'M';	// declaração de uma variavel do tipo char. o tipo char usa aspa simples
		
		System.out.printf("Nome: %s \n", nome);	// printando uma string (%s)
		
		System.out.printf("Idade: %d \n", idade);	// printando um int (%d)
		
		System.out.printf("Peso: %f \n", peso);	// printando uma float (%f)
		
		System.out.printf("Sexo: %s \n", sexo);	// o tipo char é printado como string também) - 
		
		// exemplo operadores aritméticos
		int num1 = 10;
		int num2 = 3;
		
		int soma = num1 + num2;	// resultado: 13
		
		int subt = num1 - num2;	// resultado: 7
		
		int mult = num1 * num2; // resultado: 30
		
		int divisao = num1 / num2;	// 3 - a parte decimal não é exibida
		
		System.out.printf("A soma é %d \n", soma);
		System.out.printf("A subtração é %d \n", subt);
		System.out.printf("A multiplicação é %d \n", mult);
		System.out.printf("A divisão é %d \n", divisao);
		
		// para que 10 / 3 de 3.333, é preciso que uma das variais seja float, desse modo, o resultado também será float
		int num3 = 10;
		float num4 = 3;
		
		float div = num3 / num4;
		System.out.printf("A divisão é %f \n", div);
		
		// dessa forma é feita a conversão da variavel num2 para float sem criar novas variais
		float div2 = num1 / (float)num2;
		System.out.printf("A divisão é %f \n", div2);
		
		// Exercício: Crie um algoritmo que analise um numero inteiro armazenado em uma 
		// variavel imprima o seu antecessor e seu sucessor.
		
		int x = 15;
		
		System.out.printf("Antecessor de %d é %d \n", x, (x-1) );	// a expressão aritmética pode ficar dentro do print
		System.out.printf("Sucessor de %d é %d \n", x, (x+1) );
	}
}
