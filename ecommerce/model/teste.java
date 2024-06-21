package ecommerce.model;

import java.util.ArrayList;
import java.util.List;

import ecommerce.repository.EcommerceRepository;

public abstract class teste implements EcommerceRepository {
	
	protected List <DadosProdutos> produtos = new ArrayList<>();
	
	public List <DadosProdutos> listaProdutos(){
		return produtos;
       
            }

}
