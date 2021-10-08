package com.company;

public class Main {
    static String name = "Amila";
    public final int serialNum=10;
    boolean isActive = false;
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Name:"+name);

        String myName = "Amila" + "  sampatth";
        System.out.println(myName);


        int valA = 10;
        double valB = (double) valA;

        // specific reson
        /*start
        comment here

        end */
        int valC = valA /(int)2.5;
        System.out.println("valC = " + valC);
        int age = 88;
        // user param
        if (age  < 18){

            System.out.println("not eligible for a driving License");
        }
        else if (age > 80){
            System.out.println("Too old to drive.please submit a health check results");
        }
        else {
            System.out.println("allowed to apply");
        }

        switch ((age)){
            case 88:
                System.out.println("allowed for a driving License");
                break;

        }




    }
}
