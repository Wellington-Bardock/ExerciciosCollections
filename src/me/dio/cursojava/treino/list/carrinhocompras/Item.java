package me.dio.cursojava.treino.list.carrinhocompras;

public class Item {

    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Item setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public double getPreco() {
        return preco;
    }

    public Item setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Item setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
