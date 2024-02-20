package com.test;

public class Main {

    static class Test {
        int data;
        void run(){
            System.out.println("something");
        }
    }

    public static void main(String[] args) {
            Test t1 = new Test();
            t1.run();
            char ch = 66;
            System.out.println(ch);
    }
}