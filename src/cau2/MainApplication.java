package cau2;

/**
 * Câu 2
 */
public class MainApplication {

	public static void main(String[] args) {
		VanDongVien vdv1 = new VanDongVien();
		vdv1.inputData();
		vdv1.displayInfo();
		
		VanDongVien vdv2 = new VanDongVien();
		vdv2.inputData();
		vdv2.displayInfo();
		
		vdv1.soSanh(vdv2);
	}
}
