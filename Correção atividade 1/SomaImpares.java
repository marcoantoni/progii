class SomaImpares {

	public static void main (String args[]) {
		
		int soma = 0;
		
		for (int i=0; i < 100; i++) {
			if (i % 2 != 0)
				soma += i;
		}
		
		System.out.printf("O resultado é %d \n", soma);
	
	}

}
