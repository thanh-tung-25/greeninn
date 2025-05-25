package mohinh;

import java.util.ArrayList;

public class Phong {

    private String maPhong;
    private double gia;

    private static ArrayList<Phong> danhSachPhong = new ArrayList<>();

    public Phong(String maPhong, double gia) {
        this.maPhong = maPhong;
        this.gia = gia;
    }

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

    public static void hienThiPhongViDu() {
        Phong p = new Phong("P101", 2500);
        System.out.println("Phòng: " + p.getMaPhong() + ", Giá: " + p.getGia());
    }

    public static void themPhong(Phong phong) {
        danhSachPhong.add(phong);
        System.out.println("Đã thêm phòng: " + phong.getMaPhong());
    }

    public static boolean capNhatPhong(String maPhong, double giaMoi) {
        for (Phong p : danhSachPhong) {
            if (p.getMaPhong().equals(maPhong)) {
                p.setGia(giaMoi);
                System.out.println("Đã cập nhật giá cho phòng: " + maPhong);
                return true;
            }
        }
        return false;
    }

    public static boolean xoaPhong(String maPhong) {
        return danhSachPhong.removeIf(p -> p.getMaPhong().equals(maPhong));
    }

    public static void hienThiDanhSachPhong() {
        for (Phong p : danhSachPhong) {
            System.out.println("Mã phòng: " + p.getMaPhong() + ", Giá: " + p.getGia());
        }
    }
}
