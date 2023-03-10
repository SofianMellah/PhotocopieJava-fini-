package com.afpa.www.main;

import com.afpa.www.bean.Impression;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ValeurDemandee = 0;
        System.out.println("Combien de photocopies voulez vous faire ?");
        Impression ValeurDonnee = new Impression(sc.nextInt());
        ValeurDonnee.calcul();
    }
}