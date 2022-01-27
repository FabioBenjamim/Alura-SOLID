package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
	
	public void promover(Funcionario funcionario, Boolean metaBatida) {
		Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
		if(verificaCargoIgualGerente(funcionario)) {
			throw new ValidacaoException("Gerentes n�o podem ser promovidos");
		}
		
		if(metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionario n�o bateu a meta");
		}
	}
	
	public Boolean verificaCargoIgualGerente(Funcionario funcionario){
		return Cargo.GERENTE.equals(funcionario.getDadosPessoais().getCargo());
	}

}
