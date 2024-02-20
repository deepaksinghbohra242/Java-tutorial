package com.inheritance;

class Vehicle{
     int a =20;
     void about(){
        System.out.println("Can be of any type");
    }
}
class Car extends Vehicle{
    void tyre(){
        System.out.println("contain four tyre" + a);
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.about();
        c.tyre();
    }
}
