package conta;

public class TestaSaque {

	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		
		// alterando valores da conta
		minhaConta.dono = "Maximo";
		minhaConta.saldo = 1000.0;
		
		if (minhaConta.saca(2000)) {
		    System.out.println("Consegui sacar");
		} else {
		    System.out.println("Saldo insuficiente");
		}


	}

}
