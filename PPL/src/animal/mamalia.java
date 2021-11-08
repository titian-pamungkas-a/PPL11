package animal;

public class mamalia extends animal {
	
	private static String alam;
	private static String jenisMakanan;
	
	public mamalia(String name, float height, float weight, int age, String color) {
		super(name, height, weight, age, color);
	}

	public String getAlam() {
		return alam;
	}

	public static void setAlam(String alamAnimal) {
		alam = alamAnimal;
	}

	public String getJenisMakanan() {
		return jenisMakanan;
	}

	public static void setJenisMakanan(String jenisMakananAnimal) {
		jenisMakanan = jenisMakananAnimal;
	}
	
	
	
}
