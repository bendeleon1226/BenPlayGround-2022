package com.panjang.segar;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class P_006_LoanMonthlyInstallmentCompute {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.println("Enter the loan tenure in months:");
        int loanTenure = scanner.nextInt();

        System.out.println("Enter the processing fee in percent:");
        double processingFeePercent = scanner.nextDouble();

        System.out.println("Enter the annual interest rate in percent:");
        double annualInterestRatePercent = scanner.nextDouble();

        double processingFee = loanAmount * processingFeePercent / 100;
        System.out.println("Processing Fee: " + processingFee);
        double monthlyInterestRate = annualInterestRatePercent / 12 / 100;
        System.out.println("Monthly interest rate in decimal value: " + monthlyInterestRate);

        double monthlyInstallment = loanAmount * (monthlyInterestRate / (1 - Math.pow(1+monthlyInterestRate, -loanTenure)));
        System.out.println("Monthly Installment before scaling: " + monthlyInstallment);
        monthlyInstallment = new BigDecimal(monthlyInstallment).setScale(2, RoundingMode.HALF_UP).doubleValue();

        System.out.println("The first month payment will be: " + (monthlyInstallment + processingFee));
        System.out.println("The remaining monthly payments will be: " + monthlyInstallment);
    }
}
