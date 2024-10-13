public class holiday {
    public class Dog {
    private String name;
    private String breed;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDogDetail() {
        System.out.println("Name:" + name + "--Breed:" + breed + "--Age:" + age);
    }
    }
    public static void main(String[] args) {
        holiday holiday = new holiday();
        Dog dog = holiday.new Dog();
        dog.setName("Micky");
        dog.setBreed("Husky");
        dog.setAge(12);
        dog.printDogDetail();
    }

}