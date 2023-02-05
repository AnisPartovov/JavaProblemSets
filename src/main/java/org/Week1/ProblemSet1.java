package org.Week1;

import java.lang.Math;
public class ProblemSet1 {
    public static void main(String[] args) {

        double s0 = 12.0;
        double v0 = 3.5;
        double a = 9.8;
        int t = 10;
        double s = s0 + v0 * t + (0.5 * a * Math.pow(t, 2));
        System.out.println(s);

    }

}
