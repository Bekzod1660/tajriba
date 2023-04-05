package com.example.tajriba;

import org.springframework.stereotype.Controller;



public class A {
    public static void main(String[] args) {

        String a="A";
        String b="A";
        System.out.println((a==b) +" == ");
        System.out.println(a.equals(b)  +" equals()");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
    public String add(){
        return "ishladi";
    }
}
