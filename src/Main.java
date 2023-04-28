import java.util.Scanner;
import model.QuanLySinhVien;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
        menu();
        boolean running = true;

        while (running) {
            System.out.println("Lựa chọn ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    quanLySinhVien.themSV(sc);
                    break;
                case 2:
                    quanLySinhVien.sapXepTheoTen();
                    quanLySinhVien.hienThiDanhSach();
                    break;
                case 3:
                    quanLySinhVien.sapXepTheoDiem();
                    quanLySinhVien.hienThiDanhSach();
                    break;
                case 4:
                    quanLySinhVien.timKiemTheoDiem(sc);
                    break;
                case 5:
                    quanLySinhVien.exportCsv();
                    break;
                case 6:
                    running = false;
                    break;
                case 7:
                    menu();
                    break;
                default:
                    break;
            }

        }

        System.out.println("exit!");
    }

    private static void menu() {
        System.out.println("Thêm học sinh và điểm mới ấn 1 ");

        System.out.println("Hiển thị danh sách học sinh sắp xếp theo tên ấn 2 ");

        System.out.println("Hiển thị danh sách học sinh sắp xếp theo điểm ấn 3");

        System.out.println("Nhập vào 1 điểm ấn 4");

        System.out.println("Xuất danh sách học sinh và điểm ra file csv án 5");

        System.out.println("Thoát chương trình ấn 6");

        System.out.println("Help: Hiển thị command line usage ấn 7");

    }

}