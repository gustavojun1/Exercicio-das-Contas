package controle;

public class Correntista {

	public Correntista(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}

	String cpf;
	String nome;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Correntista [cpf=" + cpf + ", nome=" + nome + "]";
	}
}
