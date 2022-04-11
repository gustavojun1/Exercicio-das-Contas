package controle;

import utilidades.Data;

// extends: palavra reservada que indica a superclasse da classe em questão
public class ContaCorrente extends Conta {
	double taxa;
	public ContaCorrente(String numero, double saldo, Correntista correntista, Data abertura, Agencia agencia, double taxa) {
		super(numero, saldo, correntista, abertura, agencia);
		this.taxa = taxa;
	}
	
	@Override
	
	public boolean depositar(double quantia) {
		if(operacaoPossivel(this, quantia) && saldo >= quantia - taxa) {
			saldo += quantia - taxa;
			return true;
		}
		return false;
	}	
	
	public boolean sacar(double quantia) {
		if(operacaoPossivel(this, quantia) && saldo >= quantia + taxa) {
			saldo -= quantia + taxa;
			return true;
		}
		return false;
	}
	public boolean fazerTransferencia(Conta destino, double quantia) {
		if(operacaoPossivel(this, quantia) && saldo >= quantia + taxa) {
			saldo -= quantia + taxa;
			destino.setSaldo(destino.getSaldo() + quantia);
			return true;
		}
		return false;
	}
}