public class Condicional {
    public static void main(String[] args) throws Exception {
        int anoDelancamento = 2023;
        boolean incluidoNoPlano = true;
        String tipoDeAssinatura = "plus";

        if(anoDelancamento > 2022){
            System.out.println("Lançamento que os clientes estão curtindo!"); 
        } else{
            System.out.println("Filme retrô que vale a pena assistir!"); 
        }

        if(incluidoNoPlano || tipoDeAssinatura.equals("plus")){
            System.out.println("Filme incluso no plano!"); 
        } else{
            System.out.println("Filme não incluso no plano!"); 
        }
        
    }
}
