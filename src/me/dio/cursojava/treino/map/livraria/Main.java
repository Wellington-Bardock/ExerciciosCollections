package me.dio.cursojava.treino.map.livraria;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Livraria livraria = new Livraria();

        livraria.adicionarLivro("link1","titulo1","autor1", 50.0);
        livraria.adicionarLivro("link6","titulo6","autor1", 20.0);
        livraria.adicionarLivro("link2","titulo2","autor2", 10.0);
        livraria.adicionarLivro("link3","titulo3","autor3", 70.0);
        livraria.adicionarLivro("link4","titulo4","autor4", 30.0);
        livraria.adicionarLivro("link5","titulo5","autor5", 5.0);

        livraria.removerLivro("titulo5");
        System.out.println(livraria.exibirLivrosOrdenadosPorPreco());
        System.out.println(livraria.pesquisarLivrosPorAutor("autor1"));
        System.out.println(livraria.obterLivroMaisBarato());
        System.out.println(livraria.obterLivroMaisCaro());

    }

}
