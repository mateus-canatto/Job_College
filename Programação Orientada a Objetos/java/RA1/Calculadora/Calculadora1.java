package RA1.Calculadora;
// meu primeiro codigo em java

public class Calculadora1 {
    private double valor1;
    private double valor2;
    private double resultado;

    private void setarValor1AposOperação(){
        valor1 = resultado;
    }


    public Calculadora1(double v1, double v2){
        valor1 = v1;
        valor2 = v2;
        resultado = 0.0;
    } 

    public void somar(){
        resultado = valor1 + valor2;
    }

    public void subtrair(){
        resultado = valor1 - valor2;
    }

    public void mostrarResultado(){
        System.out.println(resultado);
    }

    public static void main(String[] args){
        Calculadora1 calc = new Calculadora1(2, 3);
        Calculadora1 calc2 = new Calculadora1(20, 5);
        Calculadora1 calc3 = new Calculadora1(10, 35);

        System.out.println("Soma: ");
        calc.setarValor1AposOperação();
        calc2.setarValor1AposOperação();
        calc3.setarValor1AposOperação();
        calc.somar();
        calc2.somar();
        calc3.somar();
        calc.mostrarResultado();
        calc2.mostrarResultado();
        calc3.mostrarResultado();

        System.out.println("Subtração: ");
        calc.subtrair();
        calc2.subtrair();
        calc3.subtrair();
        calc.mostrarResultado();
        calc2.mostrarResultado();
        calc3.mostrarResultado();
    }
}