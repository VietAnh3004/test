package Bai5_6;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Hotel> danhSachHotel;
    private static int soLuong = 0;
    
    public Hotel(String name) {
        this.name = name;
        soLuong++;
    }
    
    public int getsoLuong() {
    	return soLuong;
    }

    // Getter
    public String getName() {
        return name;
    }
    
    public void inDanhSach() {
        for (Hotel a : danhSachHotel) {
            System.out.println(a);
        }
    }
    
    public String toString() {
        return name;
    }
    
    public Hotel(int soLuong) {
        danhSachHotel = new ArrayList<>();
        Hotel[] KS = new Hotel[soLuong + 1];
        for (int i = 1; i < soLuong + 1; i++) {
            // Tạo thông tin ngẫu nhiên cho sinh viên
            String name = "Khach San " + i;
            danhSachHotel.add(KS[i] = new Hotel(name));
        }
    }
}
