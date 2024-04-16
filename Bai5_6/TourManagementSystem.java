package Bai5_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TourManagementSystem {
    private List<Tour> tours;

    public TourManagementSystem() {
        this.tours = new ArrayList<>();
    }

    // Đặt chỗ tour du lịch
    public void bookTour(Tourist tourist, Location location, Hotel hotel) {
        Tour tour = new Tour(tourist, location, hotel);
        tours.add(tour);
    }

    // Hủy tour du lịch
    public void cancelTour(Tour tour) {
        tour.cancelTour();
    }

    // Thống kê số tour du lịch
    public int countTours() {
        return tours.size();
    }

    // Thống kê số tour bị hủy
    public int countCancelledTours() {
        int count = 0;
        for (Tour tour : tours) {
            if (tour.isCancelled()) {
                count++;
            }
        }
        return count;
    }

    // Thống kê số lượng khách, địa điểm và khách sạn
    public void countStats() {
        int numTourists = 0;
        int numLocations = 0;
        int numHotels = 0;

        System.out.println("Total number of tourists: " + numTourists);
        System.out.println("Total number of unique locations: " + numLocations);
        System.out.println("Total number of unique hotels: " + numHotels);
    }


    public static void main(String[] args) {
        TourManagementSystem tourSystem = new TourManagementSystem();
        Tourist KH = new Tourist(10);
        Location DD = new Location(3);
        Hotel KS = new Hotel(5);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Danh sach khach hang:");
        sc.nextLine();
        KH.inDanhSach();
        System.out.println("Danh sach dia diem:");
        sc.nextLine();
        DD.inDanhSach();
        System.out.println("Danh sach khach san:");
        sc.nextLine();
        KS.inDanhSach();
        
        for (;;) {
        System.out.println("Chon thao tac:");
        System.out.println("1.Dat tour.");
        System.out.println("2.Thong ke so tour, khach, dia diem, khach san.");
        System.out.println("3.Thong ke so tour bi huy.");  //Cac tour se ngau nhien bi huy voi ti le 10%
        System.out.println("4.Ket thuc chuong trinh.");
    	int f = sc.nextInt();
    	switch (f) {
    	case 1:
    		
    		break;
    	case 2:
    		
    		break;
    	case 3:
    		
    		break;
    	}
        if (f==4) break;
        }
    }
}
