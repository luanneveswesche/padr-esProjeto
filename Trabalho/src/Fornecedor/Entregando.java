package Fornecedor;

public class Entregando extends fornecedorMercadoria {
// CLASSE PLAYNG relacional
	
	
	
	public Entregando(Fornecedor fornecedor) {
		super(fornecedor);
		// método para redenrizar a rota 
		//System.out.println("fornecedor: agora estou entregando " + getFornecedor().getEntrega().getName());
	}

	@Override
	public void paradoAndando() {
		
		getFornecedor().setState(new Parada(getFornecedor()));
	
	
		
		
	}

	
	
	
	
	
	
	
		
}
