package com.bedok.north;

import java.util.Scanner;

public class P_001_IfElse {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int N = scanner.nextInt();
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");
        scanner.close();
        if(N<1){
            System.out.print("I will throw my exception here.");
            System.exit(1);
        }

        if (N%2 != 0){
            System.out.print("Weird");
        } else {
            if(N>=2 && N<=5){
                System.out.print("Not Weird");
            } else if(N>=6 && N<=20){
                System.out.print("Weird");
            } else {
                System.out.print("Not Weird");
            }
        }

    }
}
