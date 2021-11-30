package com.company;

public class Teacher {
    private static String imie;
    private static String Nazwisko;
    private static String stopieńNaukowy;


    public static String getimie(){
        return imie;
    }
    public static String getNazwisko(){
        return Nazwisko;
    }
    public static void setImie(String name){
        imie = name;
    }
    public static void setNazwisko(String surname){
        Nazwisko = surname;
    }
    public static void setStopieńNaukowy(String stopien){
        stopieńNaukowy = stopien;
    }
    public static String getStpieńNaukowy(){
        return stopieńNaukowy;
    }
}
