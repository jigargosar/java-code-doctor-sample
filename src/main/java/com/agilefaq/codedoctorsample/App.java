package com.agilefaq.codedoctorsample;

/**
 * Hello world!
 */
public class App {
    public static int calc(int a1, int a2) {
        return a1 + a2;
    }

    public static int calc2(int a1, int a2) {
        return a1 - a2;
    }

    public static int multiply(int a1, int a2) {
        Point point = new Point();
        Point point1 = new Point();
        if (point1 == point) {
            System.out.println("Equal");
        }
        return a1 * a2;
    }

    public static int multiply4(int a1, int a2) {
        String a = null;
        System.out.println(a.charAt(0));
        if (a1 == 1) {
            a1 = 2;
        }
        if (a1 == 1) {
            a1 = 2;
        }
        if (a1 == 1) {
            a1 = 2;
        }
        if (a1 == 1) {
            a1 = 2;
        }
        if (a1 == 1) {
            a1 = 2;
        }
        return a1 * a2;
    }
}


class Point {
    private int x = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        return x == point.x;
    }

    @Override
    public int hashCode() {
        return x;
    }
}
