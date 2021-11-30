package com.company;

import java.sql.SQLOutput;

public class Couch extends Furniture{
    public Couch(int numberOfPeopleSleepingComfortablyInIt, String description){
        super(description);

    }

    @Override
    public String toString() {
        return "Kanapa "+ super.getdescription();
    }
}
