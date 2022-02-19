package entidade;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco extends Conta{
	Scanner sc = new Scanner(System.in);
	List<Pessoa> lista = new ArrayList<>();

	public int tipo;
	public int conta;

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getConta() {
		return conta;
	}

	public int setConta(int conta) {
		this.conta = conta;
		return 1;
	}
	
	int n;
	int tipoP;
	public void CriarConta() {
		tipoP = Cadastro(conta);
		System.out.println("|------------------------------|");
		System.out.println("| 1- CONTA CORRENTE            |");
		System.out.println("| 2- CONTA INVESTIMENTO        |");
		System.out.println("| 3- CONTA POUPAN�A            |");
		System.out.println("|------------------------------|");
		System.out.println("");
		System.out.println("Selecione a opera��o desejada: ");
		n = sc.nextInt();
		conta = n;
		switch (n) {
			case 1:
				Conta_corrente cc = new Conta_corrente(100, 111);
				System.out.println("CONTA CORRENTE CRIADA");
			break;
				
			case 2:
				Conta_Investimento ci = new Conta_Investimento(100, 222);
				System.out.println("CONTA INVESTIMENTO CRIADA");
			break;
			
			case 3:
				if(tipo == 2) {
					System.out.println("Cliente PJ n�o pode abrir conta poupan�a");
					System.exit(0);
				}else {
					Conta_Poupanca cp = new Conta_Poupanca(100, 333);
					System.out.println("CONTA POUPAN�A CRIADA");
				}
			break;
			 default:
				 System.out.println("A OP��O N�O EXISTE");
				 System.exit(0);
		}
	}
	
	public int Cadastro(int tipo) {
		System.out.println("Cliente Pessoa Fisica ou Juridica? 1 - PF | 2 - PJ");
		tipo = sc.nextInt();
		if(tipo == 1) {
			sc.nextLine();
			System.out.println("Nome:");
            String nome = sc.nextLine();
            System.out.println("Endereco:");
            String endereco = sc.nextLine();
            System.out.println("Telefone:");
            String telefone = sc.nextLine();
            System.out.println("CPF:");
            String cpf = sc.nextLine();
            System.out.println("RG:");
            String rg = sc.nextLine();
            PF pessoaF = new PF(nome, endereco, telefone, cpf, rg);
            lista.add(pessoaF);
            System.out.println(pessoaF);
            setTipo(tipo);
		}else if(tipo == 2){
			sc.nextLine();
			System.out.println("Nome:");
            String nome = sc.nextLine();
            System.out.println("Endereco:");
            String endereco = sc.nextLine();
            System.out.println("Telefone:");
            String telefone = sc.nextLine();
            System.out.println("CNPJ:");
            String cnpj = sc.nextLine();
            System.out.println("Inscricao estadual:");
            String inscricao_estadual = sc.nextLine();		
            PJ PessoaJ= new PJ(nome, endereco, telefone, cnpj, inscricao_estadual);
            lista.add(PessoaJ);
            System.out.println(PessoaJ);
            setTipo(tipo);
       }
		return tipo;
	}
	public void Menu() {
		 System.out.println("|------------ MENU ------------|");
		 System.out.println("| 1- SAQUE                     |");
		 System.out.println("| 2- INVESTIR                  |");
		 System.out.println("| 3- DEPOSITAR                 |");
		 System.out.println("| 4- TRANSFER�NCIA             |");
		 System.out.println("| 5- CONSULTAR SALDO           |");
		 System.out.println("|------------------------------|");
		 System.out.println("");
		 System.out.printf("Selecione a opera��o desejada: ");
	}
}

