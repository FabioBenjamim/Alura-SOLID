package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.rh.ValidacaoException;

public class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public void promover(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo);
	}
	
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}
	
	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}
	
	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
	}
	
	public void atualizaSalario(BigDecimal aumento) {
		this.dadosPessoais.setSalario(this.dadosPessoais.getSalario().add(aumento));
		this.dataUltimoReajuste = LocalDate.now();
	}
}