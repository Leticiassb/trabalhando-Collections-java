package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoa;

    public OrdenacaoPessoas(){
        this.listaPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoa);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoa);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas pessoa = new OrdenacaoPessoas();

        pessoa.adicionarPessoa("Nome 1", 20, 1.56);
        pessoa.adicionarPessoa("Nome 2", 15, 1.65);
        pessoa.adicionarPessoa("Nome 3", 36, 1.89);
        pessoa.adicionarPessoa("Nome 4", 40, 1.56);
        pessoa.adicionarPessoa("Nome 5", 13, 1.45);

        System.out.println(pessoa.ordenarPorAltura());
        System.out.println(pessoa.ordenarPorIdade());
    }


}
