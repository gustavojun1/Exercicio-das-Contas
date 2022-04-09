package controle;

import utilidades.Data;

public class CriadorContas {
	public static Conta criarConta(double depositoInicial, Correntista correntista, String numero, Agencia agencia, Data abertura) {
		if(depositoInicial >= 200) {
			return new Conta(numero, depositoInicial, correntista, abertura, agencia);
		}
		return null;
	}
}
