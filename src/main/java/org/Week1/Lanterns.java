package org.Week1;

public class Lanterns {
    public static void stars_top(){
        System.out.println("    *****");
    }
    public static void stars_bottom(){
        System.out.println("*************");
    }
    public static void stars(){
        stars_top();
        System.out.println("  *********");
        stars_bottom();
    }
    public static void sticks(){
        System.out.println("* | | | | | *");
    }

    public static void main(String[] args) {
        stars();
        stars();
        sticks();
        stars_bottom();
        stars();
        stars();
        stars_top();
        sticks();
        sticks();
        stars_top();
        stars_top();
    }
}
