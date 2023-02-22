package br.com.hLeal.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * OS dados São classificados, mas o acesso é mais lento que um HashSet.
 * Não repete valores na lista.
 *
 * @author haysl
 */

public class ExemploTreeSet {

    public static void main (String[] args) {
        exemploListaSimples();
    }

        /**
         * Não repete valores na lista.
         * Tem ordem natural dos objetos.
         */

        private static void exemploListaSimples() {
            System.out.println("**** exemploListaSimples ****");
            Set<String> lista = new TreeSet<String>();
            lista.add("João da Silva");
            lista.add("Antonio Sousa");
            lista.add("Lúcia Ferreira");
            lista.add("João da Silva");
            System.out.println(lista);
            System.out.println("");
        }
    }
