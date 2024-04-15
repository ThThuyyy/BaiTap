package shinhthang;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập độ dài đáy nhỏ của hình thang:");
        double base1 = scanner.nextDouble();

        System.out.println("Nhập độ dài đáy lớn của hình thang:");
        double base2 = scanner.nextDouble();

        System.out.println("Nhập chiều cao của hình thang:");
        double height = scanner.nextDouble();

        double area = calculateArea(base1, base2, height);
        System.out.println("Diện tích của hình thang là: " + area);
    }

    public static double calculateArea(double base1, double base2, double height) {
        return (base1 + base2) * height / 2;
    }
}

