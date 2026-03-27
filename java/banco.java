// o meu (aprendizado)
/*
public class banco{
    private double saldo;
    private double saque;
    private double deposito;

    public banco(double c1, double c2, double c3){
        saldo = c1;
        saque = c2;
        deposito = c3;
    }

    public void saque(){
        saldo = saldo - saque;
    }

    public void deposito(){
        saldo = saldo + deposito;
    }

    public void consultarSaldo(){
        System.out.println(saldo);
    }   

    public static void main(String[] args){
        banco conta1 = new banco(200, 200, 0);
        banco conta2 = new banco(200, 0, 200);

        System.out.println("Seu saldo é");
        conta1.saque();
        conta1.deposito();
        conta1.consultarSaldo();
  

        System.out.println("Seu saldo é");
        conta2.saque();
        conta2.deposito();
        conta2.consultarSaldo();
        
    }
}
*/

// do professor

public class banco {
    private double saldo;

    public banco(){
        saldo = 0.0;
    }

    public void sacar(double valor){
        saldo = saldo - valor;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void mostrarSaldo(){
        System.out.println("Valor do saldo é" + saldo);
    }

    public static void main(String[] args){
    banco c1 = new banco();
    banco c2 = new banco();
    /*
    outra forma:
    declara e depois instancia
    banco c1, c2;
    c1 = new banco();
    c2 = new banco();
    */
    //depósito em c1
    c1.mostrarSaldo();
    c1.depositar(10.0);
    c1.mostrarSaldo();
    // saque em c1
    c1.mostrarSaldo();
    c1.sacar(2.0);
    c1.mostrarSaldo();
    // depósito na conta c2
    c2.mostrarSaldo();
    c2.depositar(50.0);
    c2.mostrarSaldo();
    // saque na conta c2
    c2.mostrarSaldo();
    c2.sacar(40.0);
    c2.mostrarSaldo();
    }
}