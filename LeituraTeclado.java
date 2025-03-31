// importando o scanner para poder fazer a leitura do teclado
import java.util.Scanner;

class LeituraTeclado {
	
	public static void main (String args[]){

		// cria uma variavel do tipo scanner para poder fazer a leitura
		// é necessário importar o Scanner (1ª linha) para que funcione
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome");
		
		// lendo uma string
		String nome = sc.nextLine();
		
		System.out.printf("Informe o nascumento: \n");
		System.out.printf("Dia de nascimento: ");
		
		// lendo um int
		int dia = sc.nextInt();
		
		System.out.printf("Mês de nascimento: ");
		int mes = sc.nextInt();
		
		System.out.printf("Ano de nascimento: ");
		int ano = sc.nextInt();
		
		System.out.printf("Informe a altura: ");
		// lendo um float
		float altura = sc.nextFloat();
		
		// exibindo o que foi lido
		System.out.printf("Dados informados \n");
		System.out.printf("Nome: %s \n", nome);
		System.out.println("Nome: " + nome);
		System.out.printf("Nascimento: %d/%d/%d\n", dia, mes, ano);
		
		System.out.printf("Altura: %f", altura);
	}
	
}
