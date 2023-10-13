package me.dio.cursojava.treino.set.convite;

import java.util.Objects;

public class Convite {

    private String nome;
    private int codigo;

    public Convite(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Convite{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convite convite)) return false;
        return getCodigo() == convite.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }
}
