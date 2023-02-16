package br.com.hLeal;

import java.util.Scanner;
public class TarefaIfTabuada {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero para fazer a tabuada de multiplicar: ");
        int num = s.nextInt();

        if (num <= 10){
            System.out.println(num + " x " + 0 + " = " + num*0);
        }if (num <= 10){
            System.out.println(num + " x " + 1 + " = " + num*1);
        }if (num <= 10){
            System.out.println(num + " x " + 2 + " = " + num*2);
        }if (num <= 10){
            System.out.println(num + " x " + 3 + " = " + num*3);
        }if (num <= 10){
            System.out.println(num + " x " + 4 + " = " + num*4);
        }if (num <= 10){
            System.out.println(num + " x " + 5 + " = " + num*5);
        }if (num <= 10){
            System.out.println(num + " x " + 6 + " = " + num*6);
        }if (num <= 10){
            System.out.println(num + " x " + 7 + " = " + num*7);
        }if (num <= 10){
            System.out.println(num + " x " + 8 + " = " + num*8);
        }if (num <= 10){
            System.out.println(num + " x " + 9 + " = " + num*9);
        }if (num <= 10){
            System.out.println(num + " x " + 10 + " = " + num*10);
        }

    }
}
