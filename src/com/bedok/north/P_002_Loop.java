package com.bedok.north;

import java.util.Scanner;

public class P_002_Loop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int loopEnd = scan.nextInt();

        for(int i=0; i<loopEnd; )
            System.out.println(++i);
    }
}
