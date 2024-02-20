package com.polymorphism;

class A{
    void display(){
        System.out.println("something");
    }
}
class B extends A{

    void display(){
        System.out.println("fksandjkfdj");
    }
}
public class Overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
