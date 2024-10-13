import java.util.Scanner;

public class Basic009 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt(); // Số lượng test case
    for (int i = 0; i < n; i++) {
      double x = scanner.nextDouble(); // Tọa độ x
      double y = scanner.nextDouble(); // Tọa độ y
      int quadrant = quadrant(x, y); // Xác định góc phần tư
      System.out.println(quadrant); // In ra kết quả
    }
    scanner.close();
  }

  public static int quadrant(double x, double y) {
    if (x == 0 || y == 0) {
      return 0;
    } else if (x > 0 && y > 0) {
      return 1;
    } else if (x < 0 && y > 0) {
      return 2;
    } else if (x < 0 && y < 0) {
      return 3;
    } else {
      return 4;
    }
  }
}
