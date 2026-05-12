package br.pucrs.mutacao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculadoraDescontosTest {

    private final CalculadoraDescontos calculadora = new CalculadoraDescontos();

    @Test
    public void deveCalcularPrecoFinalComDescontoNormal() {
        double resultado = calculadora.calcularPrecoFinal(200, 10);

        assertEquals(180, resultado);
    }

    @Test
    public void deveIndicarFreteGratisParaValorAcimaDeCem() {
        boolean resultado = calculadora.freteGratis(150);

        assertTrue(resultado);
    }

    @Test
    public void deveClassificarClienteVip() {
        String resultado = calculadora.classificarCliente(12);

        assertEquals("VIP", resultado);
    }

    @Test
    public void deveAplicarCupomPromo10() {
        double resultado = calculadora.aplicarCupom("PROMO10", 100);

        assertEquals(90, resultado);
    }
}
