package testes;

import conta.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		// podemos chamar m�todos do Funcionario:
		gerente.setNome("M�ximo");
		
		// e tamb�m m�todos do Gerente!
        gerente.setSenha(9876);
        
        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("senha: " + gerente.getSenha());
	}

}
