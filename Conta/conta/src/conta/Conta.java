package conta;

public class Conta {
	
	int numero;
	String dono;
	double saldo;
	double limite;
	double salario;
	Cliente titular;
	// ao instanciar uma conta, instancia um cliente tb
	// Cliente titular = new Cliente(); 
	
	/*
	void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	*/
	
	boolean saca(double valor) {
		if(this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	/*
	void transfere(Conta destino, double valor) {
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
	*/
	
	boolean transfere (Conta destino, double valor) {
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

