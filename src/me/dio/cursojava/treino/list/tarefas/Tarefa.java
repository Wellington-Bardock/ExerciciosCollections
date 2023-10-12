package me.dio.cursojava.treino.list.tarefas;

public class Tarefa {

    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "me.dio.cursojava.treino.list.tarefas.Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
