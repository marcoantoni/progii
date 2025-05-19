class BPM {
	public static void main(String args[]) {
		int bpm = 99;
		
		if (bpm < 60) 
			System.out.println("Bradicardia (muito baixo)");
		else if (bpm >= 60 && bpm <= 100)
			System.out.println("Batimentos normais");
		else 
			System.out.println("Taquicardia");
	}

}
