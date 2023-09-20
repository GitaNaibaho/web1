import java.util.Scanner;
public class bilanganmaksimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int maxNum;

        System.out.println("Masukan nilai pertama :");
        num1 = scanner.nextInt();
        System.out.println(num1);

        System.out.println("Masukkan nilai kedua :");
        num2 = scanner.nextInt();
        System.out.println(num2);

        System.out.println("Masukkan nilai ketiga :");
        num3 = scanner.nextInt();
        System.out.println(num3);

        if (num1 >= num2) {
            maxNum = num1;
        } else if (num2>=num3){
            maxNum = num2;
        }else if (num1>=num3){
            maxNum = num1;
        }else {
            maxNum = num3;
        }
        System.out.println("Nilai maksimumnya adalah :" + maxNum);
    }
}
 
