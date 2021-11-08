package pizza;

public class pizzaB extends pizza {
	public pizzaB(String name, float radius) {
		super(name, radius);
		//addToping();
	}
	
	public void addToping() {
		topings.add(beefs);
		topings.add(mushrooms);
		topings.add(cheeses);
	}
}
