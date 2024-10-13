import java.util.Scanner;

public class oop009 {
    public class Point {
        private int x, y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        public double slope(Point other) {
            return this.x == other.x ? -1 : (double) (other.y - this.y) / (other.x - this.x);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        oop009 main3 = new oop009();
        
        while (test > 0) {
            Point p1 = main3.new Point(input.nextInt(), input.nextInt());
            Point p2 = main3.new Point(input.nextInt(), input.nextInt());
            System.out.println(p1.slope(p2));
            test--;
        }
        input.close();
    }
}