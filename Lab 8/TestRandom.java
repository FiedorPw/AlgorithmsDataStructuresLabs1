package com.company;

import java.util.Random;

public class TestRandom {
    static Random randomGenerator = new Random();
    static int generateBoundedRandomInt(int bound) {
        return Math.abs(randomGenerator.nextInt()) % bound;
    }
    public static void main(String[] args) {
        int max = 2 * (Integer.MAX_VALUE / 3);
        int[] tableOfRandoms = new int[1_000_000];
        for (int i = 0; i < tableOfRandoms.length; i++) {
            tableOfRandoms[i] = generateBoundedRandomInt(max);
        }
        int lowCounter = 0, highCounter = 0, halfMax = max >> 1;
        for (int a : tableOfRandoms) {
            if (a < halfMax) {
                lowCounter++;
            } else {
                highCounter++;
            }
        }
        System.out.println("max= " + max +
                " max/2= " + halfMax);
        System.out.println("lowCounter= " + lowCounter +
                " highCounter= " + highCounter);
   /*
   dla low counter będą to 2/3 z 1 000 000
   dla high counter będą to 1/3 z 1 000 000 około
   tablicy nie trzeba było uzyć mozna było użyć if odrazu w pętli for
   wartości odzwierciedlają oczekiwania
    */
    }
}