import java.util.Scanner;

public class Main3TH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int size = input.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }

            int target = input.nextInt();
            boolean found = false;
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (array[i] + array[j] == target) {
                        System.out.println(i + " " + j);
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }

            if (!found) {
                System.out.println("Not found");
            }
        }
        input.close();
    }
}