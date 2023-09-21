package TongHop;

import java.util.Scanner;

public class Menu {
	public static void menu() {
		System.out.println("--------------- Chuong Trinh ---------------");
		System.out.println("1. Them");
		System.out.println("2. Sua");
		System.out.println("3. Xoa");
		System.out.println("4. Xuat");
		System.out.println("5. Luu");
		System.out.println("6. Doc");
		System.out.println("7. Tim");
		System.out.println("8. Sap xep");
		System.out.println("9. Thoat");
		System.out.println("--------------- ************ ---------------");
		System.out.print("Moi ban chon chuong trinh: ");
		int n = new Scanner(System.in).nextInt();
		
		switch (n) {
		case 1:
			Function.add();
			break;
		case 2:
			Function.edit();
			break;	
		case 3:
			Function.remove();
			break;	
		case 4:
			Function.render();
			break;
		case 5:
			Function.save();
			break;
		case 6:
			Function.read();
			break;
		case 7:
			Function.find();
			break;	
		case 9:
			Function.close();;
			break;	
		default:
			break;
		}
	}
}
