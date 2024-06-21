package ecommerce.model;

import ecommerce.util.cores;

public class produtos extends DadosProdutos{
	
    
 
	public produtos(String nomeProduto, String descricaoProduto, Double preco, int quantidade, int quantidadeEstoque,
			String categoria, Boolean statusAtividade, long id) {
		super(nomeProduto, descricaoProduto, preco, quantidade, quantidadeEstoque, categoria, statusAtividade, id);
	}

	public void exibirGestaoProduto() {
    	System.out.println("\nID do produto: " + this.getId());
        System.out.println("\nNome do produto: " + this.getNomeProduto());
        System.out.println("\nDescrição do produto: " + this.getDescricaoProduto());
        System.out.println("\nCategoria: " + this.getCategoria());
        System.out.println("\nPreço do produto: " + this.getPreco());
        System.out.println("\nQuantidade em estoque: " + this.getQuantidadeEstoque());
    }
    
    public boolean exibirStatusAtividade() {
    	System.out.println(cores.TEXT_BLACK+"\nO produto ainda está ativo na loja?");
    	boolean status = this.getStatusAtividade();
        if (status == true) {
        	System.out.println("\nStatus: Ativo");
        } else {
            System.out.println("\nStatus: Inativo");
        }
		return status;
    }
    public void exibirCarrinho() {
    	System.out.println("\nID do produto: " + this.getId());
        System.out.println("\nNome do produto: " + this.getNomeProduto());
        System.out.println("\nDescrição do produto: " + this.getDescricaoProduto());
        System.out.println("\nCategoria: " + this.getCategoria());
        System.out.println("\nPreço do produto: " + this.getPreco());
        System.out.println("\nQuantidade em estoque: " + this.getQuantidade());
    }
    
    public void exibirCheckout() {
    	System.out.println("\nID do produto: " + this.getId());
        System.out.println("\nNome do produto: " + this.getNomeProduto());
        System.out.println("\nDescrição do produto: " + this.getDescricaoProduto());
        System.out.println("\nCategoria: " + this.getCategoria());
        System.out.println("\nPreço do produto: " + this.getPreco());
        System.out.println("\nQuantidade em estoque: " + this.getQuantidade());
        System.out.println("\nValor total: R$ " + this.getQuantidade()*this.getPreco());
        System.out.println("\nProsseguir para pagamento.");
    }
    
    public void exibirPedidos() {
    	System.out.println("\nID do produto: " + this.getId());
        System.out.println("\nNome do produto: " + this.getNomeProduto());
        System.out.println("\nDescrição do produto: " + this.getDescricaoProduto());
        System.out.println("\nCategoria: " + this.getCategoria());
        System.out.println("\nPreço do produto: " + this.getPreco());
        System.out.println("\nQuantidade em estoque: " + this.getQuantidade());
        System.out.println("\nValor total: R$ " + this.getQuantidade()*this.getPreco());
        System.out.println("\nProsseguir para pagamento.");
    }
}
