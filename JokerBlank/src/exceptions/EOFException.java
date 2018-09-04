package exceptions;

@SuppressWarnings("serial")
public class EOFException extends Exception {

	public EOFException() {
		super("Fim de arquivo!");
	}
}
