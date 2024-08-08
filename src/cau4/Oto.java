package cau4;

import java.util.ArrayList;
import java.util.List;

public class Oto extends PhuongTienGiaoThong {

	private int soChoNgoi;
	private String kieuDongCo;
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Số chỗ ngồi: " + this.soChoNgoi + "; Kiểu động cơ: " + this.kieuDongCo);
	}
	
	@Override
	public void inputData() {
		super.inputData();
		
		try {		
			//Nhập số chỗ ngồi
			do {
				System.out.print("Số chỗ ngồi: ");
				this.soChoNgoi = this.getScanner().nextInt();
			} while (this.soChoNgoi <= 0);
			this.getScanner().nextLine();
			
			//Nhập kiểu động cơ
			do {
				System.out.print("Kiểu động cơ: ");
				this.kieuDongCo = this.getScanner().nextLine().strip();
			} while (this.kieuDongCo.strip().equals(""));
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();
		}
	}
	
	public void equalSpeed(List<Oto> list) {
		if (list == null || list.size() == 0) {
			System.out.println("Mảng rỗng!");
			return;
		}
		
		/* Tạo 2 mảng
		 * 		1. Mảng 1: lưu các danh sách oto cùng vận tốc
		 * 		2. Mảng 2: lưu vận tốc đại diện cho từng mảng trong Mảng 1
		 * */	
		List<Object> equalSpeeds = new ArrayList<Object>();
		List<Double> speeds = new ArrayList<Double>();
		for (int i = 0; i < list.size(); i++) {
			double maxSpeed = list.get(i).getMaxSpeed();
			if (!speeds.contains(maxSpeed)) {
				List<Oto> equalSpeed = new ArrayList<Oto>();
				equalSpeed.add(list.get(i));
				
				for (int j = i + 1; j < list.size(); j++) {
					//So sánh tốc độ 2 oto
					if (maxSpeed == list.get(j).getMaxSpeed()) {
						equalSpeed.add(list.get(j));
					}
				}
				
				if (equalSpeed.size() > 1) {
					equalSpeeds.add(equalSpeed);
					speeds.add(maxSpeed);
				}
			}
		}
		
		//In ra kết quả
		if (equalSpeeds.size() == 0) {
			System.out.println("Không có ô tô nào cùng vận tốc!");
			return;
		}
		
		System.out.println("Các đối tượng ô tô cùng vận tốc là: ");
		for (int i = 0; i < equalSpeeds.size(); i++) {
			List<Oto> equalSpeed = (List<Oto>) equalSpeeds.get(i);
			System.out.println("Các ô tô có cùng vận tốc " + speeds.get(i) + " : ");
			for (Oto oto : equalSpeed) {
				oto.displayInfo();
			}
		}
	}
	
	public List<Oto> inputNData() {
		List<Oto> list = new ArrayList<Oto>();

		try {
			int n;
			
			//Nhập số lượng ô tô
			do {
				System.out.print("Xin vui lòng nhập số lượng Ô tô: ");
				n = this.getScanner().nextInt();
			} while (n <= 0);
			
			//Nhập thông tin list ô tô
			for (int i = 0; i < n; i++) {
				System.out.println("Ô tô thứ " + i + ": ");
				Oto oto = new Oto();
				oto.inputData();
				list.add(oto);
			}
		} catch (Exception ex) {
			System.out.println("Đã có lỗi xảy ra!");
			ex.printStackTrace();
		}
		
		return list;
	}
	
	public void displayNInfo(List<Oto> list) {
		if (list == null || list.size() == 0) {
			System.out.println("Mảng rỗng!");
			return;
		}
		
		for (Oto oto : list) {
			oto.displayInfo();
		}
	}
}
