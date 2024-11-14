package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField {
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public CoreCompetency() {
//        this.id = nextId;
//        nextId++;
//    }


    public CoreCompetency(String value) {
//        this();
// this.value = value;
        super(value);
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        if(super.getValue().isEmpty())
        {
            super.setValue("Data not available");
        }
        return super.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency coreCompetency = (CoreCompetency) o;
        return getId() == coreCompetency.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.

//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//    public int getId() {
//        return id;
//    }

}
