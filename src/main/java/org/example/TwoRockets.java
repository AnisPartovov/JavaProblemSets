package org.example;

public class TwoRockets {


    public static void top(){
        System.out.println("   /\\          /\\"  );
        System.out.println("  /  \\        /  \\ ");
        System.out.println(" /    \\      /    \\");
    }
    public static void boxes(){
        System.out.println("+------+   +-------+");
        System.out.println("|      |   |       |");
        System.out.println("|      |   |       |");
        System.out.println("+------+   +-------+");
    }
    public static void main(String[] args) {
        top();
        boxes();
        System.out.println("|UCA-CS|   |UCA-CS |");
        System.out.println("|NARYN |   |NARYN  |");
        boxes();
        top();
    }
}