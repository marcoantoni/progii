class FigGeometrica{
	float base;
	float altura;
	
	public FigGeometrica (float b, float alt) {

		// valida se a base e a altura são válidos, 
		if (b > 0 && alt > 0){
			base = b;	// armazennando o valor do parametro b no atributo base
			altura = alt;	// armazennando da valor do parametro alt no atributo altura
			
			// determinar o tipo da figura
			if (base == altura) {
				System.out.printf("A figura é um quadrado \n");
			} else {
				System.out.printf("A figura é um retângulo \n");
			}
		
		} else {
			// caso um dos valores seja inválido, a figura não será um quadrado ou retângulo 
			System.out.printf("A altura ou a base são inválidos");
		}
		
	}
	
	// Crie um método que calcule retorne a área da figura geométrica.

	public float calcularArea() {
		return altura * base;	// calculando a área da figura
	}
	
	public static void main (String args[]) {
		FigGeometrica figura1 = new FigGeometrica(6, 5);
		
		System.out.printf("A figura tem %.2f de área", 
			figura1.calcularArea() );
	}
	
	
	
	
	
	
	
	
}
