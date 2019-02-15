
public class Fruit {
	private String name;
	private float price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}
	public Fruit(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Fruit() {
		this("",0.0f);
	}
	
	public void display() {
		System.out.println(toString());
	}
	
	

}
