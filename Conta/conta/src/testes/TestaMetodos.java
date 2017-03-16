package testes;

import conta.Conta;

public class TestaMetodos {

	public static void main(String[] args) {
		// criando conta
		Conta minhaConta;
		minhaConta = new Conta();
		
		// alterando valores da conta
		minhaConta.dono = "Maximo";
		minhaConta.saldo = 1000.0;
		
		// saca 200
		minhaConta.saca(200);
		
		// deposita 500
		minhaConta.deposita(500);
		
		// exibe saldo da conta
		System.out.println("Saldo atual: " + minhaConta.saldo);

	}

}
