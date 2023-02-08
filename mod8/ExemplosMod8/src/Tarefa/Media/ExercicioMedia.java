package Tarefa.Media;

public class ExercicioMedia {

    public static void main(String[] args) {
        operacaoNotaMedia();
    }

    private static void operacaoNotaMedia() {
        System.out.println("**** operacaoNotaMedia ****");

        int numero1 = 6;
        int numero2 = 7;
        int numero3 = 7;
        int numero4 = 9;

        int numero5 = numero1+numero2+numero3+numero4;

        int numero6 = numero5/4;

        System.out.println("A soma das notas é: \n" + numero5);
        System.out.println("\nA a média do total de notas é: \n" + numero6);
    }
}
