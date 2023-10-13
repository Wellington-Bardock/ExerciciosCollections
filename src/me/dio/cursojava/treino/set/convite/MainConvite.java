package me.dio.cursojava.treino.set.convite;

public class MainConvite {

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidados("nome1", 1);
        conjuntoConvidados.adicionarConvidados("nome2", 2);
        conjuntoConvidados.adicionarConvidados("nome3", 2);
        conjuntoConvidados.adicionarConvidados("nome4", 4);
        conjuntoConvidados.adicionarConvidados("nome5", 5);

        conjuntoConvidados.removerConvidados(5);

        System.out.println(conjuntoConvidados.contarConvites());
        conjuntoConvidados.exibirConvites();

    }
}
