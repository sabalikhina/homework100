package com.example.homework100;

public class main {
    public static void main(String[] args) {
        int check = 100;
        int amount = 1200;
        int bonus;

        if (amount < 1000) {
            bonus = 0;
        } else {
            bonus = amount / 100;
        }

        int check1 = check + amount + bonus;

        System.out.println("Бонусов начислено " + bonus);
        System.out.println("Итого на счету " + check1);
    }
}
