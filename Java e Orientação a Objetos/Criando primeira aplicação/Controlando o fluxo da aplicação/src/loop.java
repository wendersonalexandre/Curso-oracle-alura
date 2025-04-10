import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaDaAvaliacao = 0;
        double nota = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o filme");
            nota = leitura.nextDouble();
            mediaDaAvaliacao += nota;
        }
        System.out.println("Média das avaliações:" + mediaDaAvaliacao/ 3);
        leitura.close();
    }
}
