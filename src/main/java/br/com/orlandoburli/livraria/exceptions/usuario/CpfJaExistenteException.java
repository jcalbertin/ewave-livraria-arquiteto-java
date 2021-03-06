package br.com.orlandoburli.livraria.exceptions.usuario;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class CpfJaExistenteException extends UsuarioException {

	private static final long serialVersionUID = 1L;

	public CpfJaExistenteException(final String message) {
		super(message);
	}
}