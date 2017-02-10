// Author: Cori Nicole Bradshaw
// Class: Administrator
// This class is an extension of the superclass Employee
// it inherits all members from the Employee class
// This class contains 1 field, 1 constructor, and 3 methods.

public class Administrator extends Employee {

    private String department;

    public Administrator(String employeeName, int employeeNumber, String dept){
        super(employeeName,employeeNumber);
        department = dept;
    }
    public void setDepartment(String dept){
        department = dept;
    }
    public String getDepartment(){
        return department;
    }
    public String toString(){
        return "Admin      " + super.toString() + "   Department " + department;
    }
}
