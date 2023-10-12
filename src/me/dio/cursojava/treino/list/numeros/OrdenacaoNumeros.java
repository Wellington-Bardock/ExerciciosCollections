package me.dio.cursojava.treino.list.numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    List<Integer> integerList = new ArrayList<>();

    public void adicionarNumero(int numero) {
        integerList.add(numero);
    }

    public List<Integer> ascOrder () {
        List<Integer> ascNumbers = new ArrayList<>(this.integerList);

        if (!integerList.isEmpty()) {
            Collections.sort(ascNumbers);
            return ascNumbers;

        } else throw new RuntimeException("This List is Empty!");

    }

    public List<Integer> descOrder () {
        List<Integer> descNumbers = new ArrayList<>(this.integerList);

        if (!integerList.isEmpty()) {
            descNumbers.sort(Collections.reverseOrder());
            return descNumbers;

        } else throw new RuntimeException("This List is Empty!");

    }

    public List<Integer> exibirNumeros() {

        return integerList;

    }


}
