import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị tiền USD: ");
        int a = sc.nextInt();
        int rate = 23000;
        System.out.println("Giá trị chuyển đổi " + a+ " USD sang VND là: "+ a*rate);
    }
}
