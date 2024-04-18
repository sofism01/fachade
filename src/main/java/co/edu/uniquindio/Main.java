package co.edu.uniquindio;

public class Main {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();

        int resultadoEntero = calculadora.sumar(5, 3);
        System.out.println("El resultado de la suma de enteros es: " + resultadoEntero);

        CalculadoraDecimales calculadoraDecimal = new CalculadoraDecimal();

        AdaptadorCalculadora adaptador = new AdaptadorCalculadora(calculadoraDecimal);
        int resultadoDecimal = adaptador.sumar(5, 3);
        System.out.println("El resultado de la suma de decimales es: " + resultadoDecimal);
    }
    
}
