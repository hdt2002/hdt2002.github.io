import java.util.Scanner;

class Student {
    private String name;
    private int age;
    public static int numOfStudents = 0;

    public void setNameAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        if (age >= 18) {
            System.out.println(this.name);
        }
    }
}

public class elab2302 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String name = input.nextLine();
            int age = Integer.parseInt(input.nextLine());

            Student s = new Student();
            Student.numOfStudents++;
            s.setNameAge(name, age);
            s.display();
        }
        input.close();
        System.out.println(Student.numOfStudents);
    }
}