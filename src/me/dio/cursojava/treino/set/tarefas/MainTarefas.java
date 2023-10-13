package me.dio.cursojava.treino.set.tarefas;

public class MainTarefas {

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa1");
        listaTarefas.adicionarTarefa("Tarefa2");
        listaTarefas.adicionarTarefa("Tarefa3");
        listaTarefas.adicionarTarefa("Tarefa3");
        listaTarefas.adicionarTarefa("Tarefa4");

        listaTarefas.removerTarefa("Tarefa4");
        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.marcarTarefaConcluida("Tarefa1");
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaPendente("Tarefa1");

        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }
}
