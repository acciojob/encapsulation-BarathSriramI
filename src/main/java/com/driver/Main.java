package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly obj= new RWOnly();
//        obj.name="Ram";
//        System.out.println(obj.name);
        // name has private access in RWOnly.java
        obj.setName("Ram");
        obj.getName();
//        System.out.println(obj.getName());
    }
  
}