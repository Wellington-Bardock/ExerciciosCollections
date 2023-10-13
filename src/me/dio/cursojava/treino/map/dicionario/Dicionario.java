package me.dio.cursojava.treino.map.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap = new HashMap<>();

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public String pesquisarPorPalavra(String palavra) {

        String definicao = null;

        if (!dicionarioMap.isEmpty()) {

            definicao = dicionarioMap.get(palavra);

        } return definicao;

    }

    public void exibirPalavras () {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        }
    }
}
