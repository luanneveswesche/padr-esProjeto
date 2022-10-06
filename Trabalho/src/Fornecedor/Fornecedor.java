package Fornecedor;

public class Fornecedor {
//classe player
	
	private Entrega entrega;
	private fornecedorMercadoria state;

	
	
	public Fornecedor() {
		super();
		this.state = new Vazio(this);
	}
	
	public void paradoAndando() {
		state.paradoAndando();
	}
	
	

	public Entrega getEntrega() {
		return entrega;
	}

	
	
	
// método para receber uma play lista das entregas
	
	public void setE(Entrega listaEntrega) {
		this.entrega  = listaEntrega;
		this.setState(new Parada(this));
	}

	public fornecedorMercadoria getState() {
		return state;
	}

	public void setState(fornecedorMercadoria state) {
		this.state = state;
	}

	
	
}
