package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {
	
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getDadosPessoais().getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		
		if (verificaReajuste(percentualReajuste)) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
	}
	
	
	public Boolean verificaReajuste(BigDecimal percentualReajuste) {
		return percentualReajuste.compareTo(new BigDecimal("0.4")) > 0;
	}

}
