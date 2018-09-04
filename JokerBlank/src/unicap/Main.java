package unicap;

public class Main {

	public static void main(String[] args) {

		String path = "entrada.txt";
		try {
			Scan scan = new Scan(path);
			Token token = scan.getToken();

			while (token != null) {
				System.out.println(token);
				token = scan.getToken();
			}
			System.out.println("kkkk");
		} catch (Exception e) {
			e.getMessage();
		}

	}
}
