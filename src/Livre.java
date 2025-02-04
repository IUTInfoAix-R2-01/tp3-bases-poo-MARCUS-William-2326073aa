public class Livre {
	
	private String name;
	private float price;
	private int quantite;
	
	public Livre() {
		name="toaru majutsu no index";
		price= 11.55f;
		quantite=15;
	}
	public String getName() {
		return name;
		
	}
	public float getPrice() {
		return price;
	}
	public int getQuantite() {
		return quantite;
	}
	
	public String toString() {
		return "Livre [name=" + name + ", price=" + price + ", quantite=" + quantite + "]";
	}
	
			
}
