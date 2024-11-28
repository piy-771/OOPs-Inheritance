class  Animal1{
    void eat(){
        System.out.println("Eating..");
    }
}

class Cat extends  Animal1
{
    void meow(){
        System.out.println("Meow meow");
    }
}


class Kitten extends Cat{
    void kittenMeow(){
        System.out.println("Kitten meow");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Kitten obj = new Kitten();
        obj.meow();
        obj.eat();
        obj.kittenMeow();
    }
}
