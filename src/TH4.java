import java.util.Scanner;

public class TH4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a:");
        float a = sc.nextFloat();
        System.out.println("Nhập số b:");
        float b = sc.nextFloat();
        System.out.println("Nhập số c:");
        float c = sc.nextFloat();
        float d = b*b -4*a*c;
        if(d < 0){
            System.out.println("Vô nghiệm.");
        } else if (d == 0) {
            System.out.println("PT c nghiệm kép: " + b/(2*a));
        } else {
            System.out.println("pt có nghiệm thứ nhất: " + (-b)/(2*a*c));
            System.out.println("pt có nghiệm thứ nhất: " + (b)/(2*a*c));
        }

    }
}
