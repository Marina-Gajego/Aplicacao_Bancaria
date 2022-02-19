package entidade;

public class PJ extends Pessoa{
	
	protected String cnpj;
	protected String inscricao_estadual;
	
    public PJ() {
    }

	public PJ(String nome, String endereco, String telefone, String cnpj, String inscricao_estadual) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.inscricao_estadual = inscricao_estadual;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricao_estadual() {
		return inscricao_estadual;
	}

	public void setInscricao_estadual(String inscricao_estadual) {
		this.inscricao_estadual = inscricao_estadual;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " Endereco: " + getEndereco() + " Telefone: " + getTelefone() + " CNPJ: " + getCnpj() + " Inscricao Estadual: " + getInscricao_estadual();
	}
}
