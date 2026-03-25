import java.util.Scanner;

public class Estoque {
    String tamanho;
    int quantidade;

    CadastroRoupas roupa = new CadastroRoupas();

    public void atualizarEstoque(Scanner entrada){
        System.out.println("Tamanho: ");
        tamanho= entrada.nextLine();

        System.out.println("Quantidade: ");
        quantidade= entrada.nextInt();

        entrada.nextLine();

    }
}
