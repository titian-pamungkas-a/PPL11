package animal;

public class chicken extends aves{

	public chicken(String name, float height, float weight, int age, String color, int egg) {
		super(name, height, weight, age, color, egg);
		chicken.setFlying(false);
	}
	
	@Override
	public void sound() {
		System.out.println("Kukuruyuk");
	}
	
}
