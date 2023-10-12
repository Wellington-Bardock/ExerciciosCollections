package me.dio.cursojava.treino.list.numeros;

public class MainNumeros {

    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());

        System.out.println(somaNumeros.exibirNumeros());

        SomaNumeros somaNumeros2 = new SomaNumeros();

        System.out.println(somaNumeros2.encontrarMaiorNumero());

    }

}
