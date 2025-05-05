class CorrecaoExercicios {
	// 2. Crie uma função chamada toFahrenheit, que recebe uma 
	//temperatura em graus Celsius, transforma em Fahrenheit e 
	// retorna esse dado. Utilize a fórmula: (°C * 9/5) + 32
	
	public static double toFahrenheit(double celsius) {
		double fah = (celsius * 9/5) + 32;
		
		return fah;
	}
	
	/*3. Crie um método chamado calcularConsumo, que recebe dois parâmetros 
	 * (uma distância percorrida em km por um veículo) e a quantidade consumida 
	 * de combustível, ambos do tipo double. O consumo é calculado dividindo a
	 *  distância percorrida pela quantidade de combustível.
	 */
	 
	 public static double calcularConsumo(double distancia, double litros) {
		 // fazendo o cálculo diretamente dentro do return
		 return distancia / litros;
	 }
	
	public static void main (String args[]) {
		// testando o exercício2
		// a chamada ao metodo toFahrenheit passando o 31 como parametro será o argumento que o printf exige para mostrar no segundo %f
		System.out.printf("%.2f celsius correspondem a %.2f graus fahrenheit \n", 31f, toFahrenheit(31) ); 
		  
		// testando a resolução do exercício3
		// criando variaiveis para armazenar as informações, para tornar o programa mais "parametrizado"
		double distanciaPercorrida = 341.8;
		double distanciaPercorrida = 24.87;
		
		// a chamada ao metodo calcularConsumo passando as variaveis distanciaPercorrida e distanciaPercorrida como parametro será o terceiro argumento que o printf exige para mostrar no segundo %f  
		System.out.printf("Foi percorrido %.2f km com %.2f litros de combustível e o consumo médio foi de %.2f km/l \n", distanciaPercorrida, litrosGasto, 
		calcularConsumo(distanciaPercorrida, litrosGasto) );
		
	}
	
}
