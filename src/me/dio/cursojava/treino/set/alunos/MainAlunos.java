package me.dio.cursojava.treino.set.alunos;

public class MainAlunos {

    public static void main(String[] args) {

        GerenciadorAluno gerenciadorAluno = new GerenciadorAluno();

        gerenciadorAluno.adicionarAluno("Wellington", 1L,9.50);
        gerenciadorAluno.adicionarAluno("Pedro", 1L, 5);
        gerenciadorAluno.adicionarAluno("Gabriel", 3L, 8);
        gerenciadorAluno.adicionarAluno("Marcos", 4L, 9);
        gerenciadorAluno.adicionarAluno("Antonio", 5L, 10);

        System.out.println(gerenciadorAluno.exibirAlunos());
        gerenciadorAluno.removerAluno(3L);
        System.out.println(gerenciadorAluno.exibirAlunosPorNome());
        System.out.println(gerenciadorAluno.exibirAlunosPorMedia());



    }


}
