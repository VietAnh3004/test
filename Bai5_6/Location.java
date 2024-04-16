package Bai5_6;

import java.util.ArrayList;

public class Location {
    private String name;
    private ArrayList<Location> danhSachLocation;
    private static int soLuong = 0;

    public Location(String name) {
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
        for (Location a : danhSachLocation) {
            System.out.println(a);
        }
    }
    
    public String toString() {
        return name;
    }

public Location(int soLuong) {
    danhSachLocation = new ArrayList<>();
    Location[] DD = new Location[soLuong + 1];
    for (int i = 1; i < soLuong + 1; i++) {
        // Tạo thông tin ngẫu nhiên cho sinh viên
        String name = "Location " + i;
        danhSachLocation.add(DD[i] = new Location(name));
    }
}
}