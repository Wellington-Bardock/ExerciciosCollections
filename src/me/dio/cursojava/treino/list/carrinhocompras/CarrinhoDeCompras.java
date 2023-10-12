package me.dio.cursojava.treino.list.carrinhocompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade) {

        Item item = new Item(nome, preco, quantidade);
        itemList.add(item);

    }

    public void removerItem(String nome) {

        List<Item> itemListToRemove = new ArrayList<>();

        for (Item item : itemList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemListToRemove.add(item);
            }
        }

        itemList.removeAll(itemListToRemove);

    }

    public double calcularValorTotal() {

        double total = 0;

        for (Item i : itemList) {
            double totalItemUnitario = i.getPreco() * i.getQuantidade();
            total += totalItemUnitario;

        } return total;
    }

    public void exibirItens() {

        for (Item i : itemList) {
            System.out.println(i);
        }

    }


}
