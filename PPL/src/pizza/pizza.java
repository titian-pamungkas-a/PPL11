package pizza;

import java.util.ArrayList;
import java.util.List;

public class pizza {
	private String name;
	List<toping> topings = new ArrayList<toping>();  
	private float radius;
	public cheese cheeses = new cheese(5);
	public mushroom mushrooms = new mushroom(5);
	public beef beefs = new beef(5);
	public mozarella mozarellas = new mozarella(5);
	public pizza(String name, float radius) {
		super();
		this.name = name;
		this.radius = radius;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public void printList() {
		int i;
		for (i=0;i<topings.size();i++) {
			System.out.println(topings.get(i).getName());
		}
	}
	
	public int listSize() {
		return topings.size();
	}
	
	public void printToping() {
		System.out.println(beefs.getName());
		System.out.println(mozarellas.getName());
		System.out.println(cheeses.getName());
		System.out.println(mushrooms.getName());
	}
	
}
