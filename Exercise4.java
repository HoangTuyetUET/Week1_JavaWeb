import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		float a,b,c;
		double delta;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		c = scanner.nextFloat();
		delta = Math.pow(b,2)- 4*a*c;
		if (delta>=0) {
			System.out.println("Can bac 2 delta = "+ Math.sqrt(delta) );
		}else 
			System.out.println("delta < 0 ");
	}

}
