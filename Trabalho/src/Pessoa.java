import java.util.List;

public abstract class Pessoa {
	
	
	private String nome;
	private String endereco;
	// cria se um atributo para desconto 
	
	
	
	// crio um construtor para a classe abstrata
	public Pessoa(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		
	}
	
	
	// método com resultado retornando método abstrato
	
	
	
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
	
	
	
	
}
