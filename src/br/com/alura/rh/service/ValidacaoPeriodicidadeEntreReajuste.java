package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodicidadeEntreReajuste implements ValidacaoReajuste{
	
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		LocalDate dataDoUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		long mesesDoUltimoReajuste = ChronoUnit.MONTHS.between(dataDoUltimoReajuste, dataAtual);
		
		if(verificaUltimaDataDoReajuste(mesesDoUltimoReajuste)) {
			throw new ValidacaoException("Intervalo entre reajuste não pode ser menor que 6 meses");
		}
	}
	
	public Boolean verificaUltimaDataDoReajuste(Long mesesDoUltimoReajuste) {
		return mesesDoUltimoReajuste > 6;
	}

}
