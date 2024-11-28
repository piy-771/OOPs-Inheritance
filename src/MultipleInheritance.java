//class A{
//    void test(){
//        System.out.println("This is class A");
//    }
//}
//
//class B {
//    void test(){
//        System.out.println("This is class B");
//    }
//}
//
//class C extends A,B{
//
//}

interface  A{
    default void  testA(){
        System.out.println("Test A of interface A");
    }
}
interface B{
    default void testB(){
        System.out.println("Test B of Interface B");
    }
}

class C implements A,B{
    public  void myMethod(){
        System.out.println("This is my method of my class");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.myMethod();
        obj.testA();
        obj.testB();
    }
}
