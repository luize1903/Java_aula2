import java.util.Scanner;

public class CadastroRoupas {
    int codBarras;
    String descricao;
    String genero;

    public void cadastrarRoupas(Scanner entrada){
        System.out.println("Código de barras de nova roupa:");
        codBarras=entrada.nextInt();

        entrada.nextLine();

        System.out.println("Descrição:");
        descricao = entrada.nextLine();

        System.out.println("Genero: ");
        genero=entrada.nextLine();


    }
}
