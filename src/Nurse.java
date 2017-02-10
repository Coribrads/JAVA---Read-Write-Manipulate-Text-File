// Author: Cori Nicole Bradshaw
// Class: Nurse
// This class is an extension of the superclass Employee
// it inherits all members from the Employee class
// This class contains 1 field, 1 constructor, and 3 methods.

public class Nurse extends Employee{
   
    private int numpatients;

    public Nurse(String employeeName, int employeeNumber, int patients){
        super(employeeName, employeeNumber);
        numpatients = patients;
    }
    public void setNumpatients(int patients){
        numpatients = patients;
    }
    public int getNumpatients(){
    return numpatients;
        }
    public String toString(){
        return "Nurse      " +super.toString() + "   Number of Patients: " + numpatients;
    }
}
