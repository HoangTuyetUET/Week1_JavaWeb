import java.util.Scanner;

class Exercise1 {
	public static void main(String[] args){  
		String lastname, firstname;
		float point;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter lastname:");
		lastname = scanner.nextLine();
		System.out.println("Enter firstname: ");
		firstname = scanner.nextLine();
		System.out.println("Point: ");
		point = scanner.nextFloat();
		System.out.print(lastname +" "+ firstname + " "+ point + " điểm ");

	}
		  
}  
