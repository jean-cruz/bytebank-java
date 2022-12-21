package testes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculadoraTest {
    @Test
    public void deveriaSomarDoisNumerosPositivos(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3,7);
        Assert.assertEquals(10,soma);
    }
}
