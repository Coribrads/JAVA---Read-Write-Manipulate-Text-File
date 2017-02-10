// Author: Cori Nicole Bradshaw
// Class: Janitor
// This class is an extension of the superclass Employee
// it inherits all members from the Employee class 
// This class contains 2 fields, 1 constructor, and 5 methods. 

public class Janitor extends Employee{

    private boolean sweeping;
    private String department;

    public Janitor(String employeeName, int employeeNumber, String dept , boolean job){
        super(employeeName,employeeNumber);
        department = dept;
        sweeping = job;
    }
    public void setDepartment(String dept){
        department = dept;
    }
    public String getDepartment(){
        return department;
    }
    public void setSweeping(boolean job){
        sweeping = job;
    }
    public boolean getSweeping(){
        return sweeping;
    }
    public String toString(){
        String job;
        if(sweeping == true){
           job = "Y";
        }
        else
            job = "N";
        return "Janitor    "+ super.toString()+ "   Department " + department +"   Sweeping " + job;
    }
}
