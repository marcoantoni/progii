class Professor extends Pessoa {
	
	// declaração dos atributos da classe
	private String vinculo;
	private float salario;
	private int matricula;
	private int cargaHoraria;
	
	// método construtor da classe
	public Professor(String vinculo, int matricula, String nome, String cpf, Data nasc){
		
		// a referencia super chama o método construtor da superclasse
		super(nome, cpf, nasc);
		
		// chama o método resposável por validar e atribuir o vinculo do professor
		setVinculo(vinculo);
		
		// não estamos inicializando a matricula
		// desafio para casa: inicializá-la com um número aleatório - dessa forma, não será necessário receber ele no construtor
		
	}
	
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
	
	// criando o método setVinculo 
	public void setVinculo(String vinculo) {
		
		 if (vinculo == "20" || vinculo == "40" || 
			vinculo.equalsIgnoreCase("DE") || 
			vinculo.equalsIgnoreCase("horista") ) {
			
			this.vinculo = vinculo;
		} else {
			System.out.printf("É permitido apenas os vinculos: 20, 40, DE ou Horista");
		}
		
		// chama o método que irá calcular o salário de acordo com o vinculo do professor
		// fazemos isso para manter o salário sempre atualizado 
		calcularSalario();
	 }
	 
	 // criando o método setCargaHoraria
	 public void setCargaHoraria(int CH) {
		 if (CH > 0){
			 if (vinculo.equalsIgnoreCase("horista") ){
				this.cargaHoraria = CH;
				// ao trocar a carga horária, vamos recalcular o salário para não haver inconsistencias
				calcularSalario();
			} else {
				System.out.printf("Só pode ser alterada a carga horária para o professor horista\n");
			}
		 } else {
			 System.out.printf("Verifique a carga horária informada: deve ser maior que 0.\n");
		 }
	 }
	
	// método para calcular o salário 
	
	public void calcularSalario() {
		if (vinculo == "20") {
			this.salario = 3000f;
			this.cargaHoraria = 20;
		} else if (vinculo == "40") {
			this.salario = 4500f;
			this.cargaHoraria = 40;
		} else if (vinculo.equalsIgnoreCase("DE") ){
			this.salario = 6000f;
			this.cargaHoraria = 40;
		} else {
			// caso não seja alterada a carga horária, haverá incosistências no salárioa
			System.out.printf("Para o professor horista, informa a carga horária trabalhada \n");
			salario = 100f * cargaHoraria;
		}
	}
	
	// criando um método para testar
	
	public static void main(String args[]){
		
		Professor p1 = new Professor("40", 121012, "Sofia", 
			"123.432.234.48", new Data(14, 1, 1999) );
			
		// alterando a carga horária do professor
		p1.setCargaHoraria(118);	// não vai alterar a carga horária, pois o vinculo definido é de 40 horas
		
		
		p1.mostrarProfessor();
		
		// print no atributo nome
		//System.out.printf("Nome: %s \n", p1.nome() ); // isso funciona, pois o atributo na superclasse é protected
		//System.out.printf("Nome: %s \n", p1.getNome() );
		
	}
}
