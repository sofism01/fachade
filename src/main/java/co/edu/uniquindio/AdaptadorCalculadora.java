package co.edu.uniquindio;

public class AdaptadorCalculadora implements CalculadoraEnteros {
    private CalculadoraDecimales calculadoraDecimales;

    public AdaptadorCalculadora(CalculadoraDecimales calculadoraDecimales){
        this.calculadoraDecimales = calculadoraDecimales;
    }
       @Override
       public int sumar( int num1, int num2) {
        double resultadoDecimal = calculadoraDecimales.sumar((double) num1, (double) num2);
        return (int) resultadoDecimal;
       }
     
}