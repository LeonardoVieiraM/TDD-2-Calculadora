package Calculadora.test;
import static org.junit.Assert.assertEquals;
import org.junit.*;
import Calculadora.src.Calculadora;


public class CalculadoraTest {
    @Test
    public void testMultiplicacao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(20, calculadora.multiplicacao(4,5));
    }
}