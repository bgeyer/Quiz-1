import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double touchdowns;
		double totalYards;
		double interceptions;
		double comps;
		double attempts;
		double qbRating;
		double a;
		double b;
		double c;
		double d;
		System.out.println("How many touchdowns did they score?");
		touchdowns=input.nextDouble();
		System.out.println("How many total yards did they throw?");
		totalYards=input.nextDouble();
		System.out.println("How many interceptions did they throw?");
		interceptions=input.nextDouble();
		System.out.println("How many completions did they throw?");
		comps=input.nextDouble();
		System.out.println("How many passes did they attempt?");
		attempts=input.nextDouble();
		
		a = 5 * ((comps / attempts) - .3);
		b = .25 * ((totalYards / attempts) - 3);
		c = 20 * (touchdowns / attempts);
		d = 2.375 - (interceptions / attempts * 25);
		qbRating = ((a + b + c + d) / 6) * 100;
		System.out.printf("QB Rating: %.2f\n", qbRating);

	}

}
