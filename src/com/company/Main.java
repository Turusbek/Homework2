package com.company;

import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(num(15, 15));
        System.out.println(num(73, 5));
        System.out.println(num(36, -10));
        System.out.println(num(19, -25));
        System.out.println(num(13, 32));
    }




    public static String num(int age, float temperature) {

        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30)
            return "Можно идти гулять";
        else if (age < 20 && temperature >= 0 && temperature >= 28)
            return "Можно идти гулять";
        else if (age > 45 && temperature >= -10 && temperature <= 25)
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";
    }
    }

