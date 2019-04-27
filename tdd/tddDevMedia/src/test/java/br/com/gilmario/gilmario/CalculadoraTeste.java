package br.com.gilmario.gilmario;

import static org.junit.Assert.*;

import br.com.gilmario.Calculadora;
import org.junit.Test;

/**
 * Created by gilmario on 21/02/17.
 */
public class CalculadoraTeste {
    @Test
    public void deveriaSomarDoisValoresPassados() throws Exception{
        int valorA = 1;
        int valorB = 2;
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(valorA, valorB);
        assertEquals(3, soma);
    }

    @Test
    public void deveriaSubtrairDoisValoresPassados() throws Exception{
        int valorA = 4;
        int valorB = 1;
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtrai(valorA, valorB);
        assertEquals(3, resultado);
    }

    @Test
    public void deveriaDividirDoisValoresPassados() throws Exception{
        int valorA = 6;
        int valorB = 2;
        Calculadora calculadora = new Calculadora();
        int divisao = calculadora.divide(valorA, valorB);
        assertEquals(3, divisao);
    }

    @Test(expected = ArithmeticException.class)
    public void deveriaLancarUmaExcecaoIndicandoFalhaAoDividirUmNumeroPorZero() throws Exception {
        int valorA = 6;
        int valorB = 0;
        Calculadora calculadora = new Calculadora();
        int divisao = calculadora.divide(valorA, valorB);
        assertEquals(0, divisao);
    }
}
