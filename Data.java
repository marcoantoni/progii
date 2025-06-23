class Data {
	// declaracao dos atributos da classe
	int dia;	// atributo que armazena o dia
	int mes;	// atributo que armazena o mes
	int ano;	// atributo que armazena o ano

	/* Os três atributos são obrigatórios */
	
	public Data (int dia, int mes, int ano) {
		// testando se o dia é está num interlado válido
		if (dia >= 1 && dia <= 31)
			this.dia = dia;
		else 
			System.out.printf("Dia inválido");
			
		if (mes >= 1 && mes <= 12)
			this.mes = mes;
		else 
			System.out.printf("Mês inválido");
		
		// segundo as regras de negócio, a classe não permitirá datas anteriores a 1900
		if (ano >= 1900) 
			this.ano = ano;
		else
			System.out.printf("Ano inválid");
	}
	
	// método para escrever a data de maneira abreviada
	public String escreverAbreviado() {
		// a linha abaixo não é mais necessária pois o método irá RETORNAR a uma string
		//System.out.printf("%d/%d/%d", dia, mes, ano);
		
		return dia + "/" + mes + "/" + ano;
	}
	
	
	// testando a classe
	
	public static void main(String args[]) {
		Data hoje = new Data (23, 6, 2025);
		
		System.out.printf("Hoje é %s \n", hoje.escreverAbreviado() );
		
		Data ferias = new Data(14, 7, 2025);
		
		System.out.printf("As férias começam em %s \n", 
			ferias.escreverAbreviado() );
			
		Data avaliacao = new Data (25, 8, 2025);
		
		System.out.printf("A avaliação de Programação será em %s \n", 
			avaliacao.escreverAbreviado() );
	}

	
}
