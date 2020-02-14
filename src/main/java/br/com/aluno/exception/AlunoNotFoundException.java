package br.com.aluno.exception;

public class AlunoNotFoundException extends Exception {

	private static final long serialVersionUID = -5334313375472289833L;

	public AlunoNotFoundException() {
		super();
	}

	public AlunoNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AlunoNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public AlunoNotFoundException(String message) {
		super(message);
	}

	public AlunoNotFoundException(Throwable cause) {
		super(cause);
	}
	
	
	
	

}
