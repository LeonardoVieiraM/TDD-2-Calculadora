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

    
    @Test
    public void testSubtracao(){
        Calculadora calculadora = new Calculadora();
        assertEquals(10, calculadora.Subtracao(11,1));
    }
    
    @Test
	public void testDivisao() {
		Calculadora calculadora = new Calculadora();
		assertEquals (05, calculadora.divisao(100,20));
	}
}
