package me.dio.cursojava.treino.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio7 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer segundoMaior = numeros.stream()
                .distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst()
                .orElseThrow(() -> new RuntimeException("Não foi Possivel Encontrar o valor!"));

        System.out.println(segundoMaior);
    }

}

