package com.mycompany.pr3_3;

import java.util.Scanner;

public class Pr3_3 {

    public static void main(String[] args) {
        System.out.println("RIBO-04-21 v4 Romanov I.V.");
        Scanner scan = new Scanner(System.in);
        System.out.print("Name = ");
        String aj = scan.nextLine();

        Plant myPlant = new Plant(aj);

        Gardener.filter(myPlant.getName());

        System.out.println(myPlant.getName() + ", " + Gardener.getName());
    }
}