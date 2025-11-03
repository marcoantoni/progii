class Professor extends Pessoa {
	
	// declaração dos atributos da classe
	private String vinculo;
	private float salario;
	private int matricula;
	private int cargaHoraria;
	
	// criando um método para mostrar
	public void mostrarProfessor() {
		// mostrando os atributos que estão na classe Pessoa
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Nascimento: %s \n", 
			nascimento.escreverPorExtenso() );
			
		// mostrando os atributos criados na classe Professor
		System.out.printf("Vinculo: %s \n", vinculo);
		System.out.printf("Salário: %.2f \n", salario);
		System.out.printf("Matrícula: %d \n", matricula);
		System.out.printf("Carga horária: %d \n", cargaHoraria);
		
	} 
	
	// criando um método para testar
	
	public static void main(String args[]){
		
		Professor p1 = new Professor();
		
		// o código está sem um método construtor, por isso é necessário inicializar os atributos de maneira manual
		// já que a superclasse possui os métodos setters, vamos usar ele para atribuir os valore 
		 
		p1.setNome("Sofia");
		p1.setCPF("123.432.234.48");
		p1.setNascimento(new Data(14, 1, 1999) );
		
		// inicializando diretamente os atributos da classe Professor
		// lembrar que acessar os atributos de maneira direta não é o recomendado.
		p1.vinculo = "40 horas";
		p1.salario = 4123.89f;
		p1.matricula = 1210393;
		p1.cargaHoraria = 40;
		
		p1.mostrarProfessor();
		
		// print no atributo nome
		//System.out.printf("Nome: %s \n", p1.nome() ); // isso funciona, pois o atributo na superclasse é protected
		//System.out.printf("Nome: %s \n", p1.getNome() );
		
	}
}
