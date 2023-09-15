import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số t nhiên bất kì: ");
        int number = sc.nextInt();
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                System.out.println("Số "+number+ " vừa chia hết cho 3 và 5" );
            } else {
                System.out.println("Số "+number+ " chỉ chia hết cho 3, không chia hết cho 5");
            }
        } else {
            System.out.println("Không chia hết cho 3 và 5");
        }
    }
}
