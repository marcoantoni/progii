class AppAluno{
	
	// criando um método para emitir o atestado de matricula, evitando repetições de código. Isso evitará que sejam criadas várias linhas similares a: 
	// System.out.printf("Certifico que %s, portador do CPF %s é aluno do curso %s", aluno1.getNome(), aluno1.getCpf(), aluno1.getCurso()); 
	// nesse exemplo, recebemos um argumento (al) que é do tipo Aluno
		
	public static void emitirAtestado(Aluno al){
		// exemplo de um atestado de matricula
		System.out.printf("ATESTADO DE MATRICULA \n");
		System.out.printf("Certifico que %s, portador do CPF %s é aluno do curso %s \n", al.getNome(), al.getCpf(), al.getCurso()); 
	}


	public static void main (String args[]) {
		
		// criando uma instancia da classe data para que ela seja passada como parametro na criação do Aluno1
		Data dt1 = new Data(12, 7, 2008);
		
		// criando um objeto da classe alunos
		Aluno aluno1 = new Aluno("Tiago", dt1, "Técnico em informática", "01234567891");
		
		
		/* Essa linha ilustra um problema do código (classe Aluno) não encapsulado: é possível burlar as regras de validação desenvolvidas no método construtor, atribuindo o valor "A" para o nome, que é inválido
		 * depois de encapsular os atributos como private, ao descomentar a linha abaixo, o código passa a dar erro de compilação, pois o encapsulamento impede o acesso direto ao atributo
		*/
		
		//aluno1.nome = "A";
		
		// caso queira alterar o nome do aluno, o mesmo deve ser feito através de um método especifico para isso: o método set
		aluno1.setNome("Thiago da Silva");
		
		
		aluno1.mostrarAluno();
		
		// criando uma instancia da classe data na hora de criar o Aluno2
		Aluno aluno2 = new Aluno("Andrei", new Data (28,3,2009), "Técnico em Informática", "98765432121");
			
		aluno2.mostrarAluno();
		
		
		/* aqui surge um problema: o "sistema" comprado por uma instituição não permite emitir um atestado de matricula, portanto, o programador deverá acrescentar uma nova funcionalidade 
		 * mas isso será feito sem modificar a classe Aluno
		 */
		
		// System.out.printf("ATESTADO DE MATRICULA \n");
		
		// usamos o getNome() para pegar o nome do aluno1 e assim por diante
		// System.out.printf("Certifico que %s, portador do CPF %s é aluno do curso %s", aluno1.getNome(), aluno1.getCpf(), aluno1.getCurso()); 
		
		emitirAtestado(aluno1);
		
		emitirAtestado(aluno2);
	}

}
