package com.everis.calculadorasimples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Copyright (c) 2021 everis Brasil under MIT License
 * 
 * Testes unitários para a classe Calculadora da package calculadorasimples
 */
public class CalculadoraTest {
    static Calculadora calculadora;

    @BeforeAll
    public static void setup() {
        calculadora = new Calculadora();
    }

    @Test
    public void deveResultarQuatroAoSomarDoisEDois() {
        assertEquals(4.0, calculadora.soma(2,2));
    }

    @Test
    public void deveResultarZeroAoSomarDoisEMenosDois() {
        assertEquals(0.0, calculadora.soma(2,-2));
    }


}
