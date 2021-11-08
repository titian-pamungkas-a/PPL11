package animal;

public class aves extends animal {
	private int egg;
	private static boolean isFlying;
	
	public aves(String name, float height, float weight, int age, String color, int egg) {
		super(name, height, weight, age, color);
		this.egg = egg;
	}

	public int getEgg() {
		return egg;
	}

	public void setEgg(int egg) {
		this.egg = egg;
	}

	public boolean isFlying() {
		return isFlying;
	}

	public static void setFlying(boolean itFlying) {
		isFlying = itFlying;
	}
	
	public String terbang(){
		if (isFlying) return "Bisa terbang";
		else return "Tidak bisa terbang";
	}
	
	
}
