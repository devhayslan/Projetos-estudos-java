package br.com.hLeal;

import java.util.Arrays;
import java.util.Scanner;

public class AtividadeOrdenarArrayAlf {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite nomes de pessoas separando-as por ',': ");

        String resposta = s.next();
        String [] nomes = resposta.split(",");

        Arrays.sort(nomes);
        for(String nome : nomes);
            System.out.println(Arrays.toString(nomes));
    }
}
