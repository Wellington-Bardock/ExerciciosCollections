package me.dio.cursojava.treino.streams;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Double total = numeros.stream().filter(numero -> numero.compareTo(5) > 0)
                .mapToDouble(Integer::doubleValue).average()
                .orElseThrow(() -> new RuntimeException("Não foi possível calcular!"));

        System.out.println(total);

    }
}
