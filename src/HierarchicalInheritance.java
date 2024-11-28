class Car{
    void speed(){
        System.out.println("Runs at 30m/hr");
    }
}

class Maruti extends  Car{
    void marutiSpeed(){
        System.out.println("Maruti runs at 40km/hr");
    }
}

class  Ford extends  Car{
    void fordSpeed(){
        System.out.println("Ford runs at 50km/hr");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Ford obj = new Ford();
        obj.fordSpeed();
        obj.speed();

        Maruti obj1 = new Maruti();
        obj1.marutiSpeed();
        obj1.speed();

    }
}
