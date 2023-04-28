package model;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {

    private final ArrayList<Student> dssv;

    public QuanLySinhVien() {
        this.dssv = new ArrayList<Student>(10);
    }

    public void themSV(Scanner scanner) {
        Student sv = new Student();
        sv.nhapThongTin(scanner);
        this.dssv.add(sv);
    }

    public void hienThiDanhSach() {
        int i = 1;
        for (Student sv : dssv) {
            System.out.println("Sinh vien thu " + i + " la:");
            sv.hienThiThongTin();
            i++;
        }
    }

    public void sapXepTheoDiem() {
        this.dssv.sort(new SortByDiem());
    }

    public void sapXepTheoTen() {
        this.dssv.sort(new SortByTen());
    }

    public void timKiemTheoDiem(Scanner sc) {
        System.out.println("Nhap so diem");
        int diem = sc.nextInt();

        for (Student sv : dssv) {
            if (sv.getDiem() >= diem) {
                sv.hienThiThongTin();
            }
        }
    }

    public void exportCsv() {
        CsvWriter.writeCsvFile("data.csv", this.dssv);
    }

}