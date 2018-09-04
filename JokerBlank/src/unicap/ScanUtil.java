package unicap;

public class ScanUtil {

	public static final int INT = 0;
	public static final int MAIN = 1;
	public static final int ID = 2;
	public static final int PONTO_VIRGULA = 3;
	public static final int NUMERO_INTEIRO = 4;

	public static void lookUp(Token token) {

		if (token.getLexema().equals("int")) {
			token.setCodigo(INT);
		} else if (token.getLexema().equals("main")) {
			token.setCodigo(MAIN);
		}// FARIA PARA TODAS AS PALAVRAS RESERVADAS
		else {
			token.setCodigo(ID);
		}
	}
}
