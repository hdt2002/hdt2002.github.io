import java.util.Scanner;
public class LAB01 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();

        while (test > 0) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();
            int num4 = input.nextInt();
            int num5 = input.nextInt();
            int sum = num1 + num2 + num3 + num4 + num5;
            System.out.println(sum);
            test--;
        }

        input.close();
    }
}
