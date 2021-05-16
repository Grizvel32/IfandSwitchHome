package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int mashaQ,mishaQ,take, sum;

        Scanner input = new Scanner(System.in);

        System.out.print("Маша собрала ");
        mashaQ = input.nextInt();

        System.out.print("Миша собрал ");
        mishaQ = input.nextInt();

        System.out.print("съели ");
        take = input.nextInt();

        sum = (mishaQ+mashaQ) - take;

        if(sum < mishaQ+mashaQ)
        {
            System.out.println("Impossible");
        }
        else
        {
            System.out.println("+"+ sum);
        }


    }
}
