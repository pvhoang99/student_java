package model;

import java.util.Scanner;

public class Student {

    private String ten;
    private int diem;

    public Student() {

    }

    public Student(int id, String ten, int diem) {
        this.ten = ten;
        this.diem = diem;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.println("\tNhap ten: ");
        sc.nextLine();
        this.ten = sc.nextLine();
        do {
            System.out.println("\tNhap diem: ");
            this.diem = sc.nextInt();
        } while (this.diem < 1 || this.diem > 5);
    }

    public void hienThiThongTin() {
        System.out.println("\tTen: " + this.ten);
        System.out.println("\tDiem: " + this.diem);
    }

    public double getDiem() {
        return this.diem;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return "Student [ten=" + this.ten + ", diem=" + this.diem + "]";
    }
}