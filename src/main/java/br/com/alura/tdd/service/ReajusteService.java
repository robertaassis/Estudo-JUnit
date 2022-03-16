package main.java.br.com.alura.tdd.service;

import main.java.br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho){
        // estratégia de reajuste que se varia de acordo com desempenho; REFATORADO
            BigDecimal percentual = desempenho.percentualReajuste();
            BigDecimal reajuste = funcionario.getSalario().multiply(percentual); // pega o reajuste baseado no salario
            // Ex: salario = 1000 e desempenho a desejar, percentual será 0.03 e reajuste será o salario multiplicado pelo percentual, ou seja 30
            funcionario.reajustarSalario(reajuste);
    }
}
