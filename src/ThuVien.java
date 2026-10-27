import java.util.Scanner;
import java.time.LocalDate;

public class ThuVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CHƯƠNG TRÌNH QUẢN LÝ SÁCH THƯ VIỆN ===");

        // Bài 1: Nhập thông tin và kiểm tra hợp lệ
        System.out.print("Nhập mã sách: ");
        String maSach = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhập tên tác giả: ");
        String tacGia = sc.nextLine();

        int currentYear = LocalDate.now().getYear();
        int namXuatBan;
        do {
            System.out.print("Nhập năm xuất bản (<= " + currentYear + "): ");
            namXuatBan = Integer.parseInt(sc.nextLine());
            if (namXuatBan > currentYear || namXuatBan < 1000) {
                System.out.println("Năm xuất bản không hợp lệ! Vui lòng nhập lại.");
            }
        } while (namXuatBan > currentYear || namXuatBan < 1000);

        double donGia;
        do {
            System.out.print("Nhập đơn giá (> 0): ");
            donGia = Double.parseDouble(sc.nextLine());
            if (donGia <= 0) {
                System.out.println("Đơn giá phải lớn hơn 0! Vui lòng nhập lại.");
            }
        } while (donGia <= 0);

        int soLuong;
        do {
            System.out.print("Nhập số lượng (>= 0): ");
            soLuong = Integer.parseInt(sc.nextLine());
            if (soLuong < 0) {
                System.out.println("Số lượng không được âm! Vui lòng nhập lại.");
            }
        } while (soLuong < 0);

        // Bài 4: Dùng switch chọn loại sách
        System.out.println("Chọn loại sách:");
        System.out.println("1. Sách giáo khoa");
        System.out.println("2. Sách tham khảo");
        System.out.println("3. Sách chuyên ngành");
        System.out.println("4. Sách khác");
        int chonLoai;
        do {
            System.out.print("Nhập lựa chọn (1-4): ");
            chonLoai = Integer.parseInt(sc.nextLine());
            if (chonLoai < 1 || chonLoai > 4) {
                System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 4.");
            }
        } while (chonLoai < 1 || chonLoai > 4);

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
        }

        // Tính toán thành tiền, phí vận chuyển, tổng tiền
        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        // Bài 2: Phân loại giá sách bằng cấu trúc điều kiện if-else
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

        // Bài 3: Phân loại tồn kho bằng cấu trúc điều kiện if-else
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

        // Hiển thị kết quả chi tiết
        System.out.println("\n=== KẾT QUẢ QUẢN LÝ SÁCH  ===");
        System.out.println("Mã sách         : " + maSach);
        System.out.println("Tên sách        : " + tenSach);
        System.out.println("Tác giả         : " + tacGia);
        System.out.println("Năm xuất bản    : " + namXuatBan);
        System.out.println("Loại sách       : " + tenLoaiSach);
        System.out.println("Đơn giá         : " + donGia);
        System.out.println("Số lượng        : " + soLuong);
        System.out.println("------------------------------------");
        System.out.println("Thành tiền      : " + thanhTien);
        System.out.println("Phí vận chuyển  : " + phiVanChuyen);
        System.out.println("Tổng tiền nhập  : " + tongTienNhap);
        System.out.println("------------------------------------");
        System.out.println("Phân loại giá   : " + phanLoaiGia);
        System.out.println("Phân loại kho   : " + phanLoaiTonKho);
        System.out.println("====================================");

        sc.close();
    }
}