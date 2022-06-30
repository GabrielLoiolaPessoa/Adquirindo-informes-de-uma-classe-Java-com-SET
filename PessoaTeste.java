package testes;

import dominio.Pessoa;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Nome Funcionário");
		pessoa.setIdade(37);
		pessoa.setCpf("000.100.200-30");
		pessoa.setSalario(3000);

	}
}
