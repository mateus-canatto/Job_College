package RA1.SistemaEstoque.src;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<SistemaEstoque> listaProdutos;

    public Estoque() {
        this.listaProdutos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double preco) {
        SistemaEstoque novo = new  SistemaEstoque(nome, preco);
        listaProdutos.add(novo);
    }

    public void alterarPrecoPorNome(String nome, double novoPreco) {
        boolean encontrado = false;
        for ( SistemaEstoque p : listaProdutos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                p.setPreco(novoPreco);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado");
        }
    }

    public void listarProdutosEmEstoque() {
        System.out.println("Lista de Produtos em Estoque");
        for ( SistemaEstoque p : listaProdutos) {
            System.out.println("Produto: " + p.getNome() + " | Preço: R$ " + p.getPreco());
        }
    }
}
