package org.example;

public class StarFigures {

    public static void first(){
        System.out.println("*****");
        System.out.println("*****");
    }
    public static void second(){
        System.out.println(" * * ");
        System.out.println("  *  ");
        System.out.println(" * * ");

    }
    public static void third(){
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
    }
    public static void main(String[] args) {
        first();
        second();
        System.out.println("");
        first();
        second();
        first();
        System.out.println("");
        third();
        second();
        first();

    }
}
