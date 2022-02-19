package entidade;

public class PF extends Pessoa{
	
	protected String cpf;
	protected String rg;
	
    public PF() {
    }

	public PF(String nome, String endereco, String telefone, String cpf, String rg) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + " Endereco: " + getEndereco() + " Telefone: " + getTelefone() + " CPF: " + getCpf() + " RG: " + getRg();
	}
	
}
