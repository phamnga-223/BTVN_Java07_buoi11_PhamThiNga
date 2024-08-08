package cau4;

import java.util.List;

/**
 * Câu 4
 */
public class MainApplication {

	public static void main(String[] args) {
		PhuongTienGiaoThong phuongTien = new PhuongTienGiaoThong();
		phuongTien.inputData();
		phuongTien.displayInfo();
		System.out.println("--------------------------------------------");
		
		Oto oto = new Oto();
		List<Oto> list = oto.inputNData();		
		oto.displayNInfo(list);
		System.out.println("--------------------------------------------");
		oto.equalSpeed(list);
	}
}
