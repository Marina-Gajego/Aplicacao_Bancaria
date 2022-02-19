package entidade;
import java.util.Scanner;

public class Conta {
	Scanner sc = new Scanner(System.in);

	protected float saldo;
	protected int numero;
	
	public Conta() {
	}
	
    public Conta(float saldo_inicial, int numero) {
        this.numero = numero;
        saldo = saldo_inicial;
    }
    
    public float getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public int setNumero(int numero) {
        return this.numero = numero;
    }
    
    public void depositar(float valor) {
        this.saldo += valor;
    }
    
    public void saca(float valor, int i) {  
        if (this.saldo >= valor) {
        	if (i == 2) {
        		this.saldo = (float) ((this.saldo - valor) - (valor * 0.005));
                System.out.printf("Saldo: %.2f \n", this.saldo);
        	}else {
        		this.saldo -= valor;
                System.out.printf("Saldo: %.2f \n", this.saldo);
        	}
        }else {
        	System.out.printf("Saldo Insuficiente: \n", this.saldo);  
        }
    }

    public void transferencia(Conta_corrente cc, Conta_Poupanca cp, Conta_Investimento ci, float valor, int i) { 
    	int n;
        if (this.saldo >= valor) {
        	if(i == 2) {
        		this.saldo = (float) ((this.saldo - valor) - (valor * 0.005));
        		System.out.println("Deseja transferir para qual conta? 1 - Corrente | 3 - Investimento"); 
        	    n =  sc.nextInt();
        	    if(n == 1) {
        	    	cc.depositar(valor);
        	    }else if(n == 2) {
        	    	ci.depositar(valor);
        	    }
        	    System.out.println("TRANSFERENCIA REALIZADA COM SUCESSO!");
        	    System.out.println("Valor da transferencia: " + valor);
        	}else {
        		this.saldo -= valor;
                System.out.println("Deseja transferir para qual conta? 1 - Poupança | 2 - Investimento | 3 - Corrente"); 
                n =  sc.nextInt();
                if(n == 1) {
                	cp.depositar(valor);
                }else if(n == 2) {
                	ci.depositar(valor);
                }else {
                	cc.depositar(valor);
                }
                System.out.println("TRANSFERENCIA REALIZADA COM SUCESSO!");
                System.out.println("Valor da transferencia: " + valor);
        	}
        }else {
        	System.out.println("Saldo insuficiente!");
        }

    }
    
    public void investir(float valor) {
            this.saldo += valor;
            System.out.println("INVESTIMENTO REALIZADO COM SUCESSO!");
            System.out.println("Valor do investimento: " + valor);
    }
    
    public void consultar(int Tpessoa, int Tconta) {
    	if(Tpessoa == 2 && Tconta == 2) {
    		this.saldo += (float) (this.saldo * 0.02);
        	System.out.printf(String.format("\nSaldo Atual: %.2f\n", this.saldo));
    	}else{
        	System.out.printf(String.format("\nSaldo Atual%.2f\n", this.saldo));
    	}
    }
}
   
