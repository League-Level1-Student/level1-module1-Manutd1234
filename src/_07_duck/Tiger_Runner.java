package _07_duck;

public class Tiger_Runner {
public static void main(String[] args) {
	Tiger t = new Tiger("Antelopes", 9, 5);
	Tiger hi = new Tiger("Lions", 4, 2);
	t.eat();
	hi.eat();
	t.look();
	hi.look();
}
}
