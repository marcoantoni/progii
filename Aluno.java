import java.util.Scanner;	// para poder ler do teclado

class Aluno {
	// declarando os atributos da classe
	// todo aluno tem nome, cpf, data de nascimento e curso
	String nome;
	Data nascimento;	// o atributo nascimento é do tipo Data, ou seja, a classe criada anteriormente virou um atributo aqui na classe
	String curso;
	String cpf;
	
	// método para mostrar o aluno
	public void mostrarAluno(){
		
		if (nome != null)
			System.out.printf("Nome: %s \n", nome);
		else
			System.out.printf("Nome: Nome não preenchido \n");
		
		// chamando o método escreverAbreviado da classe Data para que seja exibida a Data no formato dd/mm/aaaa
		System.out.printf("Nascimento: %s \n", nascimento.escreverAbreviado() );
		
		System.out.printf("Curso: %s \n", curso);
		System.out.printf("CPF: %s \n", cpf);
		System.out.printf("_________________________\n");
	}
	
	// criação do método construtor da classe
	
	public Aluno(String nome, Data nascimento, String curso, String cpf) {
		
		// o nome para ser válido deve ter no mínimo duas letras
		if (nome.length() > 2){
			this.nome = nome;	// salvando o nome
		} else {
			System.out.printf("Nome inválido \n");
		}
		
		if (curso.length() > 10) {
			this.curso = curso;
		} else {
			System.out.printf("Curso inválido \n");
		}
		
		if (cpf.length() == 11) {
			this.cpf = cpf;
		} else {
			System.out.printf("CPF inválido \n");
		}
		
		// nascimento é um atributo do tipo Data
		this.nascimento = nascimento;	// armazena a data de nascimento
		
	}

	public static void main (String args[]) {
		
		// criando uma instancia da classe data para que ela seja passada como parametro na criação do Aluno1
		Data dt1 = new Data(41, 7, 2008);
		
		// criando um objeto da classe alunos
		Aluno aluno1 = new Aluno("", dt1, "Técnico em informática", "01234567891");
		
		aluno1.mostrarAluno();
		
		// criando uma instancia da classe data na hora de criar o Aluno2
		Aluno aluno2 = new Aluno("Andrei", new Data (28,3,2009), "Técnico em Informática", "98765432121");
			
		aluno2.mostrarAluno();
	}
	
}








