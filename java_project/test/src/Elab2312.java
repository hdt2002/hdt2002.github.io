import java.util.Scanner;
public class Elab2312 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNextLine()) {
            String line = input.nextLine();
            int count = 0;
            for (int i =0 ;i < line.length();i++){
                if (Character.isDigit(line.charAt(i))){
                    count++;
                }
            }
        

            System.out.println(count);
        }

        input.close();
    }
}
