package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {
	
	private List<ValidacaoReajuste> validacaoReajustes;
	
	public ReajusteService(List<ValidacaoReajuste> validcaoReajuste) {
		this.validacaoReajustes = validcaoReajuste;
	}
	
	public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
		validacaoReajusteSalario(funcionario, aumento);
		
		funcionario.atualizaSalario(aumento);
	}
	
	public void validacaoReajusteSalario(Funcionario funcionario, BigDecimal aumento) {
		this.validacaoReajustes.forEach(c -> c.validar(funcionario, aumento));
	}
}
