package main.java.br.com.alura.tdd.service;

import main.java.br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1")); // multiplica salario por 0.1
		if (valor.compareTo(new BigDecimal("1000")) > 0) { // se o valor for maior do que 1000
			valor = BigDecimal.ZERO; // altera o valor do bonus pra 0
		}
		return valor;
	}

}
