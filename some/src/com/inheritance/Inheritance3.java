package com.inheritance;
//
class College{
    void about(){
        System.out.println("this is college ");
    }
}
class Student extends College{
    void about2(){
        System.out.println("this is student");
    }
}
class Faculty extends College{
    void about3(){
        System.out.println("this is faculty");
    }
}
public class Inheritance3 {
    public static void main(String[] args) {
        Faculty f = new Faculty();
        Student s = new Student();
        f.about3();
        f.about();    //college
        s.about2();
        s.about();
    }
}
