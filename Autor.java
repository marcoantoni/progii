class Autor{
	String nome;
	String sobrenome;
	String biografia;	// acrescentando um atributo que o enunciado não pediu
	
	public Autor(String nome, String sobr, String bio){
		// embora o exercício não pediu, é sempre bom colocar validações para assegurar que os dados estejam consistentes
		if (nome.length() > 2){
			this.nome = nome;
		} else {
			System.out.printf("Nome inválido \n");
		}
		
		if (sobr.length() > 4){
			this.sobrenome = sobr;
		} else {
			System.out.printf("Sobrenome inválido \n");
		}
		
		// a biografia não é obrigatória
		this.biografia = bio;
	}
	
	// escreve as informações do autor
	public void mostrarAutor(){
		// nome e sobrenome juntos - a ideia de ter atributos separados é para gerar um ficha catalógrafica, por exemplo
		System.out.printf("Nome: %s %s \n", nome, sobrenome);
		// exibibe a biografia, que é opcional
		System.out.printf("Biografia: \n%s\n", biografia);
	}
}
