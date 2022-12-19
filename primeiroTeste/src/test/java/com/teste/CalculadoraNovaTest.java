package com.teste;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraNovaTest {
    @Test
    public void deveSomarDoisValores(){
        int valor1 = 1;
        int valor2 = 2;

        CalculadoraNova calculadoraNova = new CalculadoraNova();
        int somar = calculadoraNova.somar(valor1, valor2);

        assertEquals(3, somar);
    }

    @Test
    public void deveSomarTresValores(){
        int valor1 = 1;
        int valor2 = 2;
        int valor3 = 3;

        CalculadoraNova calculadoraNova = new CalculadoraNova();
        int somar = calculadoraNova.somar(valor1, valor2, valor3);

        assertEquals(6, somar);
    }
}
