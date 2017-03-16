package conta;

public class TestaTransfere {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.saldo = 1000;
		
		Conta c2 =  new Conta();
		c2.saldo = 500;
		
		System.out.println("Saldo anterior conta 1: " + c1.saldo);
		System.out.println("Saldo anterior conta 2: " + c2.saldo);
		System.out.println("");
		
		double valor = 200;
		c1.transfere(c2, valor);
		System.out.println("Valor transferido: " + valor) ;		
		System.out.println("Novo saldo conta 1: " + c1.saldo);
		System.out.println("Novo saldo conta 2: " + c2.saldo);

	}

}
