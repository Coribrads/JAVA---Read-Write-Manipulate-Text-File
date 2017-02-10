// Author: Cori Nicole Bradshaw
// Class: HospitalEmployee
// This class is an extension of the superclass Employee
// it inherits all members from the Employee class
// This class contains 1 constructor and 1 method. 

public class HospitalEmployee extends Employee {

   public HospitalEmployee(String employeeName, int employeeNumber){
       super(employeeName,employeeNumber);
   }

public String toString(){
    return "H.Employee " + super.toString();
}
}

