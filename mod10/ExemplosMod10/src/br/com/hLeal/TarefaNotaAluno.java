package br.com.hLeal;

import java.util.Scanner;

public class TarefaNotaAluno {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float i1 = s.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float i2 = s.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float i3 = s.nextFloat();
        System.out.println("Digite a quarta nota: ");
        float i4 = s.nextFloat();

        float total = i1+i2+i3+i4;
        float média = (i1+i2+i3+i4)/4;

        System.out.println("a soma das notas é: " + total + "\n");
        System.out.println("A média das notas é: " + média + "\n");

        if (média >= 7.0) {
            System.out.println("Você foi aprovado!");
        } else if (média >= 5.0) {
            System.out.println("Você está de recuperação.");
        } else {
            System.out.println("Você está reprovado.");
        }

        System.out.println("Muito obrigado pela demonstração de notas.");

    }
}
