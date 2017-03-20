package testes;

import conta.ContaPrivada;

public class TestaContaPrivada {

	public static void main(String[] args) {
		ContaPrivada maximo = new ContaPrivada(123, 1000.0, 500.0);
		
		System.out.println("nº conta: " + maximo.getNumero());
		System.out.println("limite: " + maximo.getLimite());
		System.out.println("saldo: " + maximo.getSaldo());
	}

}
