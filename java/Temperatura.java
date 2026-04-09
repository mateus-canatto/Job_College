public class Temperatura {
    private double valor;

    public void setValor(double valor) {
        if (valor >= -273.0) {
            this.valor = valor;
        } else {
            System.out.println("Erro: A temperatura não pode ser menor que -273°C (Zero Absoluto).");
        }
    }

    public double getValor() {
        return valor;
    }

    public void exibirTemperatura() {
        System.out.println("Temperatura atual: " + this.valor + "°C");
    }

    public static void main(String[] args) {
        Temperatura t = new Temperatura();
        
        System.out.println("--- Testando valor válido ---");
        t.setValor(25.0);
        t.exibirTemperatura();
        
        System.out.println("\n--- Testando valor inválido ---");
        t.setValor(-300.0);
        t.exibirTemperatura();
    }
}