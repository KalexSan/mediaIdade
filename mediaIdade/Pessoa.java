package mediaIdade;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	public static final String FORMATO_DATA = "dd/MM/yyyy";
	
	private String nome;
	private LocalDate  dataNascimento;
	
	public Pessoa(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento.format(FORMATO_DATA) + "]";
	}
	
	
}