package controle;

import utilidades.Data;

public class TesteContas {

	public static void main(String[] args) {
		Correntista Alberto = new Correntista("1234567890", "Alberto");
		Agencia Nubank1 = new Agencia("840", "Nubank");
		Conta conta1 = CriadorContas.criarConta(300, Alberto, "1", Nubank1, new Data(11, 2, 2003));
		Conta conta2 = CriadorContas.criarConta(500, Alberto, "2", Nubank1, new Data(25, 5, 1990));
		System.out.println(conta1.getSaldo() + " | " + conta2.getSaldo());
		conta1.fazerTransferencia(conta2, 200);
		System.out.println(conta1.getSaldo() + " | " + conta2.getSaldo());	
	}
	
}
