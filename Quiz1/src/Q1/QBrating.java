package Q1;
import java.util.Scanner;

public class QBrating {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of passing attempts:");
		double ATT = input.nextDouble();
		System.out.println("Enter number of completions:");
		double COMP = input.nextDouble();
		System.out.println("Enter passing yards:");
		double YDS = input.nextDouble();
		System.out.println("Enter touchdown passes:");
		double TD = input.nextDouble();
		System.out.println("Enter interceptionss:");
		double INT = input.nextDouble();
		input.close();
		double a = (COMP/ATT - 0.3) * 5;
		double b = (YDS/ATT - 3) * 0.25;
		double c = (TD/ATT) * 20;
		double d = 2.375 - (INT/ATT*25);
		double rating = (a + b + c + d) / 6 * 100;
		System.out.println("The QB rating is "+ rating + ".");
	}		
}
