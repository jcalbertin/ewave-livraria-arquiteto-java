package br.com.orlandoburli.livraria.exceptions.livro;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LivroNaoEncontradoException extends LivroException {

	private static final long serialVersionUID = 1L;

	public LivroNaoEncontradoException(String message) {
		super(message);
	}
}