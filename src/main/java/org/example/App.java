package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println("What is the order amount? ");
       Scanner sc = new Scanner(System.in);
       double order_amount = Double.parseDouble(sc.nextLine());
       System.out.println("What is the state? ");
       String state_input = sc.nextLine();
       double tax = 0;
       if(state_input.equals("WI")){
           tax = order_amount * 0.055;
           double sub_total = order_amount;
           double total = order_amount + tax;
           System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.", sub_total, tax, total );
           return;
       }

    }
}
