package br.com.alura.rh;

public class ValidacaoException extends RuntimeException {

	private static final long serialVersionUID = 3174650726492903435L;

	public ValidacaoException(String mensagem) {
		super(mensagem);
	}
}