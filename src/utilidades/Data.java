package utilidades;

public class Data {

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	int dia;
	int mes;
	int ano;
	
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}
	
	public void setData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}	
	
	@Override
	public String toString() {
		return "Data = [dia = " + dia + ", mes = " + mes + ", ano = " + ano + "]";
	}
}
