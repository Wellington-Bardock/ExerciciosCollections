package me.dio.cursojava.treino.list.numeros;

public class MainNumeros2 {

    public static void main(String[] args) {

        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(23);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(-4);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(10);

        System.out.println(ordenacaoNumeros.ascOrder());

        System.out.println(ordenacaoNumeros.descOrder());


    }

}
