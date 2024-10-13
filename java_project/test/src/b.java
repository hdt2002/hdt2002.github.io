import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine(); // Đọc dòng thừa sau số lượng test case
        
        for (int t = 0; t < testCases; t++) {
            String[] tokens = sc.nextLine().split(" ");
            int[] array = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                array[i] = Integer.parseInt(tokens[i]);
            }
            System.out.println(longestSortedSequence(array));
        }
        
        sc.close();
    }
    
    public static int longestSortedSequence(int[] array) {
        if (array.length == 0) return 0;
        
        int maxLength = 1;
        int currentLength = 1;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 1;
            }
        }
        
        return Math.max(maxLength, currentLength);
    }
}
