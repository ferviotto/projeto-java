package ecommerce.model;

public class DadosProdutos {
	
	//Atributos produtos
	private static String nomeProduto;
	private static String descricaoProduto;
	private static Double preco;
	private int quantidade;
	private static int quantidadeEstoque;
	private static String categoria;
	private static Boolean statusAtividade;
	private static long id;
	
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

	public static String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public static String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public static Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public static int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public static String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public static Boolean getStatusAtividade() {
		return statusAtividade;
	}

	public void setStatusAtividade(Boolean statusAtividade) {
		this.statusAtividade = statusAtividade;
	}

	public static long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
