package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }

    public PositionType(String value) {
//        this();
//        this.value = value;
        super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    public String toString()
    {
        if(super.getValue().isEmpty())
        {
            super.setValue("Data not available");
        }
        return super.getValue();
    }


    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType positionType = (PositionType) o;
       // return id == that.id && Objects.equals(value, that.value);
        return getId() == positionType.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // Getters and Setters:

//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

}
