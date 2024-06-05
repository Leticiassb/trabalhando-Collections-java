package main.java.list.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("p1", 123, 9.91, 2);
        cadastroProdutos.adicionarProduto("p2", 526, 10.92, 2);
        cadastroProdutos.adicionarProduto("p3", 155, 5.95, 2);
        cadastroProdutos.adicionarProduto("p4", 122, 6.95, 2);
        cadastroProdutos.adicionarProduto("p5", 156, 9.91, 2);

        System.out.println(cadastroProdutos.exibirProdutoPorPreco());
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
    }
}

