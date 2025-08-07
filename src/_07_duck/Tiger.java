package _07_duck;

public class Tiger {
String favoriteFood;
int numberOfKills;
int stripes;
void eat(){
	System.out.println("The tiger kills " + numberOfKills + " animals and eats his " + favoriteFood + " his prey in front of his parents without sharing");
}
void look() {
	System.out.println("The tiger has " + stripes + " stripes on his body");
}
Tiger(String favoriteFood, int numberOfKills, int stripes){
	this.favoriteFood = favoriteFood;
	this.numberOfKills = numberOfKills;
	this.stripes = stripes;
}
}
