package testes;

import conta.Conta;

public class TestaConta {

	public static void main(String[] args) {
		// criando conta
		Conta minhaConta;
		minhaConta = new Conta();
		// alterando valores da conta
		minhaConta.dono  = "Maximo";
		minhaConta.saldo = 1000.0;
		// exibe saldo da conta
		System.out.println("Saldo atual: " + minhaConta.saldo);
	}
}
	


