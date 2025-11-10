public class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected Data nascimento;
	
	// método construtor
	// os atributos nome, cpf e nascimento serão obrigatórios
	public Pessoa(String nome, String cpf, Data nasc) {
		setNome(nome);
		setCPF(cpf);
		setNascimento(nasc);
	}
	
	/* Criação dos métodos sets para atribuir valores*/
	
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
	
	public void setCPF(String cpf) {
		// esse método só faz a atribuição sem validar
		this.cpf = cpf;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getCPF(){
		return cpf;
	}
	
	public Data getNascimento(){
		return nascimento;
	}
	
}
