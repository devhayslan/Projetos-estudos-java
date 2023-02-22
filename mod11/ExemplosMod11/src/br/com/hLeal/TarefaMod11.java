package br.com.hLeal;

import br.com.hLeal.NomesEGeneros;

import java.sql.ClientInfoStatus;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class TarefaMod11 {
    static final int QUANT_PESSOAS=5;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> sexoMasculinos = new ArrayList<String>();
        List<String> sexoFemininos = new ArrayList<String>();

        NomesEGeneros[] nomesEGeneros = new NomesEGeneros[QUANT_PESSOAS];

        System.out.println("Iremos começar a registrar o nome o gênero que deseja!\n");

        for (int i = 0; i < QUANT_PESSOAS; i++) {
            nomesEGeneros[i] = new NomesEGeneros();

            System.out.println("Porfavor digite um nome " + (i + 1) + ": ");
            nomesEGeneros[i].nome = s.nextLine();
            System.out.println("Porfavor digite o seu gênero (M ou F)" + (i+1) + ": ");
            nomesEGeneros[i].sexo = Character.toUpperCase(s.nextLine().charAt(0));

            if (nomesEGeneros[i].sexo == 'M' || nomesEGeneros[i].sexo == 'm') {
                sexoMasculinos.add(nomesEGeneros[i].nome);
            } else if (nomesEGeneros[i].sexo == 'F' || nomesEGeneros[i].sexo == 'f') {
                sexoFemininos.add(nomesEGeneros[i].nome);
            } else {
                System.out.println("Sexo inválido para a pessoa " + i + ", tente novamente.");
                i--; // decrementa o contador para repetir a leitura
            }
        }

        System.out.println("Nomes Masculinos: " + sexoMasculinos);
        System.out.println("Nomes Femininos: " + sexoFemininos);

    }
}