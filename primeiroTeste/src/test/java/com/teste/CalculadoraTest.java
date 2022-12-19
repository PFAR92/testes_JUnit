package com.teste;

import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {

    public void testSomar() {
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar("1+1+3");
        assertEquals(5, soma);
    }
}