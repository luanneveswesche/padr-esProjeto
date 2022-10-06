import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Fornecedor.Entrega;
import Fornecedor.Entregando;
import Fornecedor.Fornecedor;
import Fornecedor.Parada;
import Observer.Empresa;
import ProdutoDAO.AbstrataProduto;
import ProdutoDAO.produtoDAO;
import ProdutoDAO.realProduto;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in). useLocale(Locale.US);
		
		
		// crio os objetos referente a cada classe e instancio
		Produto pro = new Produto(null, 0);
		Venda ve = new Venda(null, null);
		List<Double> valor = new ArrayList<Double>();
		ClienteFisico fi = new ClienteFisico(null, null, null, pro, valor, null);
		ClienteJuridico ju = new ClienteJuridico(null, null, null, pro, valor, null);
		
		// classe de real fornecedor
		realProduto rea = new realProduto(null);
		produtoDAO f = new produtoDAO();
		// inicio a classe resulatdo para mostrar a finalizacao do codigo de uma pessoa
		// fisica

		Resultado re = new Resultado(ve, valor, new Fisica());
		Resultado re1 = new Resultado(ve, valor, new Juridica());
		
		
		// método observer
		Empresa en = new Empresa("whey", "debito");
		
		
		
		while (true ) {
			
			
			
			System.out.println("LOJA WHEY");

			System.out.println("\n1- para cadastrar uma venda fisica!" 
								+ "\n2para cadastrar uma venda juridica!"
								 + "\n3-para consultar Produto!"
								  +"\n4-para consultar um fornecedor!"
								 	+"\n5-para sair do programa!!!");
			
			System.out.println();
			
			int z = sc.nextInt();
			
			switch (z) {

			case 1:
				

				System.out.println("produto adquirido: ");
				pro.setNome(sc.next());
				System.out.println("valor do produto: ");
				pro.setValor(sc.nextDouble());
				System.out.println("digite o nome do cliente: ");
				fi.setNome(sc.next());
				System.out.println("cidade: ");
				fi.setEndereco(sc.next());
				System.out.println("cpf: ");
				fi.setCpf(sc.next());
				//System.out.println("adquiriu em compras o valor : ");
				//re.getValor().add(sc.nextDouble());
				
				
				System.out.println();
				System.out.println("PRODUTO: " + pro.getNome());
		      //System.out.println("VALOR: " + re.valorTotal());
				System.out.println("CLIENTE: " + fi.getNome());
				System.out.println("CIDADE: " + fi.getEndereco());
				System.out.println("CPF: " + fi.getCpf());
				System.out.println("DESCONTO CLIENTE FISICO: " + fi.descontoCompra());
				System.out.println("TOTAL DA COMPRA: " + fi.despesas());
				System.out.println();
				break;

			case 2:

				System.out.println("produto adquirido: ");
				pro.setNome(sc.next());
				System.out.println("valor do produto: ");
				pro.setValor(sc.nextDouble());
				System.out.println();
				System.out.println("digite o nome do cliente: ");
				ju.setNome(sc.next());
				System.out.println("cidade: ");
				ju.setEndereco(sc.next());
				System.out.println("cnpj: ");
				ju.setCnpj(sc.next());
				//System.out.println("adquiriu em compras o valor : ");
				//re.getValor().add(sc.nextDouble());
				
				System.out.println();
				System.out.println("PRODUTO: " + pro.getNome());
				//System.out.println("VALOR: " + pro.getValor());
				System.out.println("cliente: " + ju.getNome());
				System.out.println("CLIENTE: " + ju.getEndereco());
				System.out.println("CNPJ: " + ju.getCnpj());
				System.out.println("DESCONTO CLIENTE JURIDICO: " + ju.descontoCompra());
				System.out.println("TOTAL DA COMPRA: " + ju.despesas());
				System.out.println();

				break;
				
			case 3:
				
				

				System.out.println(" PRODUTOS!!! ");
				
				
				
				System.out.println("\n1-para consultar "
									+"\n2-para sair");
				int opc= sc.nextInt();
				// crio uma condicao pra dechar pre definido se o produto ja esta na lista de nulo ou não
				
				if (opc == 1) {
					
				
				AbstrataProduto produto1 = produtoDAO.getCustomer("vaso");
				AbstrataProduto produto2 = produtoDAO.getCustomer("caminhao");
				
				System.out.println("produto encontrado: " + produto1.getName() + "dentro de sua relação de estoque");
				System.out.println(produto2.getName());
				} else {
					
					System.out.println("saindo de relações de produto!!!");
					
					
				}
				break;
				
				
			case 4:
				
				
				System.out.println("digite o que deseja!!!");
				
				
				System.out.println("\n1-para consulta situação atual do fornecedor!!!"
									+"\n2-para saber se esta com mercadoria!!!"
									  + "\n3-como esta situação da carga nesse momento!!!"
									    + " onde esta o fornecedor nesse momento!!!");
				
				
				int opcao = sc.nextInt();
					
				if ( opcao == 1) {
					Fornecedor forte = new Fornecedor();
				    
				
				}
				else if (opcao == 2){
					
					Fornecedor forte = new Fornecedor();
					forte.paradoAndando();
					
			
				} else if (opcao == 3 ) {
					Entrega ent = new Entrega("atualmente esta realizando entregas no estado do parana!!!" );
					
					System.out.println(ent.getName() );
					
				}else if ( opcao == 4 ) {
					
					
					Parada pa = new Parada(new Fornecedor());
					
				}
				
				
			case 5:
				
				
				
				en.pagamento();
				
				
				
				
				/*
				System.out.println("vai pagar com que maneira: ");
				en.setPagar(sc.next());
				
				
			
					
					if (en.getPagar() == "credito" )	{
						
						en.pagamento();
						
					} else if ( en.getPagar() == "dinheiro") {
						en.pagamento();
					
					} else if (en.getPagar() == "debito") {
				
				      en.pagamento();
				
					}*/
				
				break;
			}
			
			
			
			System.out.println();
			
		}

	}

}
