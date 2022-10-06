import java.util.List;

public class Juridica implements CalcularGasto {

	// cria se um atributo para a classe hook


	@Override
	public double gasto(List<Double> valor) {
		
		// faco um for para pegar todos os valores gastos pelo cliente juridico
		double soma = 0;
		
		for (Double taxa : valor ) {
			soma +=  taxa;
			
		}
		
		// retorna para soma os valores e multiplica um percentual em cima como margem para sinistro 
		return soma;
		
			
	}
}
	
	
	
	

