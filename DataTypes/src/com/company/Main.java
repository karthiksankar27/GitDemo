package com.company;

public class Main {

    public static void main(String[] args) {
        Integer e = Integer.MAX_VALUE;
        int f = Integer.MIN_VALUE;
        System.out.println("Max value is" + " " + e);
        System.out.println("Min value is" + " " + f);
        int a = 4000;
        byte b = 124;
        short c = 344;
        long d;
        d = 5000 + 10 * (a + b + c);
        System.out.println("The Value of D is" + " " + d);
        float g = (float) 5.55;
        System.out.println("value of g is" + " " + g);
        double h = 0.45359237;
        double i = (7 * h);
        System.out.println("the value of 7 pounds in kg is" + " " + i);
        boolean isAsec = true;
        if (isAsec == true) {
            System.out.println("A sec is tamil students");
        } else
            System.out.println("A sec is not tamil students");
        boolean Arul = false;
        if (!Arul) {
            System.out.println("Arul is the user");
        }
        //Ternary operator is the operator where the 2 conditons are used.
        int number = 45;
            boolean isluckynumber = number==4 ? true : false;
            System.out.println("Lucky number 4 is" + " " + isluckynumber);
            if (isluckynumber)
        System.out.println("Lucky no 4 is" + " " + isluckynumber);

            double x=20.00;
            double y=80.00;
            double z=(x+y)*100;
        System.out.println(z);
            double w=z%40;
        System.out.println(w);
            boolean isq = (w==0) ? true : false;
        System.out.println("the value of q is"+ " "+isq);
        if(!isq){
            System.out.println("got some remainder");
        }
    }
}

