public class Motor {
    private boolean ligado;
    private int rpm;

    public Motor(){
        this.ligado = false;
        this.rpm = 0;
    }

    public void ligar(){
        if (this.ligado == false){
            this.ligado = true;
            this.rpm = 1000;
        }
    }

    public void desligar(){
        if (this.ligado){
            this.ligado = false;
        }
        this.rpm = 0;
    }

    public boolean isLigado(){
        return ligado;
    }

    public void rpm(int nAceleracao){
        if(ligado == true) {
            rpm += (nAceleracao * 1000);
            if (rpm >= 8000) {
                rpm = 8000;
            } else if (rpm <= 0) {
                desligar();
            }
        }
    }

    /*
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
     */

    public float getRpm(){
        return rpm;
    }
    public static void main(String[] args) {
        int qAceleracao = 0;
        Motor motor = new Motor();
        System.out.println("Status do motor "+motor.isLigado());
        motor.ligar();
        System.out.println("Status do motor "+motor.isLigado());
        System.out.println("Nivel de RPM do motor esta em " +motor.getRpm());
        qAceleracao = 1;
        System.out.println("A quantidade de RPM é: "+qAceleracao);
        motor.rpm(qAceleracao);
        System.out.println("Nivel de RPM do motor esta em "+motor.getRpm());
        qAceleracao = 3;
        System.out.println("A quantidade de RPM é: "+qAceleracao);
        motor.rpm(qAceleracao);
        System.out.println("Nivel de RPM do motor esta em "+motor.getRpm());
        qAceleracao = 5;
        System.out.println("A quantidade de RPM é: "+qAceleracao);
        motor.rpm(qAceleracao);
        System.out.println("Nivel de RPM do motor esta em "+motor.getRpm());
        qAceleracao = -1;
        System.out.println("A quantidade de RPM é: "+qAceleracao);
        motor.rpm(qAceleracao);
        System.out.println("Nivel de RPM do motor esta em "+motor.getRpm());
        qAceleracao = -2;
        System.out.println("A quantidade de RPM é: "+qAceleracao);
        motor.rpm(qAceleracao);
        System.out.println("Nivel de RPM do motor esta em "+motor.getRpm());
        qAceleracao = -3;
        System.out.println("A quantidade de RPM é: "+qAceleracao);
        motor.rpm(qAceleracao);
        motor.desligar();
        System.out.println("Nivel de RPM do motor está em "+ 0);
        System.out.println("Status do motor "+motor.isLigado());
    }
}


    