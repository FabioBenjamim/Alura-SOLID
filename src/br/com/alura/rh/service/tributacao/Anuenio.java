package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anuenio implements Reajuste {
	
	private BigDecimal valor;
	private LocalDate data;
	
	public Anuenio(BigDecimal valor) {
		this.valor = valor;
		this.data = LocalDate.now(); 
	}

	@Override
	public BigDecimal valor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDate data() {
		// TODO Auto-generated method stub
		return null;
	}

}
