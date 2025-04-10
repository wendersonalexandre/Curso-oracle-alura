import java.util.Random;
import java.util.Scanner;

public class desafioJogoDeAdvina {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100) + 1;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Você tem " + (5 - i) + " tentativas restantes.");
            System.out.println("Tente adivinhar o número entre 1 e 100.");
            int palpite = leitura.nextInt();

            if(palpite == numeroAleatorio){
                System.out.println("Parabéns! Você adivinhou o número!");
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior que " + palpite + ".");
            } else {
                System.out.println("O número é menor que " + palpite + ".");
            }
            
        }


       leitura.close();
    }
}
