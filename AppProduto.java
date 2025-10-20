class AppProduto {

	public static void main (String args[]) {
		
		Produto p1 = new Produto("Pepsi 1L", 3.29f, 4573549);
		
		Produto p2 = new Produto("Doritos 210g", -7.87f, 5490544);
		
		// resolver o bug que está permitindo o preço de venda do doritos ficar -10,23 
		// Válido até as 11 horas. Valendo 0.3 na média.
		
		p1.mostrar();
		p2.mostrar();
		
	}

}
