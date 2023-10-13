package me.dio.cursojava.treino.set.alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {

    Set<Aluno> alunos = new HashSet<>();

    public void adicionarAluno(String nome, long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));

    }

    public void removerAluno(Long matricula) {

        for (Aluno a : alunos) {

            if (matricula.equals(a.getMatricula())) {
                alunos.remove(a);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunoByNome = new TreeSet<>(alunos);
        return alunoByNome;
    }

    public Set<Aluno> exibirAlunosPorMedia() {
        Set<Aluno> alunoByMedia = new TreeSet<>(new ComparatorByMedia());
        alunoByMedia.addAll(alunos);
        return alunoByMedia;
    }

    public Set<Aluno> exibirAlunos() {
        return alunos;
    }
}
