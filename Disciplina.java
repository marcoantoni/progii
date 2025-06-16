/* Classe disciplina, que permite representar as disciplinas que ocorrem dentro de uma escola */

class Disciplina {	// definição da classe
	// declaração dos atributos da classe.
	String professor;	// quem ministra a disciplina
	int horas;	// carga horária da disciplina - 2 períodos na semana 66 horas, 3 períodos na semana 100 horas
	int tipo;	// código para representar os grandes grupos, por exemplo, 1 - exatas, 2 - humanas, 3 - ciencias biológicas, 
	String nome; // nome da disciplina
	int ano;	// ano em que está inserida (1º, 2º, 3º ou 4º ano)

	// método responsável por imprimir as informações do componete
	public void mostrarDisciplina(){
		System.out.printf("Disciplina: %s \n", nome);	// exibe o nome da disciplina
		System.out.printf("Professor: %s \n", professor);	// exibe o do professor responsável pela disciplina
		System.out.printf("Ano: %dº ano - Carga horária: %d horas", ano, horas);	// exibe em qual ano e a carga horária da disciplina
		// TAREFA PARA FAZER EM CASA:  escrever o eixo da disicplina conforme o código (atributo tipo), conforme os códigos indicados acima
		
	}
	

	/* Método construtor da classe - tem o mesmo nome que a classe
	 * Sua função é inicializar os atributos da classe
	 * É necessário receber como parametro, os dados que irão ser realizados
	 * Não foi inicializado o tipo da disciplina, pois esta é uma TAREFA para ser feita em casa
	 */
	public Disciplina(String professorDis, int cHoraria, int anoCur, String disciplina){
			
			professor = professorDis;	// armazena o valor do parametro professorDis dentro do atributo professor
			horas = cHoraria;
			nome = disciplina;
			ano = anoCur;	
	}

	public static void main(String[] args){
		Disciplina progii = new Disciplina("Marco", 66, 2, "Programação II");	// cria uma disciplina
		
		Disciplina discPort = new Disciplina("Gustavo", 100, 2, "Lingua portuguesa e literatura"); // cria outra disciplina
		
		progii.mostrarDisciplina();	// mostra a primeira disciplina criada
		
		discPort.mostrarDisciplina();	// mostra a segunda disciplina criada
	}

}
