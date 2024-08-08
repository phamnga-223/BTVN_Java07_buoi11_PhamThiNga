package cau2;

import java.util.Scanner;

/**
 * Câu 2: Xây dựng lớp VanDongVien gồm: 
 * 		+ Thuộc tính: hoTen (chuỗi kí tự), tuoi (số nguyên), monThiDau (chuỗi kí tự),,
 * 			, canNang (số thực), chieuCao (số thực)
 * 		+ Phương thức: 
 * 			++ Khởi tạo không tham số
 * 			++ Khởi tạo 5 tham số
 * 			++ Phương thức nhập
 * 			++ Phương thức xuất
 * 			++ Phương thức so sánh 2 vđv > (1 vđv là lớn hơn nếu chiều cao lớn hơn
 * 				, trong trường hợp chiều cao bằng nhau thì xét cân nặng lớn hơn)
 */
public class VanDongVien {

	private String hoTen;
	private int tuoi;
	private String monThiDau;
	private double canNang;
	private double chieuCao;
	
	public VanDongVien() {
	}

	public VanDongVien(String hoTen, int tuoi, String monThiDau, double canNang, double chieuCao) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.monThiDau = monThiDau;
		this.canNang = canNang;
		this.chieuCao = chieuCao;
	}
	
	public void displayInfo() {
		System.out.println("Vận động viên: " + this.hoTen + "; Tuổi: " + this.tuoi
				+ "; Môn thi đấu: " + this.monThiDau + "; Cân nặng: " + this.canNang
				+ "; Chiều cao: " + this.chieuCao);
	}
	
	public void inputData() {
		try {
			Scanner scanner = new Scanner(System.in);
			
			//Nhập hoTen
			do {
				System.out.print("Xin vui lòng nhập Họ tên: ");
				this.hoTen = scanner.nextLine().strip();
			} while (this.hoTen.strip().equals(""));
			
			//Nhập tuoi
			do {
				System.out.print("Tuổi: ");
				this.tuoi = scanner.nextInt();
			} while (this.tuoi <= 0);
			scanner.nextLine();
			
			//Nhập monThiDau
			do {
				System.out.print("Môn thi đấu: ");
				this.monThiDau = scanner.nextLine().strip();
			} while (this.monThiDau.strip().equals(""));
			
			//Nhập canNang
			do {
				System.out.print("Cân nặng: ");
				this.canNang = scanner.nextDouble();
			} while (this.canNang <= 0);
			
			//Nhập chieuCao
			do {
				System.out.print("Chiều cao: ");
				this.chieuCao = scanner.nextDouble();
			} while (this.chieuCao <= 0);
		} catch (Exception ex) {
			System.out.println("Error!");
			ex.printStackTrace();
		}
	}
	
	public void soSanh(VanDongVien vdv) {
		//TH1: chiều cao vdv1 = chiều cao vdv2
		if (this.chieuCao == vdv.chieuCao) {
			if (this.canNang == vdv.canNang) {
				System.out.println("2 Vận động viên ngang nhau");
			} else if (this.canNang > vdv.canNang) {
				System.out.println("Vận động viên đầu tiên lớn hơn");
			} else {
				System.out.println("Vận động viên thứ hai lớn hơn");
			}
		//TH2: chiều cao vdv1 > chiều cao vdv2
		} else if (this.chieuCao > vdv.chieuCao) {
			System.out.println("Vận động viên đầu tiên lớn hơn");
		//TH3: còn lại
		} else {
			System.out.println("Vận động viên thứ hai lớn hơn");
		}
	}
}
