package cau3;

import java.util.Date;
import java.util.Scanner;

/**
 * Câu 3: Công ty có 2 loại nhân viên: Nv (nhân viên) văn phòng và Nv sản xuất.
 * 		Viết chương trình quản lý, tính lương từng nhân viên.
 * 		Mỗi nv cần quản lý các thông tin: Họ tên, ngày sinh, lương. Cách tính lương:
 * 			+ Đối với nv sản xuất: Lương = lương căn bản + số sản phẩm * 5000
 * 			+ Đối nv văn phòng: Lương = số ngày làm việc * 100.000
 */
public abstract class NhanVien {

	private Scanner scanner;
	
	private String hoTen;
	private Date ngaySinh;
	
	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public void displayInfo() {
		System.out.println("Nhân viên: " + this.hoTen + "; Ngày sinh: " + this.ngaySinh);
	}
	
	public void inputData() {
		try {
			this.scanner = new Scanner(System.in);
			
			//Nhập hoTen
			do {
				System.out.print("Xin vui lòng nhập Họ tên: ");
				this.hoTen = this.scanner.nextLine().strip();
			} while (this.hoTen.strip().equals(""));
			
			//Nhập ngaySinh
			System.out.print("Ngày sinh: ");
			String input = this.scanner.next("$[1 31]\\/[1 12]\\/[1 2023]^");
			System.out.println(input);
			this.ngaySinh = new Date();
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();
		}
	}
	
	public abstract void tinhLuong();	
}
