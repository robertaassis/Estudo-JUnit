package main.java.br.com.alura.tdd.service;

import java.math.BigDecimal;

public enum Desempenho {
    A_DESEJAR{
        @Override
        public BigDecimal percentualReajuste(){
            return new BigDecimal("0.03");
        }
    },
    MODERADO{
        @Override
        public BigDecimal percentualReajuste(){
            return new BigDecimal("0.1");
        }
    },
    ALTO{
        @Override
        public BigDecimal percentualReajuste(){
            return new BigDecimal("0.25");
        }
    };

    public abstract BigDecimal percentualReajuste();
}
