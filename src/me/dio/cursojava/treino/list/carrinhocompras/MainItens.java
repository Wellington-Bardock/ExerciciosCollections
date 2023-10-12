package me.dio.cursojava.treino.list.carrinhocompras;

public class MainItens {

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("item1", 20.00, 2);
        carrinhoDeCompras.adicionarItem("item1", 20.00, 2);
        carrinhoDeCompras.adicionarItem("item2", 50.00, 1);
        carrinhoDeCompras.adicionarItem("item3", 15.50, 2);

        carrinhoDeCompras.removerItem("item3");

        carrinhoDeCompras.exibirItens();

        System.out.println(carrinhoDeCompras.calcularValorTotal());

    }

}
