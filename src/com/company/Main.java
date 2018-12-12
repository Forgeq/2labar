package com.company;


public class Main {

    public void power (int a, int n) //  n - степень, a - умножитель
    {
        System.out.println("First");
        int pow = 5;
        for (int i = 1; i <= n; i++)
        {
            pow *= a;
            System.out.println(a + "^" + i + " = " + pow);
        }
    }

    public int factorial(int n) {
        System.out.println("Second");
        int factorial = 1;
        if ( n < 1 )
            System.out.println(" Error");
        else
            for (int i = 1; i <= n; i++)
                factorial = factorial*i;

        return factorial;
    }
    public void sumDifMulti (int a, int b) {
        System.out.println(" Еhird");
        int sum, dif, multi;
        sum = a + b;
        dif = a - b;
        multi = a * b;
        System.out.println("Sum = " + sum +
                "\nDifference = " + dif +
                "\nMultiply = " + multi);
    }

    public void timeHight (int h) {
        System.out.println("Fourth");
        final int g = 10;  // g = 9.81 м/с - ускорение свободного падение тела
        int t = 0;
        t = (int)Math.sqrt(2*h/g);
        System.out.println("Время свободного падения " + t);
    }

    public void lengthCatet (int c, int a) {
        System.out.println("\n" + "Fifth");
        int b = 0;
        if (c < 0 && a < 0)
            System.out.println("Отрицательное число!");
        else
        {
            b = (int)Math.sqrt(a*a + c*c);
            System.out.println("Длинна " + b);
        }

    }


    public static void main (String[] args) {
        Main LAB2 = new Main();

        LAB2.power(2, 9);
        System.out.println(LAB2.factorial(10));
        LAB2.timeHight(100);
        LAB2.sumDifMulti(2,2);
        LAB2.lengthCatet(2,3);
    }
}




