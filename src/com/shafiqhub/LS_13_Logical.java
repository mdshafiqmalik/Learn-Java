package com.shafiqhub;

public class LS_13_Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        if (a && b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (!a && !b) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

        if (!b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
