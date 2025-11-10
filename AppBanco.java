/* Este código serve para testar a classe ContaCorrente, não sendo necessário fazer alterações
 * Você pode modificar livremente esse código para testes, mas o funcinamento da classe ContaCorrente 
 * deve ser compatível com o criado aqui: o método construtor da classe ContaCorrente deve funcionar com o código criado aqui dentro, 
 * assim como os métodos mostrarExtrato, sacar e setLimite
 *
*/

class AppBanco {
	
	public static void main (String args[]) {
		
		Pessoa p1 = new Pessoa("Leila Rocha Souza", "213.911.532-51", new Data(23, 1, 1989) );
		
		ContaCorrente c1 = new ContaCorrente(p1, new Data(23, 1, 1989) );
		
		c1.mostrarExtrato();
		// deve mostrar algo como
		// Cliente: Leila Rocha Souza - Conta aberta em: 23/1/1989
		// Saldo disponível: 0,00 - Limite: 200,00 f
		
		c1.depositar(300); // deposita 300 reais. O saldo deverá ser igual a 300;

		c1.depositar(200); // deposita 200 reais. O saldo deverá ser igual a 500;
		
		c1.mostrarExtrato();
		
		c1.sacar(230); // saque de 230 reais. O saldo deverá ser igual a 270;
		
		c1.sacar(350); // saque de 350 reais. O saldo deverá ser igual a -80;
		
		c1.sacar(120); // saque de 120 reais. O saldo deverá ser igual a -200;
		
		c1.sacar(100); // saque de 100 reais. O saque não deve ser realizado, pois ultrapassa o limite disponível;
		
		c1.setLimite(400);	// aumentando o limite para 400 reais
		
		c1.sacar(100); // saque de 100 reais. Agora o saque deve ser realizado. O saldo deverá ser igual a -300 ;
		
		c1.mostrarExtrato();
		
		

		
	}
	
}
