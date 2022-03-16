package main.java.br.com.alura.tdd.service;

import org.junit.jupiter.api.Test;
import main.java.br.com.alura.tdd.modelo.Funcionario;
import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {
    @Test
    void bonusDeveriaSerErroParaSalarioAlto(){ // teste para que se o salario for alto, devolve exception
        BonusService service = new BonusService();
        assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("11000"))));
        // checa se o a expection que está devolvendo é um IllegalArgument e precisa de um lambda com o método para o segundo argumento

        // ABAIXO É OUTRA FORMA DE FAZER O ASSERTTHROWS
        /* try{
            service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("11000")));
            fail("Não gerou a exception"); // se entrar nessa linha, o teste falhou, porque já era pra jogar exception na linha de cima e cair direto no catch, nao nessa linha aqui//
        } catch(Exception e){ // é o que estou esperando; checa se a mensagem de falha é igual
            assertEquals("Funcionario com salário maior do que R$10000 não pode receber bônus!", e.getMessage());
        } */
    }

    @Test
    void bonusDeveriaSer10PorCentodoSalario(){ // teste para trazer o bonus de 10% do salario para salarios baixos
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));
        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    void bonusDeveriaSer1000(){ // meio termo
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000.00"), bonus);
    }

}
