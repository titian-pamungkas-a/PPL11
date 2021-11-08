package animal;

public class animal {
	private String name;
	private float height;
	private float weight;
	private int age;
	private String color;
	
	public animal(String name, float height, float weight, int age, String color) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void sound() {
		
	}
	
}
