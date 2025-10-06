import java.util.Scanner;	// para poder ler do teclado

class Aluno {
	// declarando os atributos da classe
	// todo aluno tem nome, cpf, data de nascimento e curso
	// atributos foram encapsulados com o private, que é o modificador de acesso mais retritivo que existe.
	private String nome;
	private Data nascimento;	// o atributo nascimento é do tipo Data, ou seja, a classe criada anteriormente virou um atributo aqui na classe
	private String curso;
	private String cpf;
	
	/* criando os métodos sets para alterar os valores, pois a ideia é permitir que os atributos possam ser alterados posteriormente
	 * as regras de negócio de validação de cada atributo, ficam aqui dentro, do respectivo método set. Dentro do método construtor, chamamos o método 
	 * set para continua fazendo a atribuição do valor e reaproveitando os códigos
	 */
	
	// o método set sempre tem a seguinte estrutura: public + void + set + Nome_atributo. É recebido um parametro que corresponde ao tipo de dado armazenado pelo atributo
	public void setNome(String nome) {
		// o nome para ser válido deve ter no mínimo duas letras
		if (nome.length() > 2){
			this.nome = nome;	// salvando o nome
		} else {
			System.out.printf("Nome inválido \n");
		}
	}
	
	public void setNascimento(Data nasc) {
		// nascimento é um atributo do tipo Data
		this.nascimento = nasc;	// armazena a data de nascimento
	}
	
	public void setCurso(String curso) {
		if (curso.length() > 10) {
			this.curso = curso;
		} else {
			System.out.printf("Curso inválido \n");
		}
	}
	
	public void setCpf(String cpf){
		if (cpf.length() == 11) {
			this.cpf = cpf;
		} else {
			System.out.printf("CPF inválido \n");
		}
	}
	
	/* criando os métodos getts
	 * esses métodos tem a função de retornar os valores do atributo, portanto, não tem códigos dentro dele
	 * são criados com a seguinte estrutura: public + tipo do atributo (no caso, o nome é do tipo String) + get + Nome_atributo
	 * sempre possuem 1 linha de código: return atributo
	 */

	
	public String getNome(){
		return nome;
	}
	
	public Data getNascimento(){
		return nascimento;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	
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
		
		// removemos as regras de validação e simplismente chamamos os métodos sets correspondentes
		
		setNome(nome);
		
		setCurso(curso);
		
		setCpf(cpf);
		
		setNascimento(nascimento);
		
	}
	
}








