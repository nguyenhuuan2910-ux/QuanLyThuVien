import java.util.Scanner;

public class ThuVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CHƯƠNG TRÌNH QUẢN LÝ SÁCH - TUẦN 3 ===");

        // Bài 1: Nhập thông tin sách và hiển thị lại
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

        // Bài 2: Tính thành tiền = đơn giá × số lượng
        double thanhTien = donGia * soLuong;

        // Bài 3: Phí vận chuyển = 5% giá trị sách
        double phiVanChuyen = thanhTien * 0.05;

        // Bài 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển
        double tongTienNhap = thanhTien + phiVanChuyen;

        // Hiển thị kết quả
        System.out.println("\n================ THÔNG TIN KẾT QUẢ ================");
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
        System.out.println("===================================================");

        sc.close();
    }
}