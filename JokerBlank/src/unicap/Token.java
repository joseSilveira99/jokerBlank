package unicap;

public class Token {

	private Integer codigo;
	private String lexema;

	public Token() {
	}

	public Token(String lexema) {
		this.lexema = lexema;
	}

	public Token(Integer codigo, String lexema) {
		this.codigo = codigo;
		this.lexema = lexema;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getLexema() {
		return lexema;
	}

	public void setLexema(String lexema) {
		this.lexema = lexema;
	}

	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer();

		sb.append("=-=-=-=-=-=-=-\n");
		sb.append("Código: ");
		sb.append(this.getCodigo());
		sb.append("\n");
		sb.append("Lexema: ");
		sb.append(this.getLexema());
		sb.append("\n=-=-=-=-=-=-=-\n");

		return sb.toString();
	}

}
