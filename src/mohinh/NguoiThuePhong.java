package mohinh;

import java.util.ArrayList;

public class NguoiThuePhong {

    private String maNguoiThue;
    private String hoTen;
    private String soDienThoai;
    private String maPhongDangThue;

    private static ArrayList<NguoiThuePhong> danhSachNguoiThue = new ArrayList<>();

    // Constructor
    public NguoiThuePhong(String maNguoiThue, String hoTen, String soDienThoai, String maPhongDangThue) {
        this.maNguoiThue = maNguoiThue;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.maPhongDangThue = maPhongDangThue;
    }

    // Getter và Setter
    public String getMaNguoiThue() {
        return maNguoiThue;
    }

    public void setMaNguoiThue(String maNguoiThue) {
        this.maNguoiThue = maNguoiThue;
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

    public String getMaPhongDangThue() {
        return maPhongDangThue;
    }

    public void setMaPhongDangThue(String maPhongDangThue) {
        this.maPhongDangThue = maPhongDangThue;
    }

    // Thêm người thuê
    public static void themNguoiThue(NguoiThuePhong ntp) {
        danhSachNguoiThue.add(ntp);
        System.out.println("Đã thêm người thuê: " + ntp.getMaNguoiThue());
    }

    // Cập nhật thông tin người thuê
    public static boolean capNhatNguoiThue(String maNguoiThue, String hoTenMoi, String sdtMoi, String maPhongMoi) {
        for (NguoiThuePhong nt : danhSachNguoiThue) {
            if (nt.getMaNguoiThue().equals(maNguoiThue)) {
                nt.setHoTen(hoTenMoi);
                nt.setSoDienThoai(sdtMoi);
                nt.setMaPhongDangThue(maPhongMoi);
                System.out.println("Đã cập nhật người thuê: " + maNguoiThue);
                return true;
            }
        }
        System.out.println("Không tìm thấy người thuê để cập nhật: " + maNguoiThue);
        return false;
    }

    // Xóa người thuê
    public static boolean xoaNguoiThue(String maNguoiThue) {
        return danhSachNguoiThue.removeIf(nt -> nt.getMaNguoiThue().equals(maNguoiThue));
    }

    // Hiển thị danh sách người thuê
    public static void hienThiDanhSachNguoiThue() {
        System.out.println("Danh sách người thuê phòng:");
        for (NguoiThuePhong nt : danhSachNguoiThue) {
            System.out.println("Mã: " + nt.getMaNguoiThue() + ", Họ tên: " + nt.getHoTen()
                + ", SĐT: " + nt.getSoDienThoai() + ", Phòng thuê: " + nt.getMaPhongDangThue());
        }
    }
}
