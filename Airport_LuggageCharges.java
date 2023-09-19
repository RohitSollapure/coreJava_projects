package coreJava_projects;

import java.util.Scanner;

public class Airport_LuggageCharges {
    static int avg_weight = 20;
    static int avg_amount = 10;

    public static void main(String[] args) {
        int exs_weight, exs_amount, total_amount;
        int total_weight;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the total net weight of luggage");
        total_weight = s.nextInt();

        if (total_weight <= avg_weight) {
            System.out.println("YOUR TOTAL AMOUNT FOR PAY IS:-" + avg_amount + "$");
        }

        else if (total_weight > avg_weight) {
            exs_weight = total_weight - avg_weight;
            exs_amount = exs_weight * 2;
            total_amount = exs_amount + avg_amount;

            System.out.println("Sry...  You are carring-" + exs_weight
                    + "kg exis weight of luggage.  Thats why we are Charging  Extra-" + exs_amount
                    + "$ exis amount for your extra kg's");
            System.out.println("And Your Total amount to pay for your Luggage is:- " + total_amount + "$");

        }

    }
}
