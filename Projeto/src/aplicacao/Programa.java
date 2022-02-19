package aplicacao;
import java.util.Locale;
import java.util.Scanner;
import entidade.Banco;
import entidade.Conta_Investimento;
import entidade.Conta_Poupanca;
import entidade.Conta_corrente;
import entidade.PF;
import entidade.PJ;
import entidade.Pessoa;

public class Programa {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(new Locale("US"));
		Banco bc = new Banco();
		Conta_corrente cc = new Conta_corrente(100, 111);
		Conta_Poupanca cp = new Conta_Poupanca(100, 222);
		Conta_Investimento ci = new Conta_Investimento(100, 333);
		Pessoa pf = new PF();
		Pessoa pj = new PJ();
		
		int n;
	    bc.CriarConta();		
		System.out.println("\n");
	    if(bc.conta == 3) {
		 System.out.println("\n");
		 do {	 
			 bc.Menu();
			 n = sc.nextInt();
			 switch(n){
				 case 1:
					 cp.saca(30, bc.getTipo());
			     break;
			     
				 case 2:
					 cp.investir(100);
				 break;
				 
				 case 3:
					 System.out.println("APERTE O NUMERO 2 PARA INVESTIR");
				 break;
				 
				 case 4:
					 cp.transferencia(cc, cp, ci, 50, bc.getTipo());
				 break;
				 
				 case 5:
					 cp.consultar(bc.getTipo(), bc.getConta());
				 break;
				 
				 default:
					 System.out.println("A OPCAO NAO EXISTE");
				 }
			 System.out.println("Deseja continuar? 1 - sim | 2 - nao");
			 n = sc.nextInt();
			 System.out.println("\n\n\n");
		 }while(n == 1);
		 
	 }else if(bc.conta == 1) {
		 do {	 
			 bc.Menu();
			 n = sc.nextInt();
			 switch(n){
			 case 1:
				 cc.saca(30, bc.getTipo());
		     break;
		     
			 case 2:
				 cc.investir(100);
			 break;
			 
			 case 3:
				 cc.depositar(50);				 
			break;
			 
			 case 4:
				 cc.transferencia(cc, cp, ci, 50, bc.getTipo());
			 break;
			 
			 case 5:
				 cc.consultar(bc.getTipo(), bc.getConta());
			 break;
			 
			 default:
				 System.out.println("A OPCAO NAO EXISTE");
			 }
			 System.out.println("Deseja continuar? 1 - sim | 2 - nao");
			 n = sc.nextInt();
			 System.out.println("\n\n\n");
		 }while(n == 1);
		 
	 }else if(bc.conta == 2){
		 do {	 
			 bc.Menu();
			 n = sc.nextInt();
			 switch(n){
			 case 1:
				 ci.saca(30, bc.getTipo()); 
		     break;
		     
			 case 2:
				 ci.investir(100);
			 break;
			 
			 case 3:
				 ci.depositar(50);				 
			 break;
			 
			 case 4:
				 ci.transferencia(cc, cp, ci, 50, bc.getTipo());
			 break;
			 
			 case 5:
				 ci.consultar(bc.getTipo(), bc.getConta());
			 break;
			 
			 default:
				 System.out.println("A OPCAO NAO EXISTE");
			 }
			 System.out.println("\n");
			 System.out.println("Deseja continuar? 1 - sim | 2 - nao");
				 n = sc.nextInt();
			 }while(n == 1);
		}
	}
}
