package Observer;

public class Empresa implements Observer {

	private String name;
    private String pagar;
    
	
	public Empresa(String name, String pagar) {
		super();
		this.name = name;
		this.pagar = pagar;
	}

	
	public void notify(Observable observable, String message) {
		// ira imprimir na tela
		System.out.println(name + " recebeu uma notificacao: " + observable + "  : " + message);
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPagar() {
		return pagar;
	}


	public void setPagar(String pagar) {
		this.pagar = pagar;
	}

	
	

	public void pagamento () {
		
		Service dinheiro = new Service("dinheiro");
		Service credito = new Service("cartão");
		Service debito = new Service("debito");
		
		Empresa cliente = new Empresa("whey", null);
		
		debito.addObserver(cliente);
		credito.addObserver(cliente);
		dinheiro.addObserver(cliente);
		
		
          if (getPagar() == "credito") {
			
			credito.notify("vc recebeu um pagamento no cartão de credito recebera conforme seu plano!!!(");
			
		} else if ( getPagar() == "debito" ) {
			
			debito.notify("vc recebeu um pagamento no cartão via debito recebera conforme seu plano!!!(");
		
		} else if ( getPagar() == "dinheiro" ) {
			
			dinheiro.notify("vc recebeu pagamento em dinheiro ja esta em conta!!!");
			
		}
		
		
		return   ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
