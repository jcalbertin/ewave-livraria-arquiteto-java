package br.com.orlandoburli.livraria.exceptions.emprestimo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class UsuarioBloqueadoPorAtrasoException extends EmprestimoException {

	private static final long serialVersionUID = 1L;

	public UsuarioBloqueadoPorAtrasoException(final String message) {
		super(message);
	}
}