package mohinh;

import java.util.ArrayList;

public class ChuPhong {

    private String maChuPhong;
    private String hoTen;
    private String soDienThoai;

    private static ArrayList<ChuPhong> danhSachChuPhong = new ArrayList<>();

    // Constructor
    public ChuPhong(String maChuPhong, String hoTen, String soDienThoai) {
        this.maChuPhong = maChuPhong;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
    }

    // Getter và Setter
    public String getMaChuPhong() {
        return maChuPhong;
    }

    public void setMaChuPhong(String maChuPhong) {
        this.maChuPhong = maChuPhong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    // Thêm chủ phòng
    public static void themChuPhong(ChuPhong chuPhong) {
        danhSachChuPhong.add(chuPhong);
        System.out.println("Đã thêm chủ phòng: " + chuPhong.getMaChuPhong());
    }

    // Cập nhật thông tin chủ phòng
    public static boolean capNhatChuPhong(String maChuPhong, String hoTenMoi, String sdtMoi) {
        for (ChuPhong c : danhSachChuPhong) {
            if (c.getMaChuPhong().equals(maChuPhong)) {
                c.setHoTen(hoTenMoi);
                c.setSoDienThoai(sdtMoi);
                System.out.println("Đã cập nhật chủ phòng: " + maChuPhong);
                return true;
            }
        }
        System.out.println("Không tìm thấy chủ phòng để cập nhật: " + maChuPhong);
        return false;
    }

    // Xóa chủ phòng
    public static boolean xoaChuPhong(String maChuPhong) {
        return danhSachChuPhong.removeIf(c -> c.getMaChuPhong().equals(maChuPhong));
    }

    // Hiển thị danh sách chủ phòng
    public static void hienThiDanhSachChuPhong() {
        System.out.println("Danh sách các chủ phòng:");
        for (ChuPhong c : danhSachChuPhong) {
            System.out.println("Mã: " + c.getMaChuPhong() + ", Họ tên: " + c.getHoTen() + ", SĐT: " + c.getSoDienThoai());
        }
    }
}
