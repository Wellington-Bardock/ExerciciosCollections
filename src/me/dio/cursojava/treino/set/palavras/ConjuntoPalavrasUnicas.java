package me.dio.cursojava.treino.set.palavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas = new HashSet<>();

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {

        if (verificarPalavra(palavra)) {
            palavrasUnicas.remove(palavra);
        } else System.out.println("Palavra não encontrada!");

    }

    public boolean verificarPalavra(String palavra) {

        boolean checagem = false;

        if (palavrasUnicas.isEmpty()) {

            throw new RuntimeException("Lista Vazia!");
        } else {

            if (palavrasUnicas.contains(palavra)) {
                checagem = true;
            }

        }
        return checagem;

    }

    public void exibirPalavrasUnicas() {

        for (String s : palavrasUnicas) {
            System.out.println(s);
        }
    }
}
