/*1.	A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de croissant a cada dia. Cada pãozinho custa R$ 0,60 e o croissant custa R$ 4,45. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e croissants (juntos), e quanto deve guardar numa conta de poupança (30% do total arrecadado). Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de croissants, e depois calcular os dados solicitados.*/

import java.util.Scanner;

class Padaria {
	
	public static void main(String args[]) {
		
		// necessário para ler do teclado
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe a quantidade de pães franceses vendidos \n");
		int pao = sc.nextInt();
		
		System.out.printf("Informe a quantidade de croissant vendidos \n");
		int croissant = sc.nextInt(); 
		
		float totalVendas = (pao * 0.6f) + (croissant * 4.45f);
		
		float poupanca = totalVendas * 0.3f;
		
		System.out.printf("Durante o dia, foram arrecadado R$ %.2f e devem ser guardados R$ %.2f", totalVendas, poupanca);
	}

}
