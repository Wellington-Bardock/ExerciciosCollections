package me.dio.cursojava.treino.streams;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean maiorQueDez = numeros.stream().anyMatch(numero -> numero.compareTo(10)>0);

        System.out.println(maiorQueDez);

    }

}
