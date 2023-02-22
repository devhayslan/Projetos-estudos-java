package br.com.hLeal.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {

    public static void main(String[] args) {
        exemploListaSimplesLinked();
        exemploListaSimplesOrdemAscendente();
    }

        private static void exemploListaSimplesLinked() {
            System.out.println("**** exemploListaSimples ****");
            List<String> lista = new LinkedList<String>();
            lista.add("joão da Silva");
            lista.add("Antonio Sousa");
            lista.add("Lúcia Ferreira");
            System.out.println(lista);
            System.out.println("");

            lista.remove(0);
            boolean contem = lista.contains ("João da Silva");
            System.out.println(lista);
            System.out.println(contem);

            System.out.println(lista.get(0));
    }

        private static void exemploListaSimplesOrdemAscendente() {

            System.out.println("**** exemploListaSimplesOrdemAscendente ****");
            List<String> lista = new LinkedList<String>();
            lista.add("João da Silva");
            lista.add("Antonio Sousa");
            lista.add("Lúcia Ferreira");
            Collections.sort(lista);
            System.out.println(lista);
            System.out.println("");
        }


}