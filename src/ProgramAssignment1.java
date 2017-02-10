// Author: Cori Nicole Bradshaw
// Class: ProgramAssignment1
// This class reads from the user specified text file and writes to the same file.
// This class contains 4 fields, 4 methods, and main method to execute the program. 

import java.util.Scanner;
import java.io.*;


    public class ProgramAssignment1 {

    private String filename;
    private int count;
    private String[] employeeArray;
    private  int size;

         public void readFile(String userFilename){


      filename = userFilename;
       try
        {
           Scanner inputStream = new Scanner(new FileInputStream(filename));

         while(inputStream.hasNext()){
             String parse = inputStream.next();
             count = count+1;
         }
            inputStream.close();


            employeeArray = new String[count];
            Scanner inputStream2 = new Scanner( new FileInputStream(filename));

            for(int i=0; i<count; i++){
                employeeArray[i] = inputStream2.next();
                size = size+1;
                //System.out.println(employeeArray[i]);

                }
            inputStream2.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File "+ filename+" was not found");
            System.out.println("or could not be opened.");
        }
        catch (IOException e)
        {
            System.out.println("Error reading from" + filename);
        }
    }
 public void deleteFile(String userFilename){

        Scanner keyboard = new Scanner(System.in);
        String deleteEmployee, deleteName, deleteRole;
        System.out.println("\nDo you want to delete an employee? (Y/N) \n");
        deleteEmployee = keyboard.next();

         if(deleteEmployee.equals("Y")|| deleteEmployee.equals("y")){
        System.out.println(" What is the Employees Role? \n");
        deleteRole = keyboard.next();
        deleteRole = deleteRole.trim();
        System.out.println(" What is the Employees Name? \n");
        deleteName = keyboard.next();

        System.out.println(" Are You Sure? Press Y to Save, N to Cancel. \n");
        String save = keyboard.next();
        if(save.equals("Y")|| save.equals("y")){
        File inFile = new File(userFilename);
        File tempFile = new File("tempFile.txt");
       try{
        BufferedReader reader = new BufferedReader(new FileReader(inFile));
        BufferedWriter writer = new BufferedWriter (new FileWriter(tempFile));


        String currentLine;

        while((currentLine = reader.readLine()) != null) {

            if(currentLine.contains(deleteRole) && currentLine.contains(deleteName)){
                continue;
            }
            writer.write(currentLine);
            writer.newLine();
            }

            writer.close();
            reader.close();
            inFile.delete();
            boolean successful = tempFile.renameTo(inFile);
            System.out.println(successful);
          }
       catch (FileNotFoundException e){
           System.out.println("File Not Found");
           System.exit(0);
       }
       catch(IOException e)
       {
           System.out.println(e);
           System.exit(0);
       }
        }
         }
        else{ deleteRole = " ";
              deleteName = " ";
        }


    }
  public void addFile(String userFilename){
        String userInputFile2 = userFilename;
        Scanner keyboard = new Scanner(System.in);
        String addEmployee, addName, addRole;
        System.out.println("\nDo you want to add an employee? (Y/N) \n");
        addEmployee = keyboard.next();

         if(addEmployee.equals("Y")|| addEmployee.equals("y")){
        System.out.println(" What is the Employees Role? \n");
        addRole = keyboard.next();
        addRole = addRole.trim();
        addRole = addRole.toLowerCase();
        System.out.println(" What is the Employees Name? \n");
        addName = keyboard.next();

        System.out.println(" Are You Sure? Press Y to Save, N to Cancel. \n");
        String save = keyboard.next();
        if(save.equals("Y")|| save.equals("y")){
                    int addNumber = 0;
                    int addNumpatients = 0;
                    String addDepartment = "none";
                    String addSpecialty = "none";
                    String addOperating = "N";
                    try {


			File file = new File(userInputFile2);

			BufferedWriter writer = new BufferedWriter(new FileWriter(userInputFile2,true));
                                if(addRole.equals("h")){
                                     writer.write(addRole+ " " + addName+ " " +addNumber+ "\n");
                                 }
                                 if(addRole.equals("d")){
                                     writer.write(addRole+ " " + addName+" "+addNumber+" "+addSpecialty+" "+addOperating+ "\n");
                                 }
                                 if(addRole.equals("n")){
                                     writer.write(addRole+ " " + addName+ " " +addNumber+" "+addNumpatients+"\n");
                                 }
                                 if(addRole.equals("a")){
                                     writer.write(addRole+ " " + addName+ " " +addNumber+ " " +addDepartment+"\n");
                                 }
                                 if(addRole.equals("j")){
                                     writer.write(addRole+ " " + addName+ " " +addNumber+ " " +addDepartment+ " " + addOperating+"\n");
                                 }
                                 if(addRole.equals("r")){
                                     writer.write(addRole+ " " + addName+ " " +addNumber+ " " +addDepartment+ " " +addOperating+ "\n");
                                 }
                                 if(addRole.equals("s")){
                                     writer.write(addRole+ " " + addName+ " " +addNumber+ " " +addSpecialty+ " " +addOperating+"\n");
                                 }
			writer.close();

			System.out.println("Done");

		} catch (IOException e) {
			System.out.println(e);
                        System.exit(0);
		}
	}}
    }
    public void printData(){


        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nDo you want to print data? (Y/N) \n");
         String printData = keyboard.next();

        if(printData.equals("Y")|| printData.equals("y")){
        System.out.println("\nThe Hospital has the following employees: \n");
          try{
           Scanner inputStream = new Scanner(new FileInputStream(filename));
           Character line2;
           String line;

        while(inputStream.hasNextLine() && inputStream!=null){
            if(inputStream.hasNextLine()){
            switch((inputStream.next().charAt(0))){
            case 'h':
                String hrole = "h";
                String hname = inputStream.next();
                int hnum = inputStream.nextInt();
                HospitalEmployee origHosp = new HospitalEmployee(hname,hnum);
                origHosp.toString();
                System.out.println(origHosp);
                break;
           case 'd':
                String drole = "d";
                String dname = inputStream.next();
                int dnum = inputStream.nextInt();
                String dspec = inputStream.next();
                Doctor origDoc = new Doctor (dname,dnum,dspec);
                origDoc.toString();
                System.out.println(origDoc);
                break;
           case 's':
                String srole = "s";
                String sname = inputStream.next();
                int snum = inputStream.nextInt();
                String sspec = inputStream.next();
                boolean sop = inputStream.hasNext("Y");
                Surgeon origSurg = new Surgeon (sname, snum,sspec,sop);
                origSurg.toString();
                System.out.println(origSurg);
                break;
           case 'n':
                String nrole = "n";
                String nname = inputStream.next();
                int nnum = inputStream.nextInt();
                int npat = inputStream.nextInt();
                Nurse origNurse = new Nurse (nname, nnum, npat);
                origNurse.toString();
                System.out.println(origNurse);

                break;
            case 'a':
                String arole = "a";
                String aname =inputStream.next();
                int anum = inputStream.nextInt();
                String adept = inputStream.next();
                Administrator origAdmin = new Administrator(aname,anum,adept);
                origAdmin.toString();
                System.out.println(origAdmin);
                break;
            case 'r':
                String rrole = "r";
                String rname = inputStream.next();
                int rnum = inputStream.nextInt();
                String rdept = inputStream.next();
                boolean rop = inputStream.hasNext("Y");
                Receptionist origRec = new Receptionist (rname, rnum,rdept,rop);
                origRec.toString();
                System.out.println(origRec);
                break;
            case 'j':
                String jrole = "j";
                String jname = inputStream.next();
                int jnum = inputStream.nextInt();
                String jdept = inputStream.next();
                boolean jop = inputStream.hasNext("Y");
                Janitor origJan = new Janitor (jname, jnum, jdept, jop);
                origJan.toString();
                System.out.println(origJan);
                break;

                }
                       line = inputStream.nextLine();
                       size = size--;


              }}
        inputStream.close();

       }catch(FileNotFoundException e)
        {
            System.out.println("file not found");
            System.exit(0);
        }
        catch(IOException e){
            System.out.println(e);
            System.exit(0);
        }

        }

    }





    public static void main(String[] args){

        ProgramAssignment1 object1 = new ProgramAssignment1(); // new object to use methods.
        View object2 = new View();
        Employee object3 = new Employee();
        String filename;
        object2.viewProgram();
        Scanner inputStream = new Scanner(System.in);
        String readword = inputStream.next();
        if(readword.equals("Y") || readword.equals("y")){
        System.out.println("\nPlease Enter Filename (ProgrammingAssignmentData.txt): \n");
        Scanner keyboard = new Scanner(System.in);
        filename = keyboard.nextLine();
        filename = "ProgrammingAssignmentData.txt";
        System.out.println("You have entered: " + filename);

        object1.readFile(filename);

        object1.deleteFile(filename);
        
        object1.addFile(filename);

        object1.printData();
        }
 else{
            System.out.println("                                         You have chosen to NOT read from a file.                                            ");
            System.out.println("                                                   PROGRAM END         \n\n\n\n                                                  ");
 }

      
       }


        
}




