package com.company;

public class Person {
    private static String imie;
    private static String Nazwisko;
    private static String Wydział;
    private static String Instytut;

    /*public Person(String name,String surname,String dział,String insty){
        imie = name;
        Nazwisko = surname;
        Wydział = dział;
        Instytut = insty;

    }*/


    public static String getimie(){
        return imie;
    }
    public static String getNazwisko(){
        return Nazwisko;
    }
    public static String getWydział(){
        return Wydział;
    }
    public static void setImie(String name){
        imie = name;
    }
    public static void setNazwisko(String surname){
        Nazwisko = surname;
    }
    public static void setWydział(String dzial){
        Wydział = dzial;
    }
}
