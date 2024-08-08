package cau3;

/**
 * Câu 3
 */
public class MainApplication {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVienVanPhong();
		nv1.inputData();
		nv1.displayInfo();
		nv1.tinhLuong();
		
		NhanVien nv2 = new NhanVienSanXuat();
		nv2.inputData();
		nv2.displayInfo();
		nv2.tinhLuong();
	}
}
