package Calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTestes{

    @Test // anotação do JUnit
    public void deveriaSomarDoisNumerosPos(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3,7);

        Assertions.assertEquals(10, soma); // o primeiro é qual valor deveria ser e o segundo é qual será comparado
    }
}