import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc sang chữ: ");
        int number = sc.nextInt();
        String numberString = "";
        if (number > 999 || number < 0) {
            System.out.println("Nhập sai, nhập trong khoảng 0-999");
            main(args);
        }
        int hundred = number / 100;
        switch (hundred) {
            case 1:
                numberString = "One hundred ";
                break;
            case 2:
                numberString = "Two hundred ";
                break;
            case 3:
                numberString = "Three hundred ";
                break;
            case 4:
                numberString = "Four hundred ";
                break;
            case 5:
                numberString = "Five hundred ";
                break;
            case 6:
                numberString = "Six hundred ";
                break;
            case 7:
                numberString = "Seven hundred ";
                break;
            case 8:
                numberString = "Eight hundred ";
                break;
            case 9:
                numberString = "Nine hundred ";
                break;
        }
        int tenn = number % 100;
        if (tenn >= 20) {
            int tens = tenn / 10;
            switch (tens) {
                case 2:
                    numberString += "Twenty ";
                    break;
                case 3:
                    numberString += "Thirty ";
                    break;
                case 4:
                    numberString += "Forty ";
                    break;
                case 5:
                    numberString += "Fifty ";
                    break;
                case 6:
                    numberString += "Sixty ";
                    break;
                case 7:
                    numberString += "Seventy ";
                    break;
                case 8:
                    numberString += "Eighty ";
                    break;
                case 9:
                    numberString += "Ninety ";
                    break;
                default:
                    numberString += "";
            }
        }
        int dv = tenn % 10;
        switch (dv) {
            case 1:
                numberString += "One ";
                break;
            case 2:
                numberString += "Two ";
                break;
            case 3:
                numberString += "Three ";
                break;
            case 4:
                numberString += "Four";
                break;
            case 5:
                numberString += "Five ";
                break;
            case 6:
                numberString += "Six ";
                break;
            case 7:
                numberString += "Seven";
                break;
            case 8:
                numberString += "Eight";
                break;
            case 9:
                numberString += "Nine ";
                break;

        }
        if (number > 10 && number < 20) {
            int te = number % 10;
            switch (te) {
                case 1:
                    numberString = "Eleven";
                    break;
                case 2:
                    numberString = "Twelve";
                    break;
                case 3:
                    numberString = "Thirteen";
                    break;
                case 4:
                    numberString = "Fourteen";
                    break;
                case 5:
                    numberString = "Fifteen";
                    break;
                case 6:
                    numberString = "Sixteen";
                    break;
                case 7:
                    numberString = "Seventeen";
                    break;
                case 8:
                    numberString = "Eighteen";
                    break;
                case 9:
                    numberString = "Nineteen";
                    break;
            }
        }
        System.out.println(numberString);

    }
}