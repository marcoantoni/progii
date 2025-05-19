class FizzBuzz{ 

	public static void main (String args[]) {
		
		for (int i=1; i<500; i++) {
			if (i % 3 == 0 && i % 5 == 0) 
				System.out.printf("%d - fizzbuzz \n", i);
			else if (i % 3 == 0 )
				System.out.printf("%d - fizz \n", i);
			else if (i % 5 == 0) 
				System.out.printf("%d - buzz \n", i);
			else 
				System.out.printf("%d \n", i);
		
		}
	}

}
