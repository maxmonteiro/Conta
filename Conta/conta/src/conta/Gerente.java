package conta;

public class Gerente {
	String nome;
	String cpf;
	double salario;
	int senha;
	int numeroDeFuncionariosGerenciados;
	
	public boolean autentica(int senha){
		if(this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
}
