package _07_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	String dance;
	void quack() {
	System.out.println("The duck says \"Hey\" to his " + numberOfFriends + " buddies as he drops a piece of " + favoriteFood + ", their favorite food.");
	}
	void waddle() {
		System.out.println("Does the " + dance + " across the rooom to the bar.");
	}
	Duck(String favoriteFood, int numberOfFriends, String dance) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	       this.dance = dance;

	}

}
