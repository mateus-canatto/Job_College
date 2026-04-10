package ControlePedidos;
public class ControlePedidos {

    public String nome;
    public double preco;

    public ControlePedidos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static class Cliente {
        public String nome;
        public String email;

        public Cliente(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }
    }

    public static class Pedido {
        public Cliente cliente;
        public ControlePedidos produto;
        public int quantidade;

        public Pedido(Cliente cliente, ControlePedidos produto, int quantidade) {
            this.cliente = cliente;
            this.produto = produto;
            this.quantidade = quantidade;
        }

        public double calcularTotal() {
            return produto.preco * quantidade;
        }

        public void exibirResumo() {
            System.out.println("======= RESUMO =======");
            System.out.println("Cliente: " + cliente.nome);
            System.out.println("Email:   " + cliente.email);
            System.out.println("Produto: " + produto.nome);
            System.out.println("Qtd:     " + quantidade);
            System.out.println("Total:   R$ " + (produto.preco * quantidade));
        }
    }

    public static void main(String[] args) {
        ControlePedidos p1 = new ControlePedidos("Teclado Mecânico", 250.0);
        ControlePedidos p2 = new ControlePedidos("Mouse", 120.0);

        Cliente c1 = new Cliente("Joao", "joao@email.com");
        Cliente c2 = new Cliente("Maria", "maria@email.com");

        Pedido pedido1 = new Pedido(c1, p1, 1);
        Pedido pedido2 = new Pedido(c2, p2, 3);

        pedido1.exibirResumo();
        pedido2.exibirResumo();
    }
}