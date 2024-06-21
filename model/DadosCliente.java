package ecommerce.model;

public class DadosCliente {
	
	//Atributos clientes
    private String nome;
    private String aniversario;
    private String telefone;
	private String email;
	private String endereco;
	private String usuario;
	private String senha;
	private String nomeCartao;
	private long numeroCartao;
	private int cvv;
	private String dataValidade;
	
	//Constructors
	public DadosCliente(String nome, String aniversario, String telefone, String email, String endereco, String usuario, String senha,
			String nomeCartao, long numeroCartao, int cvv, String dataValidade) {
		super();
		this.nome = nome;
		this.aniversario = aniversario;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.usuario = usuario;
		this.senha = senha;
		this.nomeCartao = nomeCartao;
		this.numeroCartao = numeroCartao;
		this.cvv = cvv;
		this.dataValidade = dataValidade;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomeCartao() {
		return nomeCartao;
	}

	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}

	public long getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(long numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
}
	