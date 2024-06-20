package ecommerce.model;

public class DadosCliente {
	
	//Atributos clientes
    private String nome;
    private String aniversario;
    private String telefone;
	private String email;
	private String rua;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	private long cep;
	private String usuario;
	private String senha;
	private String nomeCartao;
	private long numeroCartao;
	private int cvv;
	private String dataValidade;
	
	//Constructors
	protected DadosCliente(String nome, String aniversario, String telefone, String email, String rua, String complemento,
			String bairro, String cidade, String estado, String pais, long cep, String usuario, String senha,
			String nomeCartao, long numeroCartao, int cvv, String dataValidade) {
		super();
		this.nome = nome;
		this.aniversario = aniversario;
		this.telefone = telefone;
		this.email = email;
		this.rua = rua;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.cep = cep;
		this.usuario = usuario;
		this.senha = senha;
		this.nomeCartao = nomeCartao;
		this.numeroCartao = numeroCartao;
		this.cvv = cvv;
		this.dataValidade = dataValidade;
	}
	
	//Getters e Setters
	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getAniversario() {
		return aniversario;
	}

	protected void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}

	protected String getTelefone() {
		return telefone;
	}

	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getRua() {
		return rua;
	}

	protected void setRua(String rua) {
		this.rua = rua;
	}

	protected String getComplemento() {
		return complemento;
	}

	protected void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	protected String getBairro() {
		return bairro;
	}

	protected void setBairro(String bairro) {
		this.bairro = bairro;
	}

	protected String getCidade() {
		return cidade;
	}

	protected void setCidade(String cidade) {
		this.cidade = cidade;
	}

	protected String getEstado() {
		return estado;
	}

	protected void setEstado(String estado) {
		this.estado = estado;
	}

	protected String getPais() {
		return pais;
	}

	protected void setPais(String pais) {
		this.pais = pais;
	}

	protected long getCep() {
		return cep;
	}

	protected void setCep(long cep) {
		this.cep = cep;
	}

	protected String getUsuario() {
		return usuario;
	}

	protected void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	protected String getSenha() {
		return senha;
	}

	protected void setSenha(String senha) {
		this.senha = senha;
	}

	protected String getNomeCartao() {
		return nomeCartao;
	}

	protected void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}

	protected long getNumeroCartao() {
		return numeroCartao;
	}

	protected void setNumeroCartao(long numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	protected int getCvv() {
		return cvv;
	}

	protected void setCvv(int cvv) {
		this.cvv = cvv;
	}

	protected String getDataValidade() {
		return dataValidade;
	}

	protected void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	
}
	

	