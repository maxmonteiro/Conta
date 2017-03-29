package testes;

import conta.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		// podemos chamar métodos do Funcionario:
		gerente.setNome("Máximo");
		
		// e também métodos do Gerente!
        gerente.setSenha(9876);
        
        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("senha: " + gerente.getSenha());
	}

}
