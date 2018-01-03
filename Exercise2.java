import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args){  
		Scanner scanner = new Scanner(System.in);
		Float a,b,p,s,min;
		System.out.println("Enter 2 numbers: ");
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		p = (a+b)*2;
		s = a*b;
		min = a;
		if (b<a) min = b;
		System.out.println("Chu vi: " + p);
		System.out.println("Dien tich: "+ s);
		System.out.println("Min: "+ min);
	}
}
