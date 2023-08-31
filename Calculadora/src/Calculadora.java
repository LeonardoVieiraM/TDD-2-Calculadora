package Calculadora.src;
import java.lang.Math;

public class Calculadora {
    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public int Subtracao(int a, int b){
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
