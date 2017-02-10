// Author: Cori Nicole Bradshaw
// Class: Surgeon
// This class is an extension of the superclass Employee
// it inherits all members from the Employee class
// This class contains 2 fields, 1 constructor, and 5 methods.

public class Surgeon extends Employee{

    private String specialty;
    private boolean operating;

    public Surgeon(String employeeName, int employeeNumber, String spec, boolean op){
        super(employeeName,employeeNumber);
        specialty = spec;
        operating = op;
    }
    public void setSpecialty(String spec){
        specialty = spec;
    }
    public String getSpecialty(){
    return specialty;
    }
    public void setOperating(boolean op){
        operating = op;
    }
    public boolean getOperating(){
    return operating;
    }
    public String toString(){
         String job;
        if(operating == true){
           job = "Y";
        }
        else
            job = "N";
        return "Surgeon    "+super.toString() + "   Specialty: " + specialty + "   Operating: " + job;
    }
}

