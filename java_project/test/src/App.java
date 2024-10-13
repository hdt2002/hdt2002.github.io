//In ra du lieu nhap vao va in ra + Hi
import java.util.Scanner;
public class App {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();

        input.nextLine(); // Đọc dòng mới sau khi đọc số nguyên

        while (test > 0) {
            String line = input.nextLine();
            System.out.println("Hi " + line);
            test--;
        }

        input.close();
    }
}
