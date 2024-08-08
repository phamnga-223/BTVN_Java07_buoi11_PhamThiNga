package cau1;

import java.util.Scanner;

/**
 * Câu 1: Xây dựng lớp PhanSo gồm:
 * 		+ Thuộc tính: tuSo, mauSo
 * 		+ Phương thức: 
 * 			++ Hàm khởi tạo ko tham số
 * 			++ Nhập, Xuất
 * 			++ Cong(), Tru(), Nhan(), Chia()
 * 		+ Tính tổng, hiệu, tích, thương 2 phân số tham số nhận vào là Phân số
 * 			, In kết quả ra màn hình
 */
public class PhanSo {

	private Scanner scanner;
	
	private int tuSo;
	private int mauSo;
	
	public PhanSo() {
	}
	
	public void displayInfo() {
		System.out.println("Phân số: " + tuSo + "/" + mauSo);
	}
	
	public void inputData() {
		try {
			this.scanner = new Scanner(System.in);
			
			//Nhập tử số
			System.out.print("Xin vui lòng nhập Tử số: ");
			this.tuSo = this.scanner.nextInt();
			
			//Nhập mẫu số
			do {
				System.out.print("Mẫu số: ");
				this.mauSo = this.scanner.nextInt();
			} while(this.mauSo == 0);
			
			if (this.mauSo < 0) {
				this.tuSo *= -1;
				this.mauSo *= -1;
			}

			this.rutGon();
			
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();
		}
	}
	
	public void cong(PhanSo phanSo) {
		//B1. Rút gọn 2 phân số
		this.rutGon();
		phanSo.rutGon();
		
		//B2: Thực hiện phép cộng
		PhanSo cong = new PhanSo();		
		if (this.mauSo == phanSo.mauSo) {
			cong.tuSo = this.tuSo + phanSo.tuSo;
			cong.mauSo = this.mauSo;
		} else {
			cong.tuSo = (this.tuSo * phanSo.mauSo) + (phanSo.tuSo * this.mauSo);
			cong.mauSo = this.mauSo * phanSo.mauSo;
		}
		//Rút gọn phân số tổng
		cong.rutGon();
		
		//B3: In ra kết quả
		cong.displayInfo();
	}

	public void tru(PhanSo phanSo) {
		//B1: Đổi dấu phân số
		PhanSo phanSo2 = new PhanSo();
		phanSo2.tuSo = phanSo.tuSo * -1;
		phanSo2.mauSo = phanSo.mauSo;
		
		//B2: Thực hiện phép cộng
		cong(phanSo2);
	}
	
	public void nhan(PhanSo phanSo) {
		PhanSo nhan = new PhanSo();
		
		//B1: Thực hiện phép nhân
		nhan.tuSo = this.tuSo * phanSo.tuSo;
		nhan.mauSo = this.mauSo * phanSo.mauSo;

		//B2: Rút gọn
		nhan.rutGon();
		
		//B3: In ra kết quả
		nhan.displayInfo();
	}
	
	public void chia(PhanSo phanSo) {
		if (phanSo.tuSo == 0) {
			System.out.println("Phân số chia không hợp lệ!");
			return;
		}
		
		//Thực hiện phép nhân đảo nghịch
		int mauSoMoi = phanSo.tuSo;
		phanSo.tuSo = phanSo.mauSo;
		phanSo.mauSo = mauSoMoi;
		if (phanSo.mauSo < 0) {
			phanSo.tuSo *= -1;
			phanSo.mauSo *= -1;
		}
		this.nhan(phanSo);
	}
	
	public void rutGon() {
		//TH: tử số = 0
		if (this.tuSo == 0) {
			this.mauSo = 1;
			return;
		}
		
		//TH: Mẫu số chia hết tử số và tử số != 1
		if (this.mauSo % this.tuSo == 0 && Math.abs(this.tuSo) != 1) {
			this.mauSo = this.mauSo / this.tuSo;
			this.tuSo = 1;
			return;
		}
		
		//TH: Tìm ước chung của mẫu và tử
		int n = Math.abs(this.tuSo);
		for (int i = n; i > 1; i--) {
			if (this.tuSo % i == 0 && this.mauSo % i == 0) {
				this.tuSo = this.tuSo / i;
				this.mauSo = this.mauSo / i;
				
				return;
			}
		}		
	}
}
