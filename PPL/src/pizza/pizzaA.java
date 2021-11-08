package pizza;

public class pizzaA extends pizza {

	public pizzaA(String name, float radius) {
		super(name, radius);
		//addToping();
		// TODO Auto-generated constructor stub
	}
	
	public void addToping() {
		topings.add(mozarellas);
		topings.add(cheeses);
	}

}
