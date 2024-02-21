package static2.ex;

public class Car {
    private static int count;
    private String name;

    public Car(String name){
        this.name = name;
        System.out.println("차량구입, 이름: " + name);
        count ++;
    }
    static void showTotalCars(){
        System.out.println(count);
    }
}
