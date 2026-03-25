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

        System.out.println("Apresentando cadastros realizados... ");
        System.out.println("Cliente: ");
        System.out.println("Nome: "+cliente.nome);
        System.out.println("Número: "+cliente.numero);
        System.out.println("CPF: "+cliente.CPF);
        System.out.println("Tel: "+cliente.telefone);
        System.out.println("Material: ");
        System.out.println("Cod.Barras: "+material.roupa.codBarras);
        System.out.println("Descrição: "+material.roupa.descricao);
        System.out.println("Gênero: "+material.roupa.genero);
        System.out.println("Tamanho: "+material.tamanho);
        System.out.println("Qtd: "+material.quantidade);

    }

}