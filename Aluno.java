import java.util.Scanner;	// para poder ler do teclado

class Aluno {
	// declarando os atributos da classe
	// todo aluno tem nome, cpf, data de nascimento e curso
	String nome;
	String nascimento;
	String curso;
	String cpf;
	
	// método para mostrar o aluno
	public void mostrarAluno(){
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Nascimento: %s \n", nascimento);
		System.out.printf("Curso: %s \n", curso);
		System.out.printf("CPF: %s \n", cpf);
		System.out.printf("_________________________\n");
	}
	
	// método responsável por ler as informações do teclado e armazená-las
	public void lerTeclado() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o nome do aluno: ");
		nome = sc.nextLine(); // lê uma string do teclado e armazena o valor no atributo nome
		
		System.out.printf("Informe a data de nascimento do aluno: ");
		nascimento = sc.nextLine();
		
		System.out.printf("Informe o curso do aluno: ");
		curso = sc.nextLine();
		
		System.out.printf("Informe o cpf do aluno: ");
		cpf = sc.nextLine();
	}
	
	public static void main (String args[]) {
		// criando um objeto da classe alunos
		Aluno aluno1 = new Aluno();
		
		//modificar os atributos do aluno1
		
		// comentando as linhas abaixo, pois os dados serão lidos do teclado
		/*
		aluno1.nome = "Arthur";
		aluno1.nascimento = "10/10/2010";
		aluno1.curso = "Técnico em informática";
		aluno1.cpf = "012.457.345-88";
		*/
		
		aluno1.lerTeclado();	// chamando o método que irá ler do teclado as informações
		
		// mostrando os dados do aluno
		aluno1.mostrarAluno();
		
		// criando um segundo aluno - Control C + Control V
		
		Aluno aluno2 = new Aluno(); // criando o segundo aluno
			
		aluno2.lerTeclado();
		
		// mostrando os dados do aluno
		aluno2.mostrarAluno();
	}
	
}
