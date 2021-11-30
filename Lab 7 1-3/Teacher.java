package com.company;

public class Teacher extends Person{
    private static String imie;
    private static String Nazwisko;
    private static String Wydział;
    private static String Instytut;
    private static int numerPokoju;
    private static String stopieńNaukowy;
    public Teacher(String name,String surname,String dział,String insty,int koju){
        imie = name;
        Nazwisko = surname;
        Wydział = dział;
        Instytut = insty;
        numerPokoju = koju;
    }

    public static void setStopieńNaukowy(String stopien){
        stopieńNaukowy = stopien;
    }
    public static String getStpieńNaukowy(){
        return stopieńNaukowy;
    }

}
