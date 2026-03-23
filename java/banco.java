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