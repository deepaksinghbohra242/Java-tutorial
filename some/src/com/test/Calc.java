package com.test;

import java.util.Scanner;

import static java.lang.System.exit;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Choose one option");
            System.out.println("1.Addition \n2.Subtraction \n3.Multipication \n4.Reminder \n5.Exit");
            int ch = sc.nextInt();
            System.out.println("Select first number");
            int a = sc.nextInt();
            System.out.println("Select second number");
            int b = sc.nextInt();
            int res = 0;
            switch (ch) {
                case 1:
                    res = a + b;
                    break;
                case 2:
                    res = a - b;
                    break;
                case 3:
                    res = a * b;
                    break;
                case 4:
                    res = a % b;
                    break;
                default:
                    exit(0);
            }
            System.out.println("The result is " + res);
            System.out.println("if you want to continue select 1");
            choose = sc.nextInt();
        } while (choose == 1);
    }
}
