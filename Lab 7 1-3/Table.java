package com.company;

import java.util.Objects;

public class Table extends Furniture {
    private int numberOfLegs;
    public Table(int numberOfLegs, String description){
        super(description);
        this.numberOfLegs = numberOfLegs;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return numberOfLegs == table.numberOfLegs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfLegs);
    }

    @Override
    public String toString() {
        return "stół "+ super.getdescription();
    }
}
