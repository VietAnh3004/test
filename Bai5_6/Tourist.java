package Bai5_6;

import java.util.ArrayList;

public class Tourist {
    private String name;
    private int id;
    private ArrayList<Tourist> danhSachKhachHang;
    private static int soLuong = 0;

    public Tourist(String name, int id) {
        this.name = name;
        this.id = id;
        soLuong++;
    }
    
    public int getsoLuong() {
    	return soLuong;
    }

    // Getters và setters
    public String getName() {
        return name;
    }

    public int getid() {
        return id;
    }
    
    public void inDanhSach() {
        for (Tourist a : danhSachKhachHang) {
            System.out.println(a);
        }
    }
    
    public String toString() {
        return "KhachHang{" +
                "ten='" + name + '\'' +
                ", ID=" + id +
                '}';
    }

public Tourist(int soLuong) {
    danhSachKhachHang = new ArrayList<>();
    Tourist[] KH = new Tourist[soLuong + 1];
    for (int i = 1; i < soLuong + 1; i++) {
        // Tạo thông tin ngẫu nhiên cho sinh viên
        String name = "KhachHang" + i;
        int id= i + 100;
        danhSachKhachHang.add(KH[i] =new Tourist(name, id));
    }
}
}