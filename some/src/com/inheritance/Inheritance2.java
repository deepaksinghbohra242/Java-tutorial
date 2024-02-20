package com.inheritance;

class Animal{
    void eat(){
        System.out.println("eating ...");
    }
}
class Dog extends Animal{
    private void talk(){
        System.out.println("Bark ... ");
    }
}
class BullDog extends Dog{
    void about(){
        System.out.println("Bull com.inheritance.Dog");
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        BullDog b = new BullDog();
        b.eat();
//        b.talk();
        b.about();
    }
}
