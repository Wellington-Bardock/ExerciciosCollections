package me.dio.cursojava.treino.set.palavras;

public class MainPalavras {

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        //palavrasUnicas.verificarPalavra("palavra6");

        palavrasUnicas.adicionarPalavra("palavra1");
        palavrasUnicas.adicionarPalavra("palavra2");
        palavrasUnicas.adicionarPalavra("palavra3");
        palavrasUnicas.adicionarPalavra("palavra4");
        palavrasUnicas.adicionarPalavra("palavra4");

        palavrasUnicas.removerPalavra("palavra3");

        palavrasUnicas.exibirPalavrasUnicas();

    }

}
