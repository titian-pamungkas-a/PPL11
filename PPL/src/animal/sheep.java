package animal;

public class sheep extends mamalia{
	
	public sheep(String name, float height, float weight, int age, String color) {
		super(name, height, weight, age, color);
		sheep.setAlam("Daratan");
		sheep.setJenisMakanan("Herbovira");
	}
	
	@Override
	public void sound() {
		System.out.println("Mbeeeek");
	}
	
	

}
