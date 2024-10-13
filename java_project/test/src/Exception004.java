import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Exception004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine(); // Consume newline

        while (test-- > 0) {
            String name = input.nextLine().trim();
            int age = input.nextInt();
            input.nextLine(); // Consume newline

            try {
                Person person = new Person(name, age);
                validatePerson(person);
                System.out.println("Name: " + person.getName() + "--Age:" + person.getAge());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        input.close();
    }

    private static void validatePerson(Person person) {
        if (person.getName().isEmpty() || person.getName().length() > 40) {
            throw new IllegalArgumentException("Name is not valid");
        }
        if (person.getAge() < 0 || person.getAge() > 120) {
            throw new IllegalArgumentException("Age is not valid");
        }
    }
}
