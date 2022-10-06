package Fornecedor;

public class Parada extends fornecedorMercadoria {

	// classe pause 69																																		Q
	// adiciona se um construtor e dois métodos abstratos
	
	public Parada(Fornecedor fornecedor) {
		super(fornecedor);
		System.out.println(" parei um poko na rodovia!!!");
		System.out.println("luan: " + getFornecedor().getEntrega().getName() + " esta pausado");

	}
	
	
	@Override
	public void paradoAndando() {
	
		getFornecedor().setState(new Entregando(getFornecedor()));
	}

	
		
	}
