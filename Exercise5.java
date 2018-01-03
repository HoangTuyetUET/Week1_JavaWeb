import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		int exer = 1;
	
		while (exer != 0) {
			System.out.println("---------------Menu--------------------");
			System.out.println("Chọn bài 1,2,3 hoặc 4:");
			System.out.println("1. Nhập điểm.");
			System.out.println("2. Tính toán với hình chữ nhật.");
			System.out.println("3. Tính thể tích hình lập phương.");
			System.out.println("4. Tính căn bậc 2 của delta phương trình bậc 2.");
			System.out.println("Nhập 0 để thoát khỏi chương trình.");
			System.out.println("---------------------------------------");
			exer = scanner.nextInt();
			switch (exer) {
			case 1:
				nhapDiem();
				break;
			case 2:
				hinhChuNhat();
				break;
			case 3:
				theTichHinhLapPhuong();
				break;
			case 4:
				phuongTrinhBac2();
				break;
			default:
				if (exer == 0) {
					System.out.println("Đã thoát");
				} else {
					System.out.println("Giá trị " + exer + " không có.");
				}
				break;
			}
		}
	}
	
	public static Scanner scanner = new Scanner(System.in);

	public static void nhapDiem() {
		String name;
		float point;
		
		scanner.nextLine();
		System.out.println("Bài tập 1 Nhập điểm : ");
		System.out.println("Nhập họ và tên : ");
		name = scanner.nextLine();
		System.out.println("Nhập điểm: ");
		point = scanner.nextFloat();
		System.out.println(name + " " + point + " điểm.");
	}

	public static void hinhChuNhat() {
		Float edge1, edge2, peri, area, min;
		
		System.out.println("Bài tập 2 tính toán với hình chữ nhật: ");
		System.out.println("Nhập 2 cạnh của hình chữ nhật : ");
		edge1 = scanner.nextFloat();
		edge2 = scanner.nextFloat();
		peri = (edge1 + edge2) * 2;
		area = edge1 * edge2;
		min = Math.min(edge1, edge2);
		System.out.println("Chu vi hình chữ nhật = : " + peri);
		System.out.println("Diện tích hình chữ nhật = : " + area);
		System.out.println("Cạnh nhỏ hơn =  " + min);
	}

	public static void theTichHinhLapPhuong() {
		Float edge;
		double volume;
		
		System.out.println("Bài tập 3 Tính thể tích hình lập phương : ");
		System.out.println("Nhập chiều dài của cạnh hình lập phương: ");
		edge = scanner.nextFloat();
		volume = Math.pow(edge, 3);
		System.out.println("Thể tích của hình lập phương là : " + volume);
	}

	public static void phuongTrinhBac2() {
		float a, b, c;
		double delta;
		
		System.out.println("Bài tập 4 tính căn bậc 2 của delta phương trình bậc 2 : ");
		System.out.println("Nhập 3 hệ số của phương trình bậc 2 : ");
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		c = scanner.nextFloat();
		delta = Math.pow(b, 2) - 4 * a * c;
		if (delta >= 0) {
			System.out.println("Căn bậc 2 của delta = " + Math.sqrt(delta));
		} else
			System.out.println(" delta < 0 ");
	}
}
