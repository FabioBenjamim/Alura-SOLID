package br.com.alura.rh.model;

import java.math.BigDecimal;

public class DadosPessoais {
	
	public DadosPessoais(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	private String nome;
	private String cpf;
	private Cargo cargo;
	private BigDecimal salario;
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	protected void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public BigDecimal getSalario() {
		return salario;
	}
	
	protected void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
}
