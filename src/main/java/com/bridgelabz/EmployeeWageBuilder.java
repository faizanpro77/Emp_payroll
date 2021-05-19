package com.bridgelabz;

import java.awt.*;

public class EmployeeWageBuilder {
    public static void fun1() {
        int a = 10, b = 13, c;
        c = a + b;
        System.out.println(c);
    }
    public static void main(String[] args){
        System.out.println("welcom");
       int IS_PRESENT = 1;
       double empCheck = Math.floor((Math.random() * 10)) % 2;
        System.out.println(empCheck);
       if(empCheck == IS_PRESENT) {
           System.out.println("employ is present");
       }else {
           System.out.println("employ is absent");
       }
        EmployeeWageBuilder.fun1();
    }
}
