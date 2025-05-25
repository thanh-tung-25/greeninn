package mohinh;

import java.util.ArrayList;

public class Phong {

    private String maPhong;
    private double gia;

    // Danh sách các phòng
    private static ArrayList<Phong> danhSachPhong = new ArrayList<>();

    // Constructor
    public Phong(String maPhong, double gia) {
        this.maPhong = maPhong;
        this.gia = gia;
    }

    // Getter và Setter
    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    // Ví dụ hiển thị 1 phòng đơn
    public static void hienThiPhongViDu() {
        Phong p = new Phong("P101", 2500);
        String id = p.getMaPhong();
        double gia = p.getGia();

        System.out.println("Thông tin phòng: " + id + ", Giá: " + gia);
    }

    // Thêm phòng
    public static void themPhong(Phong phong) {
        danhSachPhong.add(phong);
        System.out.println("Đã thêm phòng: " + phong.getMaPhong());
    }

    // Sửa thông tin phòng
    public static boolean capNhatPhong(String maPhong, double giaMoi) {
        for (Phong phong : danhSachPhong) {
            if (phong.getMaPhong().equals(maPhong)) {
                phong.setGia(giaMoi);
                System.out.println("Đã cập nhật giá cho phòng: " + maPhong);
                return true;
            }
        }
        System.out.println("Không tìm thấy phòng: " + maPhong);
        return false;
    }

    // Xóa phòng
    public static boolean xoaPhong(String maPhong) {
        for (Phong phong : danhSachPhong) {
            if (phong.getMaPhong().equals(maPhong)) {
                danhSachPhong.remove(phong);
                System.out.println("Đã xóa phòng: " + maPhong);
                return true;
            }
        }
        System.out.println("Không tìm thấy phòng để xóa: " + maPhong);
        return false;
    }

    // Hiển thị danh sách phòng
    public static void hienThiDanhSachPhong() {
        System.out.println("Danh sách các phòng:");
        for (Phong phong : danhSachPhong) {
            System.out.println("Mã phòng: " + phong.getMaPhong() + ", Giá: " + phong.getGia());
        }
    }
}
