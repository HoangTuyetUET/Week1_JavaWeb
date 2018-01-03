import java.util.Scanner;

public class Exercise3 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		float a;
		double v;
		System.out.println("Enter number: ");
		a = scanner.nextFloat();
		v = Math.pow(a,3);
		System.out.println("The tich: "+ v);
	}
}
