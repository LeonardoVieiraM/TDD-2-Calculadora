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
	// Teste com valores positivos
        Calculadora calculadora = new Calculadora();
        assertEquals(10, calculadora.Subtracao(11,1));

	// Teste com resultado zero
	assertEquals(0, calculadora.Subtracao(5,5));
	
	// Teste com resultado negativo
	assertEquals(-3, calculadora.Subtracao(5,8));  

	// Teste com valores decimais   
	assertEquals(0.25, calculadora.Subtracao(2.5,2.25));    
    }
    
    @Test
	public void testDivisao() {
		Calculadora calculadora = new Calculadora();
		assertEquals (05, calculadora.divisao(100,20));
	}
    @Test
    public void testPotenciacao() {
        // Teste com valores positivos
        double base1 = 2.0;
        double expoente1 = 3.0;
        assertEquals(8.0, Potenciacao.Potenciacao(base1, expoente1), 0.0001);

        // Teste com base zero
        double base2 = 0.0;
        double expoente2 = 5.0;
        assertEquals(0.0, Potenciacao.Potenciacao(base2, expoente2), 0.0001);

        // Teste com expoente zero
        double base3 = 4.0;
        double expoente3 = 0.0;
        assertEquals(1.0, Potenciacao.Potenciacao(base3, expoente3), 0.0001);

        // Teste com expoente negativo
        double base4 = 3.0;
        double expoente4 = -2.0;
        assertEquals(1.0 / 9.0, Potenciacao.Potenciacao(base4, expoente4), 0.0001);

        // Teste com valores decimais
        double base5 = 1.5;
        double expoente5 = 2.0;
        assertEquals(2.25, Potenciacao.Potenciacao(base5, expoente5), 0.0001);
    }	
}
