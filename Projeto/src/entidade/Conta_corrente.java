package entidade;

public class Conta_corrente extends Conta{
		
	public Conta_corrente(float saldo_inicial, int numero) {
		super(saldo_inicial, numero);
		this.numero = numero;
        saldo = saldo_inicial;
	}

	public float getSaldo() {
		return this.saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public int setNumero(int numero) {
		return this.numero = numero;
	}
}

