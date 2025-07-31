package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
	String flavor= JOptionPane.showInputDialog("What flavor should the popcorn be");
	Popcorn corn = new Popcorn(flavor);
	Microwave wave = new Microwave();
	String time = JOptionPane.showInputDialog("How long should I cook the popcorn for?");
	int time1 = Integer.parseInt(time);
	wave.setTime(time1);
	wave.putInMicrowave(corn);
	wave.startMicrowave();
}
}
