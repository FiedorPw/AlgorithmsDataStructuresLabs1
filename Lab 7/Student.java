package com.company;

public class Student {
    private int numerIndexu;
    private static String imie;
    private static String Nazwisko;

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

}
