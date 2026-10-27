import java.util.Scanner;

// Lớp đại diện cho Cuốn Sách
class Sach {
    // Bài 1: Các thuộc tính thông tin sách
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double donGia;
    private int soLuong;

    // Constructor không tham số
    public Sach() {
    }

    // Phương thức nhập thông tin sách từ bàn phím (Bài 1)
    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhập mã sách: ");
        this.maSach = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        this.tenSach = sc.nextLine();

        System.out.print("Nhập tên tác giả: ");
        this.tacGia = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        this.namXuatBan = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập đơn giá: ");
        this.donGia = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập số lượng: ");
        this.soLuong = Integer.parseInt(sc.nextLine());
    }

    // Bài 2: Tính thành tiền = đơn giá × số lượng
    public double tinhThanhTien() {
        return this.donGia * this.soLuong;
    }

    // Bài 3: Phí vận chuyển = 5% giá trị sách (giá trị sách ở đây tính theo Thành tiền)
    public double tinhPhiVanChuyen() {
        return tinhThanhTien() * 0.05;
    }

    // Bài 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển
    public double tinhTongTienNhap() {
        return tinhThanhTien() + tinhPhiVanChuyen();
    }

    // Phương thức hiển thị lại thông tin và kết quả các bài toán
    public void hienThiThongTin() {
        System.out.println("\n----------------------------------------");
        System.out.println("THÔNG TIN CHI TIẾT VÀ HÓA ĐƠN NHẬP KHO");
        System.out.println("Mã sách         : " + this.maSach);
        System.out.println("Tên sách        : " + this.tenSach);
        System.out.println("Tác giả         : " + this.tacGia);
        System.out.println("Năm xuất bản    : " + this.namXuatBan);
        System.out.printf("Đơn giá         : %,.0f VNĐ\n", this.donGia);
        System.out.println("Số lượng        : " + this.soLuong);
        System.out.println("----------------------------------------");
        System.out.printf("Thành tiền      : %,.0f VNĐ\n", tinhThanhTien());
        System.out.printf("Phí vận chuyển  : %,.0f VNĐ\n", tinhPhiVanChuyen());
        System.out.printf("TỔNG TIỀN NHẬP  : %,.0f VNĐ\n", tinhTongTienNhap());
        System.out.println("----------------------------------------");
    }
}

// Lớp chính chạy chương trình
public class ThuVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sach sach = new Sach();

        System.out.println(" CHƯƠNG TRÌNH QUẢN LÝ SÁCH ");

        // Gọi hàm nhập thông tin (Bài 1)
        sach.nhapThongTin(sc);

        // Gọi hàm hiển thị toàn bộ thông tin và các tính toán (Bài 1, 2, 3, 4)
        sach.hienThiThongTin();

        sc.close();
    }
}