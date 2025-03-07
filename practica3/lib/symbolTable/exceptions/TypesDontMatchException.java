package lib.symbolTable.exceptions;

public class TypesDontMatchException extends Error {

	public TypesDontMatchException(String mensaje) {
		System.out.println(mensaje);
	}

}