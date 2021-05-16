package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int firstDigit,secondDigit,answerDigit;
        boolean check;

        Scanner input = new Scanner(System.in);


        System.out.print("Введите первое число: ");
        try {
            firstDigit = input.nextInt();
        }
        catch (Exception e)
        {
            System.out.print("Вы ввели первое число неправильно, введите целое число");
            return;
        }


        System.out.print("Введите второе число: ");
        try {
            secondDigit = input.nextInt();
        }
        catch (Exception e)
        {
            System.out.print("Вы ввели второе число неправильно, введите целое число");
            return;
        }

        System.out.print("Введите ответ: ");
        try {
            answerDigit = input.nextInt();
        }
        catch (Exception e)
        {
            System.out.print("В ответе должно быть целое значение");
            return;
        }

        if(firstDigit*secondDigit == answerDigit) {

            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }





        

    }
}
