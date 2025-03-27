package lib.symbolTable.exceptions;

public class IndexNotValidException extends Error {

	public IndexNotValidException(String mensaje) {
		System.out.println(mensaje);
	}

}