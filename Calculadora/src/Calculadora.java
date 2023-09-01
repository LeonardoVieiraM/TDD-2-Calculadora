package Calculadora.src;
import java.lang.Math;

public class Calculadora {
    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public int Adicao(int a, int b) {
        return a + b;
    }
    
    public double Subtracao(double a, double b){
        return a-b;
    }

    public int divisao(int a, int b){
        return a/b ;
    }
    
    public static void main(String[] args) {
        
    }
    public double potenciacao(double base, double expoente){
        return Math.pow(base, expoente);
    }
}
