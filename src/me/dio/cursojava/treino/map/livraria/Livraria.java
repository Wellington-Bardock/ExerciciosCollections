package me.dio.cursojava.treino.map.livraria;

import java.math.BigDecimal;
import java.util.*;

public class Livraria {

    private Map<String, Livro> livroMap = new HashMap<>();

    public void adicionarLivro(String link, String titulo, String autor, Double preco) {
        livroMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {

        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {

            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                livroMap.remove(entry.getKey());
                break;
            }
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {

        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livroMap.entrySet());
        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorByPreco());

        Map<String, Livro> livrosOrdenados = new HashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenados.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenados;
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {

        List<Livro> livroList = new ArrayList<>();

        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {

            if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                livroList.add(entry.getValue());
            }
        }
        return livroList;
    }

    public Livro obterLivroMaisCaro() {

        Livro livroMaisCaro = null;
        Double valorMaisCaro = Double.MIN_VALUE;

        for (Livro l : livroMap.values()) {

            if (l.getPreco().compareTo(valorMaisCaro)>0) {
                valorMaisCaro = l.getPreco();
                livroMaisCaro = l;
            }
        } return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato() {

        Livro livroMaisBarato = null;
        Double valorMaisBarato = Double.MAX_VALUE;

        for (Livro l : livroMap.values()) {

            if (l.getPreco().compareTo(valorMaisBarato) < 0) {
                valorMaisBarato = l.getPreco();
                livroMaisBarato = l;
            }
        } return livroMaisBarato;
    }

}