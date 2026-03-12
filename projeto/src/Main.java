import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroClientes cliente = new CadastroClientes();
        Estoque material = new Estoque();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cadastrando clientes ...");
        cliente.cadastrarClientes(entrada);

        System.out.println("Cadastrando roupas ...");
        material.roupa.cadastrarRoupas(entrada);

        System.out.println("Atualizando estoque..;");
        material.atualizarEstoque(entrada);

        System.out.println("Nome: "+cliente.nome);
    }

}