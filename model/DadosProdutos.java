package ecommerce.model;

public class DadosProdutos {
	
	//Atributos produtos
	private String nomeProduto;
	private String descricaoProduto;
	private Double preco;
	private int quantidade;
	private int quantidadeEstoque;
	private String categoria;
	private Boolean statusAtividade;
	private long id;
	
	//Constructors
	
	public DadosProdutos(String nomeProduto, String descricaoProduto, Double preco, int quantidade,
			int quantidadeEstoque, String categoria, Boolean statusAtividade, long id) {
		super();
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoProduto;
		this.preco = preco;
		this.quantidade = quantidade;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoria = categoria;
		this.statusAtividade = statusAtividade;
		this.id = id;
	}

	protected String getNomeProduto() {
		return nomeProduto;
	}

	protected void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	protected String getDescricaoProduto() {
		return descricaoProduto;
	}

	protected void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	protected Double getPreco() {
		return preco;
	}

	protected void setPreco(Double preco) {
		this.preco = preco;
	}

	protected int getQuantidade() {
		return quantidade;
	}

	protected void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	protected int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	protected void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	protected String getCategoria() {
		return categoria;
	}

	protected void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	protected Boolean getStatusAtividade() {
		return statusAtividade;
	}

	protected void setStatusAtividade(Boolean statusAtividade) {
		this.statusAtividade = statusAtividade;
	}

	protected long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}
	
}

	