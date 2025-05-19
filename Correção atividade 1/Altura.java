class Altura {

	public static void main (String args[]) {
		int altJuca = 90;
		int altChico = 60;
		int anos = 1;
		
		while (altChico <= altJuca){
			altJuca += 6;
			altChico += 9;
			System.out.printf("Juca tem %d e Chico tem %d no ano %d \n", 
				altJuca, altChico, anos);
			anos++;
		}
	}

}
