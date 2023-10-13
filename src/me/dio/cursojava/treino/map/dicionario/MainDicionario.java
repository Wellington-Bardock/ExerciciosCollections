package me.dio.cursojava.treino.map.dicionario;

public class MainDicionario {
    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Palavra","Definição");
        dicionario.adicionarPalavra("Palavra","Definição1");
        dicionario.adicionarPalavra("Palavra2","Definição2");
        dicionario.adicionarPalavra("Palavra3","Definição3");
        dicionario.adicionarPalavra("Palavra4","Definição4");

        dicionario.removerPalavra("Palavra4");
        System.out.println(dicionario.pesquisarPorPalavra("Palavra3"));
        dicionario.exibirPalavras();

    }

}
