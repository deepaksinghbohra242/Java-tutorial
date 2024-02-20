package com.polymorphism;

public class Area {
    static void area(int side){
        System.out.println("area of square" + side * side);
    }
    static void area(int length , int breadth){
        System.out.println("area of reactangle" + length*breadth);
    }
    static void area(float radius){
        System.out.println("area of circle" + 3.14*radius*radius);
    }
    public static void main(String[] args) {

        int a = 10 , b = 20;
        float c =2;

        area(a);
        area(b);
        area(a,b);
        area(c);

    }
}
