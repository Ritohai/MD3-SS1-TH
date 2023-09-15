import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int cd = sc.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int cr = sc.nextInt();
        System.out.println("Chu vi hcn là : " + (cd+cr)*2);
        System.out.println("Diện tích hcn là : " + cd*cr);

    }
}
