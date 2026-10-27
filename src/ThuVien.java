import java.util.Scanner;
import java.time.LocalDate;

public class ThuVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CHƯƠNG TRÌNH QUẢN LÝ SÁCH THƯ VIỆN ===");

        // Bài 1: Nhập thông tin sách
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

        // Bài 2: Tính thành tiền = đơn giá × số lượng
        double thanhTien = donGia * soLuong;

        // Bài 3: Phí vận chuyển = 5% giá trị sách (thành tiền)
        double phiVanChuyen = thanhTien * 0.05;

        // Bài 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển
        double tongTienNhap = thanhTien + phiVanChuyen;

        // Hiển thị kết quả
        System.out.println("\n ==THÔNG TIN KẾT QUẢ== ");
        System.out.println("Mã sách       : " + maSach);
        System.out.println("Tên sách      : " + tenSach);
        System.out.println("Tác giả       : " + tacGia);
        System.out.println("Năm xuất bản  : " + namXuatBan);
        System.out.println("Đơn giá       : " + donGia);
        System.out.println("Số lượng      : " + soLuong);
        System.out.println("----------------------------------------");
        System.out.println("Thành tiền     : " + thanhTien);
        System.out.println("Phí vận chuyển : " + phiVanChuyen);
        System.out.println("Tổng tiền nhập : " + tongTienNhap);


        sc.close();
    }
}