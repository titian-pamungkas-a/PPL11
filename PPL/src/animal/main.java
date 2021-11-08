package animal;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sheep sheep1 = new sheep("Sheep1", 13, 13, 13, "White");
		sheep sheep2 = new sheep("Sheep2", 13, 13, 13, "White");
		sheep sheep3 = new sheep("Sheep3", 13, 13, 13, "White");
		sheep sheep4 = new sheep("Sheep4", 13, 13, 13, "White");
		sheep sheep5 = new sheep("Sheep5", 13, 13, 13, "White");
		sheep sheep6 = new sheep("Sheep6", 13, 13, 13, "White");
		
		chicken chick1 = new chicken("chick1", 3, 3, 3, "Black", 21);
		chicken chick2 = new chicken("chick2", 3, 3, 3, "Black", 21);
		chicken chick3 = new chicken("chick3", 3, 3, 3, "Black", 21);
		chicken chick4 = new chicken("chick4", 3, 3, 3, "Black", 21);
		
		System.out.println(sheep1.getJenisMakanan());
		System.out.println(sheep2.getAlam());
		
		System.out.println(chick1.getEgg());
		System.out.println(chick2.terbang());
		
		chick1.sound();
		sheep1.sound();
		

	}

}
