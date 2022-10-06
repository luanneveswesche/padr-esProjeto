import java.util.List;

public class Fisica  implements CalcularGasto {

	
	


	@Override
	public double gasto(List<Double> valor) {
	 
		double soma = 0 ;
		 for ( Double taxa : valor ) {
			 
			 soma += taxa;
		 }
		 // cria se um for para contabilizar todos os gastos e em seguida um acrescimo para equalizar margem de perda com eventuais sinistros
		 
		return soma;
		
	}

	
	}

	
	
	
	
	
