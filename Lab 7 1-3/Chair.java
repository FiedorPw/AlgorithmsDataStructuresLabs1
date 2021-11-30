package com.company;

public class Chair extends Furniture{
    public Chair(String description){
        super(description);

    }
    @Override
    public String toString() {
        return "Krzesło "+ super.getdescription();
    }
}
