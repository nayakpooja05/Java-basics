package javaoops;

abstract class vehicle1{
    abstract void m1();
    void m2() {
        System.out.println("Given vehicles are: ");
    }
}
public class AbstractEx extends vehicle1 {
    

    public static void main(String[] args) {
        AbstractEx obj = new AbstractEx();
        
        obj.m2();
        obj.m1();

    }
    void m1() {
        System.out.println("Car,Bus,Truck");
    }

}
