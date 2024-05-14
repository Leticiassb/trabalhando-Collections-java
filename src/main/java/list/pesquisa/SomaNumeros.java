package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    public List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }


    public void adicionarNumero(int numero) {
        if (numero >= 0) {
            this.numeros.add(numero);
        } else {
            System.out.println("Digite um número inteiro");
        }
    }

    public void calcularSoma() {
        int somaLista = 0;
        for (Integer numero : numeros) {
            somaLista += numero;


    }
        System.out.println(somaLista);
        }

    public void encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            System.out.println(maiorNumero);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            System.out.println(menorNumero);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(18);
        somaNumeros.adicionarNumero(158);
        somaNumeros.adicionarNumero(0);

        somaNumeros.exibirNumeros();
        somaNumeros.calcularSoma();
        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();

    }
}





