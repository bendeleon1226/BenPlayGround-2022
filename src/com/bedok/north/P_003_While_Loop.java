package com.bedok.north;

import java.util.Scanner;

public class P_003_While_Loop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int loopEnd = scan.nextInt();

        int i = 0;
        while(i<loopEnd)
            System.out.println(++i);
    }
}
