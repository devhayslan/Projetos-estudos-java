package br.com.hLeal.set;

import br.com.hLeal.domain.Aluno;
import java.util.*;

/**
 * HashSet não tem ordem.
 * O acesso aos dados é mais rápida que um TreeSet, mas nada garante que os dados estaram ordenados.
 * Não repete valores na lista.
 *
 * @author haysl
 */

public class ExemploHashSet {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNovo();
    }

    private static void exemploNovo() {
        System.out.println("**** exemploNovo ****");
        Set<Integer> inteiros = new HashSet<Integer>();
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(1);
        System.out.println(inteiros);
    }

    /**
     * não repete valores na lista.
     */

    private static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        Set<String> lista = new HashSet<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("exemploListaSimplesOrdemAscendente ****");
        Set<String> lista = new HashSet<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        //Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
