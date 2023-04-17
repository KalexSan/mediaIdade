package mediaIdade;

import java.time.LocalDate;
import java.util.Scanner;

public class CadastroPessoa {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Pessoa[] pessoas = new Pessoa[5];
		int  qtdPessoas = 0;
		boolean continuaCadastro = true;
		
		while (continuaCadastro && qtdPessoas < 5) {
		System.out.println("informe o nome da pessoa: ");
		String nome = entrada.nextLine();
		
		System.out.println("informe a data de nascimento: (dia/mes/ano)");
		String dataNascimento = entrada.nextLine();
		LocalDate dataNascimento = LocalDate.parse(dataNascimento, Pessoa.FORMATO_DATA);
		
		Pessoa pessoa = new Pessoa(nome, dataNascimento);
		pessoas[qtdPessoas] = pessoa;
		qtdPessoas++;
		
		System.out.println("deseja cadastrar outra pessoa? (s ou n)");
		String resposta = entrada.nextLine();
		if (resposta.equalsIgnoreCase("n")) {
			continuaCadastro = false;
		}
		
		}
		
	}

}
