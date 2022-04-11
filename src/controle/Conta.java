package controle;

import utilidades.Data;

public class Conta {

	private String numero;
	protected double saldo;
	private boolean atividade;
	private Correntista correntista;
	private Data abertura;
	private Agencia agencia;
	
	public Conta(String numero, double saldo, Correntista correntista, Data abertura, Agencia agencia) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.correntista = correntista;
		this.abertura = abertura;
		this.agencia = agencia;
		atividade = true;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Correntista getCorrentista() {
		return correntista;
	}
	
	public boolean operacaoPossivel(Conta c, double quantia) {
		return quantia > 0 && c.atividade ? true : false;
	}
	public boolean depositar(double quantia) {
		if(operacaoPossivel(this, quantia)) {
			saldo += quantia;
			return true;
		}
		return false;
	}	
	public boolean sacar(double quantia) {
		if(operacaoPossivel(this, quantia) && saldo >= quantia) {
			saldo -= quantia;
			return true;
		}
		return false;
	}
	// não usar "sacar" ou "depositar" nesse método
	public boolean fazerTransferencia(Conta destino, double quantia) {
		if(operacaoPossivel(this, quantia) && saldo >= quantia) {
			saldo += quantia;
			destino.setSaldo(destino.getSaldo() + quantia);
			return true;
		}
		return false;
	}
	public void desativarConta() {
		atividade = false;
	}
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", atividade=" + atividade + ", correntista="
				+ correntista + ", abertura=" + abertura + ", agencia=" + agencia + "]";
	}
}
