import java.util.Scanner;

class PesoIdeal {

	public static void main (String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("Informe a altura: ");
		float altura = sc.nextFloat();
		
		sc.nextLine();	// limpa o buffer (evita que pule a próxima execução)
		
		System.out.printf("Informe o sexo: masc para masculino OU fem para feminino \n");
		String sexo = sc.nextLine();
		
		float peso = 0f; // inicializando a variavel
		
		//if (sexo == "masc")	// essa forma é errada para testar strings
		// a forma correta
		if (sexo.equals("masc") == true)
			peso = (72.7f * altura) - 58;
		else
			peso = (62.1f*altura) - 44.7f;
			
		System.out.printf("O peso ideal para o sexo informado é %f \n", peso);
		
	}

}
