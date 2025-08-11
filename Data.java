class Data {
	// declaracao dos atributos da classe
	int dia;	// atributo que armazena o dia
	int mes;	// atributo que armazena o mes
	int ano;	// atributo que armazena o ano

	/* Os três atributos são obrigatórios */
	
	public Data (int dia, int mes, int ano) {
		
		if (mes >= 1 && mes <= 12){
			this.mes = mes;
		} else {
			System.out.printf("Mês inválido");
			this.mes = 1;	// inicializando o mes com um valor padrão caso seja inválido
		}
		
		// segundo as regras de negócio, a classe não permitirá datas anteriores a 1900
		if (ano >= 1900) {
			this.ano = ano;
		} else{
			System.out.printf("Ano inválid");
			this.ano = 1970;	// iniciando o ano com um valor padrão caso seja inválido
		}
		
		// para validar a quantidade de dias, primeiro é necessário o ano, pois o ano pode ser bissexto, e isso irá alterar a quantidade de dias de fevereirio.
		// depois é necessário validar o mês, para saber a quantidade de dias que ele tem
		
		int diasMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (ehBissexto() == true) {
			diasMes[2] = 29;	// quando o ano é bissexto, muda a quantidade de dias de fevereiro
		} else {
			diasMes[2] = 28;
		}
		
		if (dia >= 1 && dia <= diasMes[this.mes]){
			this.dia = dia;
		} else {
			System.out.printf("Dia inválido \n");
			this.dia = 1;  // inicializando o mes com um valor padrão caso seja inválido
		}
		
		
	
	}
	
	// método para escrever a data de maneira abreviada
	public String escreverAbreviado() {
		// a linha abaixo não é mais necessária pois o método irá RETORNAR a uma string
		//System.out.printf("%d/%d/%d", dia, mes, ano);
		
		return dia + "/" + mes + "/" + ano;
	}
	// método para escrever a data por extenso, no formato
	// 11 de agosto de 2025
	public String escreverPorExtenso(){
		String meses[] = {"", "janeiro", "fevereiro", "março",
			"abril", "maio", "junho", "julho", "agosto", "setembro",
			"outubro", "novembro", "dezembro"};
		
		// criando a mensagem de saida
		String saida = dia + " de " + meses[mes] + " de " + ano;
		
		return saida;
		
	}
	
	// criando um método para determinar se um ano é bissexto
	// explicação sobre os anos bissextos: 
	//https://brasilescola.uol.com.br/curiosidades/ano-bissexto.htm
	public boolean ehBissexto(){
		if ( (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
			// se isso for verdadeiro, o ano é bissexto
			return true;
		} else {
			return false;
		}	
	}
	
	
	// testando a classe
	
	public static void main(String args[]) {
		Data hoje = new Data (23, 6, 2025);
		
		System.out.printf("Hoje é %s \n", hoje.escreverPorExtenso() );
		
		Data ferias = new Data(12, 12, 2025);
		
		System.out.printf("As aulas terminam em %s \n", 
			ferias.escreverPorExtenso() );
			
		Data avaliacao = new Data (25, 8, 2025);
		
		System.out.printf("A avaliação de Programação será em %s \n", 
			avaliacao.escreverPorExtenso() );
			
		Data testeBissexto = new Data(29, 2, 2024);
		
		System.out.printf("%s ", testeBissexto.escreverAbreviado() );
	}

	
}
