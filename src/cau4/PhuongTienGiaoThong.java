package cau4;

import java.util.Scanner;

public class PhuongTienGiaoThong {

	private Scanner scanner;
	
	private String hangSX;
	private String ten;
	private int nam;
	private double maxSpeed;
	
	public Scanner getScanner() {
		if (this.scanner == null) {
			this.scanner = new Scanner(System.in);
		}
		
		return this.scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void displayInfo() {
		System.out.println("Hãng SX: " + this.hangSX + "; Tên phương tiện: " + this.ten
				+ "; Năm SX: " + this.nam + "; Vận tốc tối đa: " + this.maxSpeed);
	}
	
	public void inputData() {
		try {
			this.scanner = new Scanner(System.in);
			
			//Nhập hãng SX
			do {
				System.out.print("Hãng SX: ");
				this.hangSX = this.scanner.nextLine().strip();
			} while (this.hangSX.strip().equals(""));
			
			//Nhập tên phương tiện
			do {
				System.out.print("Tên phương tiện: ");
				this.ten = this.scanner.nextLine().strip();
			} while (this.ten.strip().equals(""));
			
			//Nhập năm SX
			do {
				System.out.print("Năm SX: ");
				this.nam = this.scanner.nextInt();
			} while (this.nam < 0 || this.nam > 2024);
			
			//Nhập vận tốc tối đa
			do {
				System.out.print("Vận tốc tối đa: ");
				this.maxSpeed = this.scanner.nextDouble();
			} while (this.maxSpeed <= 0);
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();
		}
	}
	
}
