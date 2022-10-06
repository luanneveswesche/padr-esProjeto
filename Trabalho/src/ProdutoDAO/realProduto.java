package ProdutoDAO;

public class realProduto extends AbstrataProduto{

	
	private String name;
	
	public  realProduto  (String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	
	
	
	
	
	
}
