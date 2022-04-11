package controle;

import utilidades.Data;

public class TesteContas {

	public static void main(String[] args) {
		Correntista Jun = new Correntista("1234567890", "Jun");
		Correntista Mamae = new Correntista("0987654321", "Mamae");
		Agencia Nubank = new Agencia("123", "Nubank");
		Agencia Bradesco = new Agencia("456", "Bradesco");
		Conta Conta_do_Jun = new ContaCorrente("111", 500, Jun, new Data(01, 02, 2022), Nubank, 15);
		Conta Conta_da_Mamae = new ContaCorrente("222", 1000, Mamae, new Data(31, 12, 2022), Bradesco, 5);
		
		System.out.println("Saldo do " + Conta_do_Jun.getCorrentista().nome + ": " + Conta_do_Jun.getSaldo());
		System.out.println("Saldo da " + Conta_da_Mamae.getCorrentista().nome + ": " + Conta_da_Mamae.getSaldo());
		
		Conta_da_Mamae.fazerTransferencia(Conta_do_Jun, 200);
//		Conta_do_Jun.fazerTransferencia(Conta_da_Mamae, 300);
		
		System.out.println("Saldo do " + Conta_do_Jun.getCorrentista().nome + ": " + Conta_do_Jun.getSaldo());
		System.out.println("Saldo da " + Conta_da_Mamae.getCorrentista().nome + ": " + Conta_da_Mamae.getSaldo());
	}
	
}
