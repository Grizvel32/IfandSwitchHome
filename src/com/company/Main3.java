package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        int commonQuantity, petyaQ, kateQ, sergeyQ;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите общее кол-во журавликов ");
        commonQuantity = input.nextInt();

        petyaQ = commonQuantity/6;
        kateQ = 4*petyaQ;
        sergeyQ = petyaQ;

        System.out.println(String.format("Петя = %d Катя = %d Сережа = %d", petyaQ,kateQ,sergeyQ));

    }
}
