package cau3;

public class NhanVienVanPhong extends NhanVien {

	static final long LUONG_NGAY = 100000;
	
	private double soNgayLam;
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Số ngày làm việc: " + this.soNgayLam);
	}
	
	@Override
	public void inputData() {
		super.inputData();
		
		try {
			//Nhập số ngày làm
			do {
				System.out.print("Số ngày làm việc: ");
				this.soNgayLam = this.getScanner().nextDouble();
			} while (this.soNgayLam < 0);
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();
		}
	}
	
	@Override
	public void tinhLuong() {
		long luong = (long) (this.soNgayLam * LUONG_NGAY);
		
		System.out.println("Lương là: " + luong);
	}

}
