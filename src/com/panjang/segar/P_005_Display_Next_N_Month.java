package com.panjang.segar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P_005_Display_Next_N_Month {
    public static void main(String[] args){
        System.out.print("How many number of future months do you want to display? ");
        Scanner scan = new Scanner(System.in);
        int nMonths = scan.nextInt();
        scan.close();

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM yyyy");

        for(int i=1; i <= nMonths; i++){
            LocalDate nextMonth = currentDate.plusMonths(i);
            System.out.println(nextMonth.format(formatter));
        }

    }
}
