class Produto {
	float pCompra;
	float pVenda;
	String nome;

	// método construtor que torna obrigatório informar o nome do produto e o preço de compra
	// definido o nome "preco", pois como só sera recebido um valor, facilita o entendimento
	public Produto(String nome, float preco) {
		
		// validando se o nome foi preenchido
		// length testa a quantidade de caracteres de uma string
		if (nome.length() > 3) {
			this.nome = nome;	// armazenando o nome do produto no atributo da classe
		} else {
			System.out.printf("Nome do produto é inválido \n");
		}
	
		// validando o preço de compra
		if (preco > 0){
			this.pCompra = preco;	// armazena o valor do parametro preco no atributo pCompra
		
			pVenda = pCompra * 1.3f; // inicializando o preço de venda (acrescenta 30% em relação ao preço de compra)
		
		} else {
			System.out.printf("Preço de compra é inválido \n");
		}
		
	}
	
	// método para escrever na tela as informações do produto
	public void mostrarProduto() {
		System.out.printf("Produto: %s \n", nome);
		System.out.printf("Preço de compra: R$ %.2f \n", pCompra);
		System.out.printf("Preço de venda: R$ %.2f \n", pVenda);
		System.out.printf("------------------\n");
	}
	
	public static void main (String args[]) {
		
		Produto p1 = new Produto("Pepsi", 3.2f);
		Produto p2 = new Produto("Doritos", 8.49f);
	
		p1.mostrarProduto();
		p2.mostrarProduto();
	}
	
}
