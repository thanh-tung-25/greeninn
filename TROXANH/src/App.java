// Import các class từ package mohinh
import mohinh.NguoiThuePhong;
import mohinh.ChuPhong;
import mohinh.Phong;

public class App {
    public static void main(String[] args) {
        // Thêm phòng
        Phong.themPhong(new Phong("P001", 2000));
        Phong.themPhong(new Phong("P002", 2500));
        System.out.println("=== Danh sách phòng sau khi thêm ===");
        Phong.hienThiDanhSachPhong();

        // Thêm chủ phòng
        ChuPhong.themChuPhong(new ChuPhong("CP001", "Nguyen Van B", "0912345678"));
        ChuPhong.themChuPhong(new ChuPhong("CP002", "Tran Thi C", "0923456789"));
        System.out.println("=== Danh sách chủ phòng sau khi thêm ===");
        ChuPhong.hienThiDanhSachChuPhong();

        // Thêm người thuê
        NguoiThuePhong.themNguoiThue(new NguoiThuePhong("NT001", "Nguyen Van A", "0987654321", "P001"));
        NguoiThuePhong.themNguoiThue(new NguoiThuePhong("NT002", "Le Thi D", "0977123456", "P002"));
        System.out.println("=== Danh sách người thuê sau khi thêm ===");
        NguoiThuePhong.hienThiDanhSachNguoiThue();

        // Cập nhật người thuê
        NguoiThuePhong.capNhatNguoiThue("NT001", "Nguyen Van Anh", "0999888777", "P002");
        System.out.println("=== Danh sách người thuê sau khi cập nhật NT001 ===");
        NguoiThuePhong.hienThiDanhSachNguoiThue();

        // Xóa chủ phòng
        ChuPhong.xoaChuPhong("CP002");
        System.out.println("=== Danh sách chủ phòng sau khi xóa CP002 ===");
        ChuPhong.hienThiDanhSachChuPhong();

        // Xóa phòng
        Phong.xoaPhong("P002");
        System.out.println("=== Danh sách phòng sau khi xóa P002 ===");
        Phong.hienThiDanhSachPhong();
    }
}
