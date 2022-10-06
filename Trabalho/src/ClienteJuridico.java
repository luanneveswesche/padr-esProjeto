import java.util.List;

public class ClienteJuridico  extends Desconto {

	// atributo do padrão estrategy
	private String nome;
	private String endereco;
	private String cnpj;
	private Produto produto;
     // atributos para o método hook
	
	private List<Double> valor;
	private CalcularGasto calc;
	
	
	
	
	
	public ClienteJuridico(String nome, String endereco, String cnpj, Produto produto, List<Double> valor,
			CalcularGasto calc) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.produto = produto;
		this.valor = valor;
		this.calc = calc;
	}





	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public List<Double> getValor() {
		return valor;
	}
	public void setValor(List<Double> valor) {
		this.valor = valor;
	}
	public CalcularGasto getCalc() {
		return calc;
	}
	public void setCalc(CalcularGasto calc) {
		this.calc = calc;
	}  


	// métodos para auxiliar no desconto
		

	// método para criar o desconto com o padrao hook
		@Override
		protected double descontoCompra() {
			double desconto = 0;
			
			desconto = produto.getValor() / 100 * 05;
			
			
			return desconto;
		}

		// método utilizado para retornar o valor liquido que o cliente vai pagar após o desconto

		public double despesas() {
			
			return produto.getValor() - descontoCompra();
			
			
			
			
		}








	
	
	
	
}
