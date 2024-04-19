package com.rsg.flowconntrol;
public class ArrayVariableUsingForLoop {

    public static void main(String[] args) {

        int[] a = new int[7];
        a[0] = 10;
        a[1] = 52;
        a[2] = 45;
        a[3] = 62;
        a[4] = 78;
        a[5] = 55;
        a[6] = 85;
       // a[7] = 90;

        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);

        }
    }
}