package conta;

public class ContaPrivada {
	private int numero;
	private double saldo;
	private double limite;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public ContaPrivada(int numero, double limite, double saldoInicial) {
		this.setNumero(numero);
		this.setSaldo(saldoInicial);
		this.setLimite(limite);
	}
}


