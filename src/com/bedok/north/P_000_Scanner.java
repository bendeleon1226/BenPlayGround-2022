package com.bedok.north;

import java.util.Scanner;

public class P_000_Scanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " +d);
        System.out.println("Int: " +i);
    }
}
