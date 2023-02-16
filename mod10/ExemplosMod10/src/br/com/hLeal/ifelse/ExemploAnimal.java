package br.com.hLeal.ifelse;

import java.util.Scanner;
public class ExemploAnimal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome do seu animal: ");
        String texto = s.next();
        String animal = exampleOfIF(texto);
        System.out.println(animal);
    }

    public static String exampleOfIF(String animal) {
        String result;

        if (animal.equals("Cão") || animal.equals("Gato")) {
            result = "Animal domestico";
        } else if (animal.equals("Tigre")) {
            result = "Animal Selvagem";
        } else {
            result = "Animal desconhecido!";
        }
        return result;
    }
}
