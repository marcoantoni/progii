class AppTurma {

	public static void main(String args[]) {
		// criando alguns alunos para serem adicionados a turma
		Aluno al1 = new Aluno("Régis", new Data(5,1, 2008), 
			"Tec. em informática", "12345678910");
			
		Aluno al2 = new Aluno("Arthur Geske", new Data(25, 3, 2009),
			"Tec. em informática", "78912378911");
			
		Aluno al3 = new Aluno("Andrei", new Data(28, 3, 2009),
			"Tec. em informática", "78945612310");
			
		Aluno al4 = new Aluno("Nicolas", new Data(2, 2, 2008),
			"Tec. em informática", "78945612310");
			
		Aluno al5 = new Aluno("Sofia", new Data(16, 7, 2008),
			"Tec. em informática", "78945612310");
			
		// criando uma turma (um array de objetos do tipo Aluno)
		Aluno turma[] = new Aluno[40];	// o array pode armazenar 40 alunos
		// na hora de criar um array, se não for passar os valores, é necessário especificar o tamanho
		
		// adicionando os alunos na turma
		turma[0] = al1; // adicionando o aluno1
		turma[1] = al2;	// adicionando o aluno2
		turma[2] = al3;	// adicionando o aluno3
		turma[3] = al4;	// adicionando o aluno4
		turma[4] = al5;	// adicionando o aluno5
		
		// criando um laço de repetição para exibir os alunos
		
		// turma.length retorna a quantidade de elementos do array
		for (int i = 0; i < turma.length; i++){
			// validação para não mostrar nenhum erro na hora de executar
			// só vai tentar mostrar o aluno, caso tenho algo armazenado no array
			if (turma[i] != null){
				turma[i].mostrarAluno();
			}
		}
		
		
		
	}

}
