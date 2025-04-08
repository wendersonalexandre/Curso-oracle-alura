import java.util.Scanner;

public class ResoluçãoDesafio {
    public static void main(String[] args) {
         System.out.println("Bem vindo ao Wende Bank");
        String nome = "Wenderson Alexandre Silva Rodrigues";
        String Tipodeconta = "Conta Corrente";
        double SaldoDoCliente = 1000;

        System.out.println("_______________________________");
        System.out.println("Dados do cliente:\n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + Tipodeconta);
        System.out.println("Saldo: R$" + SaldoDoCliente);
        System.out.println("_______________________________\n");

        System.out.println("Operações:\n");

       String operacoes = """
            1 - Consultar saldo
            2 - Sacar
            3 - Transferir valores
            4 - Sair
        """;
        System.out.println(operacoes);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha uma operação: ");
        int operacao = scanner.nextInt();

        while (operacao != 4) {
            
            if(operacao == 1){
                System.out.println("\n Seu saldo é de : R$" + SaldoDoCliente + "\n");
                
            } else if( operacao == 2){
                System.out.println("\n DIgite o valor que deseja sacar:\n");
                int valorDoSaque = scanner.nextInt();
                if(valorDoSaque > SaldoDoCliente){
                    System.out.println("Valor maior que o saldo disponível.\n");
                    System.out.println("");
                } else{
                    SaldoDoCliente -= valorDoSaque;
                    System.out.println("_______________________________\n");
                    System.out.println("Saque realixzado com successo. seu novo saldo é de: R$" + SaldoDoCliente);
                    System.out.println("");
                }
                
            } else if (operacao == 3){
                System.out.println("_______________________________\n");
                System.out.println("Digite o valor que deseja transferir:");
                int valorDaTransferencia = scanner.nextInt();
                System.out.println("");
                if(valorDaTransferencia > SaldoDoCliente){
                    System.out.println("Valor maior que o saldo disponível.\n");
                    System.out.println("");
                } else{
                    SaldoDoCliente -= valorDaTransferencia;
                    System.out.println("Transferência realizada com sucesso. Seu novo saldo é de: R$" + SaldoDoCliente);
                    System.out.println("");
                }
                
            } else {
                System.out.println("Operação inválida. Tente novamente.");
                
            }
            System.out.println(operacoes);
            System.out.print("Escolha uma operação: ");
            operacao = scanner.nextInt();
        }

    }
}
