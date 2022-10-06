import java.util.List;

public class Resultado  {

	// destaco os atributos que a classe recebe para ser instanciada na classe main 
	private Venda venda;
	private List<Double> valor;
	private CalcularGasto calc;
	
	
	
	public Resultado(Venda venda, List<Double> valor, CalcularGasto calc) {
		super();
		this.venda = venda;
		this.valor = valor;
		this.calc = calc;
	}
	
	
	// método para calcular gastos padrão  strategy
	public double valorTotal() {
		return calc.gasto(valor);
	}
	
	/*
	 * getObservers().add(observer);
	 * 
	 * 
	 */
	
	
	
	
	// método criado com uma associação da classe abstrata Pessoa
	
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
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
	
		
	
}
