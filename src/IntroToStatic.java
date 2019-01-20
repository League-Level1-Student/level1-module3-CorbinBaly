
public class IntroToStatic {

	public static void main(String[] args) {
		// create two athletes //print their names, bibNumbers, and the location of
		// their race. }
		Athlete Usain = new Athlete("Usain", 6);
		Athlete Rando = new Athlete("Rando", 7);
	}
}

class Athlete {

	static int nextBibNumber;
	static String raceLocation = "New York";
	static String raceStartTime = "9.00am";

	String name;
	int speed;
	int bibNumber;

	Athlete(String name, int speed) {
		this.name = name;
		this.speed = speed;
		bibNumber = nextBibNumber + 1;
		nextBibNumber++;
		System.out.println(bibNumber);
	}

}