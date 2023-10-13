package me.dio.cursojava.treino.set.tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    public static final String TAREFA_NAO_ENCONTRADA = "Tarefa não encontrada!";
    private Set<Tarefa> tarefaSet = new HashSet<>();

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {

        Tarefa tarefaremover = new Tarefa(descricao);

        if (tarefaSet.contains(tarefaremover)) {
            tarefaSet.remove(tarefaremover);

        } else System.out.println(TAREFA_NAO_ENCONTRADA);


    }

    public void exibirTarefas() {

        if (!tarefaSet.isEmpty()) {

            System.out.println(tarefaSet);

        } throw new RuntimeException("A Lista está Vazia!");
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa t : tarefaSet) {

            if (t.isConcluido()) {
                tarefasConcluidas.add(t);
            }

        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa t : tarefaSet) {

            if (!t.isConcluido()) {
                tarefasPendentes.add(t);
            }

        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {

        for (Tarefa t: tarefaSet) {

            if (t.getDescricao().equalsIgnoreCase(descricao)) {
               t.setConcluido(true);
            } else System.out.println(TAREFA_NAO_ENCONTRADA);

        }

    }

    public void marcarTarefaPendente(String descricao) {

        for (Tarefa t : tarefaSet) {

            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(false);
            } else System.out.println(TAREFA_NAO_ENCONTRADA);

        }

    }

    public void limparListaTarefas() {
        tarefaSet.clear();

    }

    @Override
    public String toString() {
        return "ListaTarefas{" +
                "tarefaSet=" + tarefaSet +
                '}';
    }
}
