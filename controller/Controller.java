package ecommerce.controller;

import java.util.ArrayList;
import java.util.List;
import ecommerce.exceptions.ProdutoNaoEncontradoException;
import ecommerce.model.DadosCliente;
import ecommerce.model.DadosProdutos;
import ecommerce.model.produtos;
import ecommerce.model.clientes;
import ecommerce.repository.EcommerceRepository;

public class Controller implements EcommerceRepository {

    private List<produtos> listaProdutos = new ArrayList<>();
    private List<clientes> listaClientes = new ArrayList<>();
    private List<produtos> listaCarrinho = new ArrayList<>();

    @Override
    public void cadastrarCliente(DadosCliente cliente) {
        listaClientes.add((clientes) cliente);
        System.out.println("\nCliente cadastrado com sucesso.");
    }

    @Override
    public void exibirDadosCartao(DadosCliente cliente) {
        ((clientes) cliente).exibirDadosCartao();
    }

    @Override
    public void exibirUsuario(DadosCliente cliente) {
        ((clientes) cliente).exibirUsuario();
    }

    @Override
    public void exibirGestaoProduto() {
        for (produtos p : listaProdutos) {
            p.exibirGestaoProduto();
        }
    }

    @Override
    public void exibirStatusAtividade() {
        for (produtos p : listaProdutos) {
            p.exibirStatusAtividade();
        }
    }

    @Override
    public void exibirCarrinho() {
        if (listaCarrinho.isEmpty()) {
            System.out.println("Carrinho vazio.");
        } else {
            for (produtos p : listaCarrinho) {
                p.exibirCarrinho();
            }
        }
    }

    @Override
    public void exibirCheckout() {
        float total = 0;
        if (listaCarrinho.isEmpty()) {
            System.out.println("Carrinho vazio. Nada a pagar.");
            return;
        }

        for (produtos p : listaCarrinho) {
            float subtotal = (float) (p.getPreco() * p.getQuantidade());
            System.out.println("Produto: " + p.getNomeProduto() + ", Quantidade: " + p.getQuantidade() + ", Subtotal: R$" + subtotal);
            total += subtotal;
        }
        System.out.println("Total da compra: R$" + total);
        
        realizarPagamento();
    }

    @Override
    public void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
        } else {
            for (produtos p : listaProdutos) {
                System.out.println("ID: " + p.getId());
                System.out.println("Nome: " + p.getNomeProduto());
                System.out.println("Descrição: " + p.getDescricaoProduto());
                System.out.println("Preço: R$" + p.getPreco());
                System.out.println("Quantidade : " + p.getQuantidadeEstoque());
                System.out.println("Categoria: " + p.getCategoria());
                System.out.println("Status: " + p.getStatusAtividade());
                System.out.println("********************************************");
            }
        }
    }

    public void adicionarCarrinho(produtos produto, int quantidade) throws ProdutoNaoEncontradoException {
        if (produto == null) {
        	throw new ProdutoNaoEncontradoException("Produto inválido. Não foi possível adicionar ao carrinho.");
        }

        produtos produtoExistente = buscarProdutoPorId(produto.getId());
        if (produtoExistente != null) {
            boolean encontrado = false;
            for (produtos p : listaCarrinho) {
                if (p.getId() == produto.getId()) {
                    p.setQuantidade(p.getQuantidade() + quantidade);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                produtos novoProduto = new produtos(
                    produto.getNomeProduto(),
                    produto.getDescricaoProduto(),
                    produto.getPreco(),
                    quantidade,
                    produto.getQuantidadeEstoque(),
                    produto.getCategoria(),
                    produto.getStatusAtividade(),
                    produto.getId()
                );
                listaCarrinho.add(novoProduto);
            }
        } else {
        	throw new ProdutoNaoEncontradoException("Produto não encontrado na lista de produtos.");
        }
    }

    public produtos buscarProdutoPorId(long id) {
        for (produtos produto : listaProdutos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public clientes buscarClientePorUsuarioSenha(String usuario, String senha) {
        for (clientes cliente : listaClientes) {
            if (cliente.getUsuario().equals(usuario) && cliente.getSenha().equals(senha)) {
                return cliente;
            }
        }
        return null;
    }

    public void realizarPagamento() {
        float total = calcularTotalCarrinho();
        if (total > 0) {
            System.out.println("Total a pagar: R$" + total);
            System.out.println("Pagamento realizado com sucesso!");
            limparCarrinho();
        } else {
            System.out.println("Carrinho vazio. Nada a pagar.");
        }
    }

    private float calcularTotalCarrinho() {
        float total = 0;
        for (produtos p : listaCarrinho) {
            float subtotal = (float) (p.getPreco() * p.getQuantidade());
            total += subtotal;
        }
        return total;
    }

    private void limparCarrinho() {
        listaCarrinho.clear();
        System.out.println("Carrinho limpo após o pagamento.");
    }

    public void adicionarProduto(produtos produto) {
        listaProdutos.add(produto);
    }

	
}