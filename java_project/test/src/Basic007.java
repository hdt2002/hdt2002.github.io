// Nam nhuan va nam khong nhuan
import java.util.Scanner;

public class Basic007 {
    public static void main(String[] args) {
          
    Scanner input = new Scanner(System.in);
    int test = input.nextInt();
    input.nextLine();
    while(test-- >0){
        int year = input.nextInt();
        if (((year % 4 == 0)&& (year % 100 != 0)||(year % 400 == 0 ))){
            System.out.println(year + " : Leap-year");
        }
        else{
            System.out.println(year + " : Non Leap-year");
        }
    }
    input.close();
}
}
