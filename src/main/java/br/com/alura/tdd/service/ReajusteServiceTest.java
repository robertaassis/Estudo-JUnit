package main.java.br.com.alura.tdd.service;

import main.java.br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

// TDD - Implemento os testes antes de implementar os códigos
public class ReajusteServiceTest {

    @Test
    public void reajusteDeveriaSer3PorCentoDesempenhoADesejar(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
        // desempenho a desejar é reajuste de 3%, logo tem que estar valendo 1030
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSer10PorCentoDesempenhoModerado(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
        // desempenho a desejar é reajuste de 10%, logo tem que estar valendo 1100
        service.concederReajuste(funcionario, Desempenho.MODERADO);
        assertEquals(new BigDecimal("1100.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSer25PorCentoDesempenhoAlto(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
        // desempenho a desejar é reajuste de 25%, logo tem que estar valendo 1250
        service.concederReajuste(funcionario, Desempenho.ALTO);
        assertEquals(new BigDecimal("1250.00"), funcionario.getSalario());
    } 
}
