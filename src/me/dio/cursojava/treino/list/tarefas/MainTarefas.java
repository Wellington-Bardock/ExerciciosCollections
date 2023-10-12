package me.dio.cursojava.treino.list.tarefas;

public class MainTarefas {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("me.dio.cursojava.treino.list.tarefas.Tarefa 1");
        listaTarefas.adicionarTarefa("me.dio.cursojava.treino.list.tarefas.Tarefa 1");
        listaTarefas.adicionarTarefa("me.dio.cursojava.treino.list.tarefas.Tarefa 2");

        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("me.dio.cursojava.treino.list.tarefas.Tarefa 2");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();

    }
}