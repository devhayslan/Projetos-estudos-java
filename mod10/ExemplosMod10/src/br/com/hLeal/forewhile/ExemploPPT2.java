package br.com.hLeal.forewhile;

public class ExemploPPT2 {

    public static void main(String[] args) {

        for (int contador = 1; contador <= 1000; contador++){
            System.out.println("Está é a repetição nr: " + contador);
            if (contador==10)
                break;
        }

        //exemplo break para que ao percorrer uma lista de numerso ou usuarios por exemplo, serve para parar a execução
        //do código ao encontrar o que desejamos, sem precisar chegar até o final da lista em si.
        //Colocando o if para verificar a condição determinada para para a execução.

    }
}
