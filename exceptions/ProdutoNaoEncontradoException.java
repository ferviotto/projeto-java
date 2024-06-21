package ecommerce.exceptions;

import ecommerce.util.cores;

public class ProdutoNaoEncontradoException extends Exception {
	    public ProdutoNaoEncontradoException(String message) {
	        super(cores.TEXT_RED_BOLD+"O produto não foi encontrado. Tente novamente.");
	    }
	}

