package pizza;

public class toping {
	private static String name;
	private float number;
	public toping(float number) {
		super();
		this.number = number;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String names) {
		name = names;
	}
	public float getNumber() {
		return number;
	}
	public void setNumber(float number) {
		this.number = number;
	}
	
}
