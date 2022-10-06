package ProdutoDAO;

public class produtoDAO {

	// cria se um atributo estatico para pode ser acessado po qualquer classe do código
		public static final String[] names = { "vaso", "cortina", "vassoura", "caneca", "carrinho"};
		 

		
		
		
		
		
		public static AbstrataProduto  getCustomer(String name) {
			
		
			// utiliza o método para verificar se 2 strings sao iguais e comparar se algum nome 
			//pré definido é identico ao que esta na string de vetor
			
			for (int i = 0; i < names.length; i++) 
				if (names[i].equalsIgnoreCase(name)) 
					
					
					return new realProduto(name);			
			
			return new nullProduto();
		}
	
	
	
	
}
