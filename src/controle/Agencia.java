package controle;

public class Agencia {

	public Agencia(String numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
	}

	private String numero;
	private String nome;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Agencia [nome = " + nome + ", numero = " + numero + "]";
	}
	
}
