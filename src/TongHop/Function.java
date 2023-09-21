package TongHop;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Function {
	static HashMap<Integer, Contact> csdl = new HashMap<Integer, Contact>();
	// Ham thêm
	public static void add() { 
		System.out.print("Moi ban nhap ma: ");
		int id = new Scanner(System.in).nextInt();
		System.out.print("Moi ban nhap ten: ");
		String name = new Scanner(System.in).nextLine();
		System.out.print("Moi ban nhap sdt: ");
		String phone = new Scanner(System.in).nextLine();
		
		Contact contact = new Contact(id, name, phone);
		if(csdl.containsKey(contact.getId()) == false) {
			csdl.put(contact.getId(), contact);
		}
	}
	// Hàm xuất thông tin
	public static void render() {
		System.out.println("\n---------- Danh sach ----------");
		for(Map.Entry<Integer, Contact> item: csdl.entrySet()) {
			System.out.println(item.getValue());
		}
		System.out.println("---------- ********* ----------\n");
	}
	// Hàm đọc file
	public static void read() {
		csdl = Serrialize_File.readFile("/Volumes/D/File_Truong/contact.dat");
		System.err.println("Doc thanh cong");
	}
	// Hàm lưu file
	public static void save() {
		Serrialize_File.saveFile(csdl, "/Volumes/D/File_Truong/contact.dat");
		System.err.println("Luu thanh cong");
	}
	// Hàm sửa thông tin
	public static void edit() {
		System.out.print("Moi ban nhap ma: ");
		int id = new Scanner(System.in).nextInt();
		if(csdl.containsKey(id)) {
			System.out.print("Moi ban nhap ten: ");
			String name = new Scanner(System.in).nextLine();
			System.out.print("Moi ban nhap sdt: ");
			String phone = new Scanner(System.in).nextLine();
			Contact contact = new Contact(id, name, phone);
			csdl.put(contact.getId(), contact);
			System.err.println("Sua thanh cong");
		}
	}
	// Hàm Xoá
	public static void remove() {
		System.out.print("Moi ban nhap ma: ");
		int id = new Scanner(System.in).nextInt();
		for(Map.Entry<Integer, Contact> item: csdl.entrySet()) {
			if(item.getValue().getId() == id) {
				csdl.remove(id);
			}
		}
	}
	// Hàm tim kiếm
	public static void find() {
		System.out.print("Moi ban nhap sdt: ");
		String phone = new Scanner(System.in).nextLine();
		for(Map.Entry<Integer, Contact> item: csdl.entrySet()) {
			if(item.getValue().getPhone().startsWith(phone)) {
				System.out.println(item.getValue());
			}
		}
	}
	// Hàm đóng chương trình
	public static void close() {
		System.err.println("Ket thuc");
		System.exit(0);
	}
}
