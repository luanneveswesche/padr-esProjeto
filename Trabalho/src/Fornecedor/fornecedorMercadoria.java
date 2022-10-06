package Fornecedor;

public abstract class fornecedorMercadoria {
// método abstrato
	
	private Fornecedor fornecedor;

	public fornecedorMercadoria(Fornecedor fornecedor) {
		super();
		this.fornecedor = fornecedor;
	}

	// métodos para retornar get e sets

	public abstract void paradoAndando();

	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	
	
	
	
	
	
	
	
	
	/*
	 * private Player player;
	 * 
	 * public PlayerState(Player player) { super(); this.player = player; }
	 * 
	 * public abstract void playPause();
	 * 
	 * public abstract void reset();
	 * 
	 * 
	 * 
	 * // dois metodos get e setter public Player getPlayer() { return player; }
	 * 
	 * public void setPlayer(Player player) { this.player = player; }
	 */
}
