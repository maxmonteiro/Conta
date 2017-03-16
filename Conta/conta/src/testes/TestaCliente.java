package testes;

import conta.Cliente;
import conta.Conta;

public class TestaCliente {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		Cliente c = new Cliente();
		
		minhaConta.titular = c;
		minhaConta.titular.nome = "Máximo";
		minhaConta.saldo = 1000.0;
		
		System.out.println(minhaConta.titular.nome);
		System.out.println("Saldo atual: " + minhaConta.saldo);
				
	}

}
