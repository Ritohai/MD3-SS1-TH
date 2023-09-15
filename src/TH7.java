import java.util.Scanner;

public class TH7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao: ");
        float a = sc.nextFloat();
        System.out.println("Nhập cân nặng: ");
        float b = sc.nextFloat();
        float BMI = (b/(a*a));
        System.out.println("Giá trị BMI là : " + BMI);
        if(BMI < 18.5){
            System.out.println("Gầy");
        } else if(BMI < 25 && BMI >= 18.5){
            System.out.println("Bình thường");
        } else if(BMI >= 25 && BMI < 30){
            System.out.println("Hơi béo");
        } else {
            System.out.println("Béo phì");
        }
    }
}
