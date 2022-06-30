package dominio;

public class Pessoa {

	private String nome;
	private int idade;
	private String cpf;
	private int salario;

	public void setNome(String nome) {

		this.nome = nome;
		System.out.println("Nome: " + nome);
	}

	public void setIdade(int idade) {

		this.idade = idade;
		System.out.println("Idade: " + idade);
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
		System.out.println("CPF: " + cpf);
	}

	public void setSalario(int salario) {
		this.salario = salario;
		System.out.println("Salário: " + salario);

	}

}
