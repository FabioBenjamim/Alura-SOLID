package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Tercerizado {
	
	private DadosPessoais dadosPessoais;

	public Tercerizado(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
	}
	
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

}
