class Livro {
	// declaração dos atributos
	String titulo;
	String genero;
	int nPaginas;
	Autor autor;	// exemplo de composição: a classe Autor possui os atributos nome, sobrenome e biografia, portanto, a instancia/objeto autor, possui esses dados

	public Livro(String titulo, String gen, int nPag, Autor autor){
		// sem validações por causa do horário da aula estar chegando ao fim
		// as validações pode ser nos moldes da classe Autor
		// só o número de página deveria ser maior que zero
		this.titulo = titulo;
		this.genero = gen;
		this.nPaginas = nPag;
		this.autor = autor;
	}
	
	// mostrar o livro
	public void mostrarLivro(){
		// exibindo os atributos do livro
		System.out.printf("Titulo: %s \n", titulo);
		System.out.printf("Genêro: %s \n", genero);
		System.out.printf("Quantidade de páginas: %d \n", nPaginas);
		
		// o método mostrarAutor exibe nome, sobrenome e biografia do autor
		autor.mostrarAutor();
	}
	
	public static void main(String args[]) {
		// criando um autor, responsável por escrever alguns livro
		Autor autor1 = new Autor("Dan", "Brown", "Dan Brown (nascido em 22 de junho de 1964, Exeter , New Hampshire , EUA) é um autor americano que escreveu romances bem pesquisados, centrados em organizações secretas e com enredos complexos.");
		
		// criando um livro
		Livro livro1 = new Livro("O código da vinci", "Romance / Suspense", 560, autor1);
		
		// criando outro livro
		Livro livro2 = new Livro("Anjos e demônios (Robert Langdon - Livro 1)", "Romance / Suspense", 480, autor1);

		// exibindo os dois livros
		livro1.mostrarLivro(); 
		livro2.mostrarLivro(); 
	}
	
	
}
