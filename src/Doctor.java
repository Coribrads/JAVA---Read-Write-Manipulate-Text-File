// Author: Cori Nicole Bradshaw
// Class: Doctor 
// This class is an extension of the superclass Employee
// it inherits all members from the Employee class

public class Doctor extends Employee {

    private String specialty;

    public Doctor(String employeeName, int employeeNumber, String spec){
        super(employeeName,employeeNumber);
        specialty = spec;
    }
    public void setSpecialty(String spec){
        specialty = spec;
    }
    public String getSpecialty(String spec){
    return specialty;
    }

    public String toString(){
        return "Doctor     "+ super.toString()+ "   Specialty: " + specialty;
    }
}

