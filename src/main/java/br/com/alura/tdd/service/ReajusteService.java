package main.java.br.com.alura.tdd.service;

import main.java.br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho){
        if (desempenho==Desempenho.A_DESEJAR) {
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
            funcionario.reajustarSalario(reajuste);
        }
        if (desempenho==Desempenho.MODERADO) {
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.1"));
            funcionario.reajustarSalario(reajuste);
        }
        if (desempenho==Desempenho.ALTO) {
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.25"));
            funcionario.reajustarSalario(reajuste);
        }

    }
}
