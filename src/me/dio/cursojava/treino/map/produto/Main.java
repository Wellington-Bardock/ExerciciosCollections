package me.dio.cursojava.treino.map.produto;

public class Main {

    public static void main(String[] args) {

        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1,"Produto1",10,20.5);
        estoqueProdutos.adicionarProduto(2,"Produto2",20,5.10);
        estoqueProdutos.adicionarProduto(3,"Produto3",1,150.20);

        estoqueProdutos.exibirProdutos();

        System.out.println(estoqueProdutos.calcularValorTotalEstoque());

        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
}
