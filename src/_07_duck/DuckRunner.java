package _07_duck;

public class DuckRunner {


	public static void main(String[] args) {



		Duck daffy = new Duck("donuts",3, "Smeeze");
		Duck dummy = new Duck("trash",99, "Harlem Shake");
	
		
		daffy.quack();
		dummy.quack();
		
		daffy.waddle();
		dummy.waddle();
	}

}