package conta;

public class TestaCliente {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		Cliente c = new Cliente();
		
		minhaConta.titular = c;
		minhaConta.titular.nome = "M�ximo";
		minhaConta.saldo = 1000.0;
		
		System.out.println(minhaConta.titular.nome);
		System.out.println("Saldo atual: " + minhaConta.saldo);
				
	}

}
