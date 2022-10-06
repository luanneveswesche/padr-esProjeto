import java.util.List;

public class ClienteFisico   extends Desconto {

	// atributo do padrão estrategy
	private String nome;
	private String endereco;
	private String cpf;
	private Produto produto;
	
	
     // atributos para o método hook
	
	private List<Double> valor;
	private CalcularGasto calc;
	



	public ClienteFisico(String nome, String endereco, String cpf, Produto produto, List<Double> valor,
			CalcularGasto calc) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
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
	public String getCpf() {
		return cpf;
	} 
	public void setCpf(String cpf) {
		this.cpf = cpf;
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







	// método para criar o desconto com o padrao hook
	@Override
	protected double descontoCompra() {
		double desconto = 0;
		
		desconto = produto.getValor() / 100 * 10;
		
		
		return desconto;
	}

	// método utilizado para retornar o valor liquido que o cliente vai pagar após o desconto

	public double despesas() {
		
		return produto.getValor() - descontoCompra();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
}
