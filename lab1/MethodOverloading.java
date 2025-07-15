package com.demo.lab1;

import com.demo.Exceptions.calculator;

import java.util.Scanner;

public class MethodOverloading {
    public void add(int a, int b){
        int res= a+b;
        System.out.println("The Sum 2 Numbers is : "+ res);
    }
    public  void add(int a, int b,int c){
        int res= a+b+c;
        System.out.println("The Sum 3 Numbers is : "+ res);
    }
    public void add(int a, int b,int c, int d){
        int res= a+b+c+d;
        System.out.println("The Sum 4 Numbers is : "+ res);
    }

    public static void main(String[] args) {
        int num1,num2,num3,num4;
        MethodOverloading cal= new MethodOverloading();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number 1");
        num1=sc.nextInt();
        System.out.println("Enter a number 2");
        num2=sc.nextInt();
        System.out.println("Enter a number 3");
        num3=sc.nextInt();
        System.out.println("Enter a number 4");
        num4=sc.nextInt();
//        System.out.println("A of");
        cal.add(num1,num2);
        cal.add(num1,num2,num3);
        cal.add(num1,num2,num3,num4);
    }


}
