package calculator;
import java.util.Scanner;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> earnedAmount = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        earnedAmount.put("Bubblegum", 202);
        earnedAmount.put("Toffee", 118);
        earnedAmount.put("Ice cream", 2250);
        earnedAmount.put("Milk chocolate", 1680);
        earnedAmount.put("Doughnut", 1075);
        earnedAmount.put("Pancake", 80);
        int income = 0;

        System.out.println("Earned amount:");
        for(String product: earnedAmount.keySet()){
            System.out.println(product + ": $" + earnedAmount.get(product));
            income += earnedAmount.get(product);
        }
        System.out.println();
        System.out.println("Income: $" + income);;
        System.out.println("Staff expenses");
        int staffExpenses = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Other expenses");
        staffExpenses += scanner.nextInt();
        System.out.println("Net income: $" + (income-staffExpenses));


    }

    }
