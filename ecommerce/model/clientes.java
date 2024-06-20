package ecommerce.model;

import ecommerce.util.cores;

public class clientes extends DadosCliente{

	public clientes(String nome, String aniversario, String telefone, String email, String rua, String complemento,
			String bairro, String cidade, String estado, String pais, long cep, String usuario, String senha,
			String nomeCartao, long numeroCartao, int cvv, String dataValidade) {
		super(nome, aniversario, telefone, email, rua, complemento, bairro, cidade, estado, pais, cep, usuario, senha,
				nomeCartao, numeroCartao, cvv, dataValidade);
	}
	
	public void cadastrarCliente() {
		System.out.println("\nNome Completo: " + this.getNome());
        System.out.println("\nData de Aniversário: " + this.getAniversario());
        System.out.println("\nTelefone: " + this.getTelefone());
        System.out.println("\nE-mail: " + this.getEmail());
        System.out.println("\nEndereço: Rua " + this.getRua() + "\nComplemento: " + this.getComplemento() +
                "\nBairro: " + this.getBairro() + "\nCidade: " + this.getCidade() +
                "\nEstado: " + this.getEstado() + "\nPaís: " + this.getPais() + "\nCEP: " + this.getCep());
    }
	

    public void exibirUsuario() {
        System.out.println("\nUsuário: " + this.getUsuario());
        System.out.println("\nSenha: " + this.getSenha());
    }

    public void exibirDadosCartao() {
        System.out.println("\nNome no Cartão: " + this.getNomeCartao());
        System.out.println("\nNúmero do Cartão: " + this.getNumeroCartao());
        System.out.println("\nCVV: " + this.getCvv());
        System.out.println("\nData de Validade: " + this.getDataValidade());
    }

}
