package YaipExTp3;

public class TestAuthorAndBook {
	public static void main(String[] args) {
		Author d1 = new Author("ouioui", "oui", 'm');
		System.out.println(d1);
		Book b1 = new Book("livreDeFou", d1, 21.54, 34);
		System.out.println(b1);
	}

}
