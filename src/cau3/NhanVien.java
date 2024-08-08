package cau3;

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
	private String ngaySinh;
	
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
			String pattern = ("^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-((19|2[0-9])[0-9]{2})$");
			do {
				System.out.print("Ngày sinh (DD-MM-YYYY): ");
				this.ngaySinh = this.scanner.nextLine();
			} while (!this.ngaySinh.matches(pattern));
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();
		}
	}
	
	public abstract void tinhLuong();	
}
