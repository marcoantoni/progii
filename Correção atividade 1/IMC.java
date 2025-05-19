class IMC {
	public static void main (String args[]) {
		
		float altura = 1.75f;
		float peso = 92.8f;
		
		double imc = peso / (altura * altura); 
		
		if (imc < 18.5)
			System.out.printf("IMC de %f é magreza", imc);
		else if (imc <= 25)
			System.out.printf("IMC de %f é normal", imc);
		else if (imc <= 29.9)
			System.out.printf("IMC de %f é sobrepeso", imc);
		else if (imc <= 39f)
			System.out.printf("IMC de %f é obesidade", imc);
		else 
			System.out.printf("IMC de %f é obesidade grave", imc);
		 
		
	}
}
