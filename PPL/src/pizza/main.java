package pizza;

public class main {

	public static void main(String[] args) {
		pizza pizza1 = new pizzaA("pizza1", 10);
		pizza pizza2 = new pizzaB("pizza2", 12);
		
		pizza1.printList();
		pizza2.printList();
		
		System.out.println(pizza1.listSize());
		System.out.println(pizza2.listSize());
		
		pizza1.printToping();
		pizza2.printToping();

	}

}
