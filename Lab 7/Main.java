package com.company;

public class Main {

    public static void main(String[] args) {
        Student bezpiecznik = new Student();
        Teacher Iksiński = new Teacher();
        bezpiecznik.setImie("Maciek");
        bezpiecznik.setNazwisko("Cybernik");
        System.out.println(bezpiecznik.getimie());
        System.out.println(bezpiecznik.getNazwisko());

        Teacher.setImie("Krzysztof");
        Teacher.setNazwisko("Matmiński");
        Teacher.setStopieńNaukowy("Doktor");
        System.out.println(Teacher.getimie());
        System.out.println(Teacher.getNazwisko());
        System.out.println(Teacher.getStpieńNaukowy());

    }
}
