package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] income = new int[num];
        int[] incomeTax = new int[num];
        int[] taxPaid = new int[num];
        int max = taxPaid[0];
        Integer outcome;

        for (int i = 0; i < num; i++) {
            income[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            incomeTax[i] = sc.nextInt();
            taxPaid[i] = income[i] * incomeTax[i];
            if (taxPaid[i] > max) {
                max = taxPaid[i];
            }
        }
        outcome = new Integer(max);

        List<Integer> amount = new ArrayList<>(taxPaid.length);
        for (int i : taxPaid) {
            amount.add(i);
        }
        System.out.println(amount.indexOf(outcome) + 1);

    }
}

