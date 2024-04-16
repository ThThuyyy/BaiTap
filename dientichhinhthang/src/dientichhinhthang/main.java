package dientichhinhthang;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài đáy lớn của hình thang: ");
        double daiLon = scanner.nextDouble();

        System.out.print("Nhập độ dài đáy nhỏ của hình thang: ");
        double daiNho = scanner.nextDouble();

        System.out.print("Nhập chiều cao của hình thang: ");
        double chieuCao = scanner.nextDouble();

        double dienTich = tinhDienTichHinhThang(daiLon, daiNho, chieuCao);
        System.out.println("Diện tích của hình thang là: " + dienTich);
    }

    public static double tinhDienTichHinhThang(double daiLon, double daiNho, double chieuCao) {
        return (daiLon + daiNho) * chieuCao / 2;
    }
}
