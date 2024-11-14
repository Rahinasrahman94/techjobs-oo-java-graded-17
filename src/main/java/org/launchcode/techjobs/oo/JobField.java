package org.launchcode.techjobs.oo;

public abstract class JobField {


    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
   public String toString(){
       if(this.value.isEmpty())
       {
          this.value = "Data not available";
       }
       return this.value;
   }
    abstract  public boolean equals(Object o);
    abstract  public int hashCode();

}
