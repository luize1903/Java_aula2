import java.util.Scanner;

public class CadastroClientes {
        int numero;
        String nome;
        String CPF;
        String telefone;

        public void cadastrarClientes(Scanner entrada){

                System.out.println("informe o número de cadastro do cliente: ");
                numero = entrada.nextInt();

                entrada.nextLine();

                System.out.println("Nome:");
                nome = entrada.nextLine();

                System.out.println("CPF: ");
                CPF = entrada.nextLine();

                System.out.println("Telefone: ");
                telefone = entrada.nextLine();

        }

}
