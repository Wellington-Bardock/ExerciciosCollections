package me.dio.cursojava.treino.list.numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> integerList = new ArrayList<>();

    public void adicionarNumero(int numero) {
        integerList.add(numero);
    }

    public int calcularSoma() {

        int total = 0;

        for (Integer i : integerList) {
            total = total + i;

        }

        return total;

    }

    public int encontrarMaiorNumero() {

        int maiorNumero;

        validarList();

        maiorNumero = integerList.get(0);

        for (Integer i : integerList) {

            if (i > maiorNumero) {
                maiorNumero = i;
            }

        }
        return maiorNumero;

    }


    public int encontrarMenorNumero() {

        int menorNumero;

        validarList();


        menorNumero = integerList.get(0);

        for (Integer i : integerList) {

            if (i < menorNumero) {
                menorNumero = i;
            }

        }
        return menorNumero;

    }

    public List<Integer> exibirNumeros() {

        return integerList;

    }


    public void validarList() {

        if (integerList.isEmpty()) {

            throw new RuntimeException("Lista Vazia!");

        }

    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "integerList=" + integerList +
                '}';
    }
}
