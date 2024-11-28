class Animal{
    void eat(){
        System.out.println("eating...");
    }
}

class  Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.eat();
        obj.bark();
    }
}
