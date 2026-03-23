// meu primeiro codigo em java

public class Calculadora1 {
    private double valor1;
    private double valor2
    private double resultado;
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
    CalculadoraElementar calc = new CalculadoraElementar();
    calc.valor1 = 10;
    calc.valor2 = 15;

    System.out.println("Soma: ");
    calc.somar();
    calc.mostrarResultado();

    System.out.println("Subtração: ")
    calc.subtrair();
    calc.mostrarResultado();
}