import java.sql.Date;

public class Venda  {

	


	// faço uma associação entre a tabela produto e venda, para realizar uma venda é necessario um produto
	
	private String dataLancamento ;
    private Produto produto;
	
    public Venda(String dataLancamento, Produto produto) {
		super();
		this.dataLancamento = dataLancamento;
		this.produto = produto;
	}

    
    
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
    
    
    
    
    
    

}
