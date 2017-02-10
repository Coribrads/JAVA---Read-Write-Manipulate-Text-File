// Author: Cori Nicole Bradshaw
// Class: Receptionist
// This class is an extension of the superclass Employee
// it inherits all members from the Employee class 
// This class contains 2 fields, 1 constructor, and 5 methods.

public class Receptionist extends Employee{
    private String department;
    private boolean answering;

    public Receptionist(String employeeName, int employeeNumber, String dept, boolean phone){
        super(employeeName,employeeNumber);
        department = dept;
        answering = phone;
    }
    public void setDepartment(String dept){
        department = dept;
    }
    public String getDepartment(){
        return department;
    }
    public void setAnswering(boolean phone){
       answering = phone;
    }
    public boolean getAnswering(){
    return answering;
    }
    public String toString(){
         String job;
        if(answering == true){
           job = "Y";
        }
        else
            job = "N";
        return "Reception  "+ super.toString() + "   Department: " + department + "   Answering: " + job;
    }

    }
