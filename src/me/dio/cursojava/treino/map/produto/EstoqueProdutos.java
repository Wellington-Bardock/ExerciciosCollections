package me.dio.cursojava.treino.map.produto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> produtoMap = new HashMap<>();

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {

        if (!produtoMap.isEmpty()) {
            System.out.println(produtoMap);

        }

    }

    public double calcularValorTotalEstoque() {

        double total = 0;

        if (!produtoMap.isEmpty()) {

            for (Produto p : produtoMap.values()) {
                total += p.getPreco()*p.getQuantidade();
            }

        }
        return total;

    }

    public Produto obterProdutoMaisCaro() {

        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!produtoMap.isEmpty()) {

            for (Produto p : produtoMap.values()) {

                if(p.getPreco()>maiorPreco) {

                    maiorPreco=p.getPreco();
                    produtoMaisCaro =p;

                }

            }

        } return produtoMaisCaro;

    }

    public Produto obterProdutoMaisBarato() {

        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if (!produtoMap.isEmpty()) {

            for (Produto p : produtoMap.values()) {

                if(p.getPreco()< menorPreco) {

                    menorPreco =p.getPreco();
                    produtoMaisBarato =p;

                }

            }

        } return produtoMaisBarato;

    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {

        Produto produtoMaiorValorTotal = null;
        double maiorValorTotal = Double.MIN_VALUE;

        if (!produtoMap.isEmpty()) {

            for (Produto p : produtoMap.values()) {

                if(p.getPreco()*p.getQuantidade()> maiorValorTotal) {

                    maiorValorTotal = p.getPreco()*p.getQuantidade();
                    produtoMaiorValorTotal =p;

                }

            }

        } return produtoMaiorValorTotal;

    }

}
