package Bai5_6;

import java.lang.Math;

public class Tour {
    private Tourist tourist;
    private Location location;
    private Hotel hotel;
    private boolean cancelled;
    private static int soLuong = 0;
    
    public Tour(Tourist tourist, Location location, Hotel hotel) {
        this.tourist = tourist;
        this.location = location;
        this.hotel = hotel;
        soLuong++;
    }

    // Hủy tour
    public void cancelTour() {
    	double a = Math.random();
    	if (a<0.1) this.cancelled = true;
    	else this.cancelled = false;
    }
    
    public int getsoLuong() {
    	return soLuong;
    }

    // Kiểm tra xem tour có bị hủy không
    public boolean isCancelled() {
        return cancelled;
    }

    // Getter
    public Tourist getTourist() {
        return tourist;
    }

    public Location getLocation() {
        return location;
    }

    public Hotel getHotel() {
        return hotel;
    }
}
