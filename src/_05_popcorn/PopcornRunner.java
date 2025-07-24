package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
	Popcorn corn = new Popcorn("butter");
	corn.applyHeat();
	String yummypopcorn = JOptionPane.showInputDialog("How long should I cook the popcorn for?");
	corn.eat();
}
}
