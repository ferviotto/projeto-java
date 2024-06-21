package ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ecommerce.exceptions.ProdutoNaoEncontradoException;
import ecommerce.controller.Controller;
import ecommerce.model.DadosCliente;
import ecommerce.model.clientes;
import ecommerce.model.produtos;
import ecommerce.util.cores;

public class Menu {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        Controller controller = new Controller(); 
        
        int op;
        
        while (true) {
            System.out.println(cores.TEXT_YELLOW_BOLD);
            System.out.println("\nBoas vindas ao MAGICAE, onde a magia acontece!");
            System.out.println(cores.TEXT_BLACK);
            System.out.println("**************************************************");
            System.out.println(cores.TEXT_YELLOW_BOLD);
            System.out.println("\t\tMENU MAGICAE");
            System.out.println(cores.TEXT_BLACK);
            System.out.println("**************************************************");
            System.out.println("\n1. Cadastro");
            System.out.println("\n2. Login");
            System.out.println("\n3. Gestão de produtos");
            System.out.println("\n4. Carrinho de compras");
            System.out.println("\n5. Checkout de compras");
            System.out.println("\n6. Listar pedidos");
            System.out.println("\n7. Sair");
            
            System.out.print("\nEscolha uma opção: ");
            op = read.nextInt();
            
            if (op == 7) {
                System.out.println(cores.TEXT_YELLOW_BOLD + "\nObrigada por acessar a MAGICAE. Lhe desejamos uma vida mágica!");
                read.close();
                System.exit(0);
            }
            
            System.out.println(cores.TEXT_RESET);
            
            switch (op) {
                case 1:
                    System.out.println("\n\n\tCadastro");
                    cadastrarCliente(controller, read);
                    break;
                
                case 2:
                    System.out.println("\n\n\tLogin");
                    realizarLogin(controller, read);
                    break;
                    
                case 3:
                    System.out.println("\n\n\tGestão de produtos");
                    gestaoProdutos(controller, read);
                    break;
                    
                case 4:
                    System.out.println("\n\n\tCarrinho de compras");
                    mostrarOpcoesProdutos(controller, read);
                    break;
                    
                case 5:
                    System.out.println("\n\n\tCheckout de compras");
                    controller.exibirCheckout();
                    break;
                    
                case 6:
                    System.out.println("\n\n\tListar pedidos");
                    controller.listarProdutos();
                    break;
                    
                default:
                    System.out.println("\n\n\tOpção Inválida. Por favor, digite uma opção válida.");
                    break;
            }
        }
    }

    private static void cadastrarCliente(Controller controller, Scanner read) {
        read.nextLine(); 
        System.out.print("Nome: ");
        String nome = read.nextLine();
        System.out.print("Aniversário: ");
        String aniversario = read.nextLine();
        System.out.print("Telefone: ");
        String telefone = read.nextLine();
        System.out.print("E-mail: ");
        String email = read.nextLine();
        System.out.print("Endereço: ");
        String endereco = read.nextLine();
        System.out.print("Usuário: ");
        String usuario = read.nextLine();
        System.out.print("Senha: ");
        String senha = read.nextLine();
        System.out.print("Nome do Cartão: ");
        String nomeCartao = read.nextLine();
        System.out.print("Número do Cartão: ");
        long numeroCartao = read.nextLong();
        System.out.print("CVV: ");
        int cvv = read.nextInt();
        read.nextLine(); 
        System.out.print("Data de Validade: ");
        String dataValidade = read.nextLine();
        
        DadosCliente dadosCliente = new DadosCliente(nome, aniversario, telefone, email, endereco, usuario, senha,
            nomeCartao, numeroCartao, cvv, dataValidade);
        
        controller.cadastrarCliente(dadosCliente);
    }

    private static void realizarLogin(Controller controller, Scanner read) {
        read.nextLine(); 
        System.out.print("Usuário: ");
        String usuario = read.nextLine();
        System.out.print("Senha: ");
        String senha = read.nextLine();
        
        clientes cliente = controller.buscarClientePorUsuarioSenha(usuario, senha);
        
        if (cliente != null) {
            System.out.println("\nLogin realizado com sucesso.");
            cliente.exibirUsuario();
        } else {
            System.out.println("\nUsuário ou senha incorretos.");
        }
    }

    private static void gestaoProdutos(Controller controller, Scanner read) {
        read.nextLine(); 
        
        List<produtos> produtosCadastrados = new ArrayList<>();
        
        while (true) {
            System.out.print("\nNome do Produto (ou '0' para sair): ");
            String nomeProduto = read.nextLine();
            if (nomeProduto.equals("0")) {
                break;
            }
            
            System.out.print("Descrição do Produto: ");
            String descricaoProduto = read.nextLine();
            System.out.print("Preço: ");
            double preco = read.nextDouble();
            System.out.print("Quantidade em Estoque: ");
            int quantidadeEstoque = read.nextInt();
            read.nextLine(); 
            System.out.print("Categoria: ");
            String categoria = read.nextLine();
            System.out.print("Ativo (true/false): ");
            boolean statusAtividade = read.nextBoolean();
            System.out.print("ID: ");
            long id = read.nextLong();
            read.nextLine(); 
            
            produtos novoProduto = new produtos(nomeProduto, descricaoProduto, preco, 0, quantidadeEstoque, categoria, statusAtividade, id);
            produtosCadastrados.add(novoProduto);
        }
        
        for (produtos p : produtosCadastrados) {
            controller.adicionarProduto(p);
        }
    }

    private static void mostrarOpcoesProdutos(Controller controller, Scanner read) {
        System.out.println("Produtos disponíveis:");
        controller.listarProdutos();
        
        System.out.print("Digite o ID do produto que deseja adicionar ao carrinho: ");
        long idProduto = read.nextLong();
        System.out.print("Digite a quantidade: ");
        int quantidade = read.nextInt();
        
        try {
            produtos produto = controller.buscarProdutoPorId(idProduto);
            controller.adicionarCarrinho(produto, quantidade);
            System.out.println("Produto adicionado ao carrinho.");
        } catch (ProdutoNaoEncontradoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}