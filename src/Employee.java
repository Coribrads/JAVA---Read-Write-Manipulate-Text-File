// Author: Cori Nicole Bradshaw
// Class: Employee
// This class contains 2 fields, 2 constructors, and 6 methods (one of which is irrelevant and unused).

public class Employee {

    private String name;
    private int number;

   public Employee(){
    }
    public Employee(String employeeName, int employeeNumber){
        name = employeeName;
        number = employeeNumber;
    }

    public void setName(String employeeName){
        name = employeeName;
    }
    public String getName(){
        return name;
    }
    public void setNumber(int employeeNumber){
        number = employeeNumber;
    }
    public int getNumber(){
        return number;
    }
    public String toString(){
        return " Name: "+ name + "  Employee Number: "+ number;

    }

  
    public void saveData(){
    // saveData was done in addFile and deleteFile to save space.
    }



 }
         