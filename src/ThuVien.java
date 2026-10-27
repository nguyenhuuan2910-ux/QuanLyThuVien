import java.util.Scanner;
import java.time.LocalDate;

public class ThuVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CHƯƠNG TRÌNH QUẢN LÝ SÁCH - TUẦN 3 ===");

        // --- PHẦN 1: CODE GỐC BÀI TẬP TUẦN 3 (GIỮ NGUYÊN) ---
        System.out.print("Nhập mã sách: ");
        String maSach = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhập tên tác giả: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập đơn giá: ");
        double donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        // Tính thành tiền = đơn giá × số lượng
        double thanhTien = donGia * soLuong;

        // Phí vận chuyển = 5% giá trị sách
        double phiVanChuyen = thanhTien * 0.05;

        // Tổng tiền nhập = Thành tiền + Phí vận chuyển
        double tongTienNhap = thanhTien + phiVanChuyen;

        // Hiển thị kết quả Tuần 3
        System.out.println("\n================ THÔNG TIN KẾT QUẢ TUẦN 3 ================");
        System.out.println("Mã sách         : " + maSach);
        System.out.println("Tên sách        : " + tenSach);
        System.out.println("Tác giả         : " + tacGia);
        System.out.println("Năm xuất bản    : " + namXuatBan);
        System.out.println("Đơn giá         : " + donGia);
        System.out.println("Số lượng        : " + soLuong);
        System.out.println("---------------------------------------------------");
        System.out.println("Thành tiền      : " + thanhTien);
        System.out.println("Phí vận chuyển  : " + phiVanChuyen);
        System.out.println("Tổng tiền nhập  : " + tongTienNhap);
        System.out.println("===================================================\n");


        // -- BÀI TẬP TUẦN 4  ---
        System.out.println("=== BỔ SUNG XỬ LÝ BÀI TẬP TUẦN 4 ===");

        // 1. Kiểm tra tính hợp lệ của dữ liệu (Năm, Đơn giá, Số lượng)
        int currentYear = LocalDate.now().getYear();
        if (namXuatBan > currentYear || namXuatBan < 1000) {
            System.out.println("- Kiểm tra năm XB : Không hợp lệ (Phải từ 1000 đến " + currentYear + ")");
        } else {
            System.out.println("- Kiểm tra năm XB : Hợp lệ");
        }

        if (donGia <= 0) {
            System.out.println("- Kiểm tra đơn giá: Không hợp lệ (Phải lớn hơn 0)");
        } else {
            System.out.println("- Kiểm tra đơn giá: Hợp lệ");
        }

        if (soLuong < 0) {
            System.out.println("- Kiểm tra số lượng: Không hợp lệ (Không được âm)");
        } else {
            System.out.println("- Kiểm tra số lượng: Hợp lệ");
        }

        // 2. Dùng switch-case chọn loại sách
        System.out.println("\nChọn loại sách:");
        System.out.println("1. Sách giáo khoa");
        System.out.println("2. Sách tham khảo");
        System.out.println("3. Sách chuyên ngành");
        System.out.println("4. Sách khác");
        System.out.print("Nhập lựa chọn loại sách (1-4): ");
        int chonLoai = Integer.parseInt(sc.nextLine());

        String tenLoaiSach = "";
        switch (chonLoai) {
            case 1:
                tenLoaiSach = "Sách giáo khoa";
                break;
            case 2:
                tenLoaiSach = "Sách tham khảo";
                break;
            case 3:
                tenLoaiSach = "Sách chuyên ngành";
                break;
            case 4:
                tenLoaiSach = "Sách khác";
                break;
            default:
                tenLoaiSach = "Lựa chọn không hợp lệ";
                break;
        }

        // 3. Phân loại giá sách bằng cấu trúc if-else
        String phanLoaiGia = "";
        if (donGia < 50000) {
            phanLoaiGia = "Sách giá thấp";
        } else if (donGia <= 100000) {
            phanLoaiGia = "Sách giá trung bình";
        } else if (donGia <= 200000) {
            phanLoaiGia = "Sách giá cao";
        } else {
            phanLoaiGia = "Sách giá đặc biệt";
        }

        // 4. Phân loại tồn kho bằng cấu trúc if-else
        String phanLoaiTonKho = "";
        if (soLuong == 0) {
            phanLoaiTonKho = "Hết sách";
        } else if (soLuong <= 5) {
            phanLoaiTonKho = "Sắp hết";
        } else if (soLuong <= 20) {
            phanLoaiTonKho = "Còn ít";
        } else {
            phanLoaiTonKho = "Còn nhiều";
        }

        // Hiển thị tổng kết phần bổ sung Tuần 4
        System.out.println("\n================ KẾT QUẢ BỔ SUNG TUẦN 4 ================");
        System.out.println("Loại sách       : " + tenLoaiSach);
        System.out.println("Phân loại giá   : " + phanLoaiGia);
        System.out.println("Phân loại kho   : " + phanLoaiTonKho);
        System.out.println("=======================================================");

        sc.close();
    }
}