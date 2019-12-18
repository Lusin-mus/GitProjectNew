package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 9;
        System.out.println("The Factorial of the number" + " " + n + " " + "is" +
                " " + (Factoryal(n)));
    }

    public static int Factoryal(int n) {
        if (n<=0) {
            return 1;
        }
        return n*Factoryal(n-1);
}
}
