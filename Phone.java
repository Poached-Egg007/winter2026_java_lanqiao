package JavaDay3.JavaDay4.JavaDay5.JavaDay6.JavaDay7;

public class Phone {
    String brand;
    double price;
    public Phone(String brand,double price){
        this.brand = brand;
        this.price=price;
    }
    public void call(){
        System.out.println(brand+"手机正在打电话...");
    }
    public void call(String name){
        System.out.println(brand+"手机正在给"+name+"打电话...");
    }
}
