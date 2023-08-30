package Calculadora.test;
import static org.junit.Assert.assertEquals;
import org.junit.*;


public class CalculadoraTest {
    @Test
    public void testMultiplicacao() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.multiplicacao(4,5);
        assertEquals(20, result);
    }
}