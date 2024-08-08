package cau3;

public class NhanVienSanXuat extends NhanVien {

	static final long LUONG_SAN_PHAM = 5000;
	
	private long luongCanBan;
	private int soSanPham;
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Lương căn bản: " + this.luongCanBan + "; Số sản phẩm: " + this.soSanPham);
	}
	
	@Override
	public void inputData() {
		super.inputData();
		
		try {
			//Nhập lương căn bản
			do {
				System.out.print("Lương căn bản: ");
				this.luongCanBan = this.getScanner().nextLong();
			} while (this.luongCanBan <= 0);
			
			//Nhập số sản phẩm
			do {
				System.out.print("Số sản phẩm: ");
				this.soSanPham = this.getScanner().nextInt();
			} while (this.soSanPham < 0);
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();
		}
	}
	

	@Override
	public void tinhLuong() {
		long luong = this.luongCanBan + this.soSanPham * LUONG_SAN_PHAM;
		System.out.println("Lương là: " + luong);
	}
}
