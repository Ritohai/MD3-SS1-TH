import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm Toán: ");
        int toan = sc.nextInt();
        System.out.println("Nhập điểm Lý: ");
        int ly = sc.nextInt();
        System.out.println("Nhập điểm Hóa: ");
        int hoa = sc.nextInt();
        System.out.println("Nhập điểm Văn: ");
        int van = sc.nextInt();
        System.out.println("Nhập điểm Tiếng Anh: ");
        int ta = sc.nextInt();
        float tb = (toan + ly + hoa + van + ta) /5;
        System.out.println("Điểm trung bình là: "+tb);
        if(tb <5){
            System.out.println("Yếu");
        } else if(tb >= 5 && tb < 6.5){
            System.out.println("Trung bình");
        } else if(tb >= 6.5 && tb < 8){
            System.out.println("Khá");
        } else if(tb >= 8 && tb < 9 ){
            System.out.println("Giỏi");
        } else {
            System.out.println("Xuất sắc");
        }
    }
}
