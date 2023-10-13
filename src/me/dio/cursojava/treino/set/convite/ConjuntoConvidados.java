package me.dio.cursojava.treino.set.convite;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convite> conviteSet = new HashSet<>();

    public void adicionarConvidados (String nome, int codigo) {
        conviteSet.add(new Convite(nome,codigo));
    }

    public void removerConvidados (int codigo) {

        for (Convite c: conviteSet) {

            if (c.getCodigo()==codigo) {
                conviteSet.remove(c);

            }

        }

    }

    public void exibirConvites () {

        System.out.println(conviteSet);

    }

    public int contarConvites() {
        return conviteSet.size();
    }

}
