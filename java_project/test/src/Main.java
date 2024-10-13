class Animal {
    int legs;

    Animal (int legs){
        this.legs= legs;
    }
    void walk(){
        System.out.println("This animal walks on" + legs + "legs");
    }
    void eat(){}
}
class Spider extends Animal { 
    void Spider() {
    }
    void eat() {
        System.out.println("The spider eats a fly.");
    }
}
class Fish extends Animal {
    String name;

    Fish (String name){
        this.name = name;
    }
}
public class Main {
    
}
