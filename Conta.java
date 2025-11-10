/* A classe Conta representa uma conta genérica de um cliente no banco.
 * Neste momento, ela **não possui métodos getters e setters** porque a ideia é
 * manter o controle total dos atributos apenas dentro da própria classe e das
 * classes derivadas (como ContaCorrente), evitando que o saldo ou as informações
 * do cliente sejam alteradas diretamente por código externo.
 * Essa decisão reforça o encapsulamento e prepara o código para o uso de herança.
*/

class Conta {
	
	protected Pessoa cliente;	// atributo do tipo Pessoa para representar o cliente
	protected Data aberturaConta;	// atributo para representar a data de abertura da Conta
	protected float saldo;	// saldo disponível na conta
	
	// método construtor;
	
	public Conta (Pessoa p1, Data abertura) {
		
		this.cliente = p1;	// inicializando o atributo cliente
		this.aberturaConta = abertura; // inicializando o atributo cliente
		
		this.saldo = 0f; // ao abrir uma conta, o saldo começa zerado
	}
	
	// qualquer conta permite fazer depositos, portantano, o método depositar está presente na superclase
	public void depositar (float valor) {
		
		if (valor > 0) {
			saldo += valor;
		} else {
			System.out.printf("Não foi possível realizar o depósito. Você está tentando depositar um valor inválido \n");
		}
	}	
}
