package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        int guest, parts;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите количество гостей: ");
        guest = input.nextInt();

        if(guest%2==0) {
            parts = guest/2;
        }
        else {
            parts = guest;
        }
        System.out.println("Количество разрезов = "+parts);
    }
}
