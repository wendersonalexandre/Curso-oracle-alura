import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
         Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filmeFavorito = leitura.nextLine();
        
        System.out.println("Digite o ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Digite sua avaliação: ");
        double avaliacao = leitura.nextDouble();
       
        
        System.out.println("Seu Filme Favorito è: " + filmeFavorito + " , O ano de lançamento é: " + anoDeLancamento + " , A sua avaliação é: " + avaliacao);

        leitura.close();
    }
}
