package cau1;

/**
 * Câu 1
 */
public class MainApplication {

	public static void main(String[] args) {
		PhanSo phanSo1 = new PhanSo();
		phanSo1.inputData();
		phanSo1.displayInfo();
		
		PhanSo phanSo2 = new PhanSo();
		phanSo2.inputData();
		phanSo2.displayInfo();
		
		System.out.println("Kết quả thực hiện các phép toán: ");
		phanSo1.cong(phanSo2);
		phanSo1.tru(phanSo2);
		phanSo1.nhan(phanSo2);
		phanSo1.chia(phanSo2);
	}
	
}
