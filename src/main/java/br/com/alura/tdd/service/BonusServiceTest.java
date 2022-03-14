package main.java.br.com.alura.tdd.service;

import org.junit.jupiter.api.Test;
import main.java.br.com.alura.tdd.modelo.Funcionario;
import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {
    @Test
    void bonusDeveriaSerZeroParaSalarioAlto(){ // teste para que se o salario for alto, zere ele
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("11000")));
        assertEquals(BigDecimal.ZERO, bonus);
    }

    void bonusDeveriaSer10PorCentodoSalario(){ // teste para trazer o bonus de 10% do salario para salarios baixos
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));
        assertEquals(250, bonus);
    }

    void bonusDeveriaSer1000(){ // meio termo
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));
        assertEquals(1000, bonus);
    }
}
