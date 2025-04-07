import java.util.Scanner;

public class outroLoop {
    public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            double mediaDaAvaliacao = 0;
            double nota = 0;
            int totalDeNotas = 0;
            
            while (nota != -1) {
                System.out.println("Digite sua avaliação para o filme ou -1 pra encerrar:");
                nota = leitura.nextDouble();
                if(nota != -1){
                    mediaDaAvaliacao += nota;
                    totalDeNotas++;
                }
            }
            System.out.println("Média das avaliações:" + mediaDaAvaliacao/ totalDeNotas);
            leitura.close();
        
    }
}
