package com.Soumyajit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("TAX Calculator App");
        System.out.println("-----WELCOME-----");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total person count: ");
        int person = scan.nextInt();
        String[] name = new String[person];
        long[] income = new long[person];

        //System.out.print("Enter the name: ");
            for (int i = 0; i < person; i++) {
                System.out.println("Enter name: " + (i + 1));
                name[i] = scan.next();
                System.out.println("Enter " + name[i] + "'s income: ");
                income[i] = scan.nextInt();

            }
            scan.close();

            System.out.println("Names with liable taxes");
            System.out.println("------------------------");
            for (int j = 0; j<person; j++) {
                calculateTax(name[j], income[j]);
            }
    }
        private static void calculateTax(String name, long income){
        long tax = 0;

        if (income>=300000){

           tax = income*20/100;
            System.out.println(name + ":" + tax);

            }else if (income>=100000){
            tax=income*10/100;
            System.out.println(name + ":" + tax);


        }else if (income<99999){
            tax = 0L;
            System.out.println(name + ":" + tax );
        }


    }
}
