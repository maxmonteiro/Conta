package testes;

import conta.Conta;

public class TestaDuasContas {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.deposita(200);
		
		Conta c2 = new Conta();
		c2.deposita(400);
		
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);

	}

}
