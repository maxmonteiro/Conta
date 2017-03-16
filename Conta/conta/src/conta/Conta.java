package conta;

public class Conta {
	
	public int numero;
	public String dono;
	public double saldo;
	public double limite;
	public double salario;
	public Cliente titular;
	// ao instanciar uma conta, instancia um cliente tb
	// Cliente titular = new Cliente(); 
	
	/*
	void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	*/
	
	public boolean saca(double valor) {
		if(this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	/*
	void transfere(Conta destino, double valor) {
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
	*/
	
	public boolean transfere (Conta destino, double valor) {
		boolean retirada = this.saca(valor);
		if (retirada == false) {
			// sem saldo! não sacou
			return false;
		} else {
			// com saldo!
			destino.deposita(valor);
			return true;
		}

	}
	
	
	
	
	
	
	
	
}

