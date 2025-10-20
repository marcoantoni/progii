// correção do exercício de encapsulamento da classe Produto
public class Produto {
	private String nome;
	private float pCompra;
	private float pVenda;
	private int codBarras;
	
	public void setNome(String nome) {
		
		// regra para testar a quantidade de letras da string
		if (nome.length() >= 5){
			this.nome = nome;
		} else {
			System.out.printf("Nome de produto inválido\n");
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPCompra(float preco) {
		
		if (preco > 0) {
			pCompra = preco;
		} else {
			System.out.printf("Preço de compra inválido\n");
		}	
	}
	
	public float getPCompra() {
		return pCompra;
	}
	
	public void setPVenda(float preco) {
		
		if (preco > 0) {
			pVenda = preco;
		} else {
			System.out.printf("Preço de venda inválido\n");	
		}
	}
	
	public float getPVenda() {
		return pVenda;
	}
	
	// pelas regras de negócio, não haverá método get e set para o codBarras
	// o código de barras não irá mudar, portanto, não precisa um método para tal
	// não foi identificado nenhuma situação que justifique a necessidade de ter um médoto getCodBarras
	
	public Produto(String nome, float pCompra, int codBarras){
		
		setNome(nome);
		setPCompra(pCompra);
		
		// é a mesma coisa que a linha acima
		// setPVenda(pCompra * 1.3f);
		
		// resolução do bug: faltou a referencia this
		pVenda = this.pCompra * 1.3f;
		
		// validação do cod. barras
		
		if (codBarras > 0){
			this.codBarras = codBarras;
		} else {
			System.out.printf("Código de barras inválido\n");
		}
		
	}
	
	public void mostrar(){
		System.out.printf("Cód: %d - %S \n", codBarras, nome);
		
		// colocando uma mensagem diferente para quando foi exibir um preço inválido não mostrar o valor 0 (zero)
		if (pVenda > 0) {
			System.out.printf("Preço: R$ %.2f \n", pVenda);
		} else {
			System.out.printf("Preço: Não foi informado. \n");
		}
		
		System.out.printf("--------------\n");
	}
}
