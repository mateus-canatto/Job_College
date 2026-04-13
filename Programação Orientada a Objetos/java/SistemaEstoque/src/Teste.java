package SistemaEstoque.src;

public class Teste {
    public static void main(String[] args){
        Estoque meuEstoque = new Estoque();

        meuEstoque.adicionarProduto("Notebook", 4500.00);
        meuEstoque.adicionarProduto("Mouse", 150.00);
        meuEstoque.adicionarProduto("Teclado Mecânico", 350.00);
        meuEstoque.adicionarProduto("Celular (Alteração Antes/Depois)", 3000.00);
        meuEstoque.adicionarProduto("Monitor", 2200.00);
        meuEstoque.adicionarProduto("Headset", 400.00);
        meuEstoque.adicionarProduto("Cadeira", 1200.00);
        meuEstoque.adicionarProduto("Impressora", 800.00);
        meuEstoque.adicionarProduto("Webcam", 250.00);
        meuEstoque.adicionarProduto("SSD", 550.00);

        System.out.println("Listagem Inicial: ");
        System.out.println("-----------------------------------------------------");
        meuEstoque.listarProdutosEmEstoque();

        System.out.println("-----------------------------------------------------");

        System.out.println("Alterando o preço do celular");
        meuEstoque.alterarPrecoPorNome("Celular (Alteração Antes/Depois)", 5000.00);

        System.out.println("-----------------------------------------------------");

        System.out.println("Listagem após a alteração: ");
        meuEstoque.listarProdutosEmEstoque();

        System.out.println("-----------------------------------------------------");

        System.out.println("Testando pra ver se da pra alterar algum produto não cadastrado");
        meuEstoque.alterarPrecoPorNome("Tablet", 800.00);
    }

}

