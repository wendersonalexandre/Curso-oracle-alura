public class App{
    public static void main(String[] args) throws Exception {
        System.out.println("Bem-Vindo ao Screen Macth!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022; // Variavel do tipo int 
        System.out.println("Ano de Lançamento: " + anoDeLancamento); // Exibe o ano de lançamento concatenado com a variavel 
        boolean incluidoNoPlano = true;
        System.out.println("Incluido no plano: " + incluidoNoPlano); // Exibe se o filme está incluído no plano concatenado com a variavel

        double media = ( 9.8 + 6.3 + 8.0 ) / 3;
        System.out.println(media); // Exibe a média concatenada com a variavel
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com Tom Cruise
                Muito bom
                ano de lançamento: 
                """+ anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println("Classificação: " + classificacao); // Exibe a classificação concatenada com a variavel 

    }
}
