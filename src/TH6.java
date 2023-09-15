import java.util.Scanner;

public class TH6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số năm muốn kiểm tra nhuận hay không? ");
        int a = sc.nextInt();
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.println("Năm " + a + " là năm nhuận. ");
                } else {
                    System.out.println("Năm " + a + " không là năm nhuận. ");
                }
            } else {
                System.out.println("Năm " + a + " là năm nhuận. ");
            }
        } else {
            System.out.println("Năm " + a + " không là năm nhuận. ");
        }
    }
}
