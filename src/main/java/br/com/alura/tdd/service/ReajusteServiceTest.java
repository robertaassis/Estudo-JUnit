package main.java.br.com.alura.tdd.service;

import main.java.br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

// TDD - Implemento os testes antes de implementar os códigos
public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionario;

    @BeforeEach // JUnit inicia esse método inicializar antes de cada teste; @BeforeAll deve ser static e inicia só uma vez antes dos testes
    public void inicializar(){
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
    }

    @Test
    public void reajusteDeveriaSer3PorCentoDesempenhoADesejar(){
        // desempenho a desejar é reajuste de 3%, logo tem que estar valendo 1030
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSer10PorCentoDesempenhoModerado(){
        // desempenho a desejar é reajuste de 10%, logo tem que estar valendo 1100
        service.concederReajuste(funcionario, Desempenho.MODERADO);
        assertEquals(new BigDecimal("1100.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSer25PorCentoDesempenhoAlto(){
        // desempenho a desejar é reajuste de 25%, logo tem que estar valendo 1250
        service.concederReajuste(funcionario, Desempenho.ALTO);
        assertEquals(new BigDecimal("1250.00"), funcionario.getSalario());
    }
}
