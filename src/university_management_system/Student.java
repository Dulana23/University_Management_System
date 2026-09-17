/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university_management_system;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dulan
 */
public class Student extends Person{
    
    private String studentId;
    private String registrationNumber;
    private String indexNumber;
    private String degreeProgram;
    private int currentYear;
    private int currentSemester;

    ArrayList<Student> Students = new ArrayList<Student>();
    
    Scanner scanner = new Scanner(System.in);

    public Student() {
        
    }

   
    
    
    public Student(String studentId, String registrationNumber, String indexNumber,String name,String degreeProgram, int currentYear, int currentSemester, String email) {
        super(name, email);
        this.studentId = studentId;
        this.registrationNumber = registrationNumber;
        this.indexNumber = indexNumber;
        this.degreeProgram = degreeProgram;
        this.currentYear = currentYear;
        this.currentSemester = currentSemester;
    }
    
    

    public String getStudentId() {
        return studentId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public Scanner getScanner() {
        return scanner;
    }
    
    
   
      
  
    
    @Override
    void addStudent() {
         String addAgain = "Yes";
         
           
             
           System.out.println("===== ADD NEW Students ===== ");
           
           do {
               
                    System.out.print("Enter Student ID :- ");
                      this.studentId = scanner.nextLine();
          
                   System.out.print("Enter Registration Number :- ");
                      this.registrationNumber = scanner.nextLine();
           
                   System.out.print("Enter Index Number :- ");
                      this.indexNumber = scanner.nextLine();
           
                   System.out.print("Enter Name :- ");
                      this.name = scanner.nextLine();
           
                   System.out.print("Enter Degree programme :-");
                      this.degreeProgram = scanner.nextLine();
           
                   System.out.print("Enter current year :- ");
                      this.currentYear = scanner.nextInt();
           
                   System.out.print("Enter current Semester :- ");
                      this.currentSemester = scanner.nextInt();
           
                   System.out.print("Enter Email :- ");
                      this.email = scanner.nextLine();
           
               Student student = new Student(studentId, registrationNumber, indexNumber, name, degreeProgram, currentYear, currentSemester, email);
                Students.add(student);
            
                FileManager filemanager = new FileManager();
                 filemanager.saveStudentData(student);
            
                System.out.print("\nAdd again (Yes/No):  ");  
                addAgain = scanner.nextLine();
                 
             System.out.println("");
             
           }while(addAgain.equals("Yes")) ;
              
              System.out.println("");
              
              Main.displayWelcomeMessage();
               Main.loadMainMenu();
               
               scanner.close();
           
         
         
          
    }
    public  void viewAllStudents(){
      
         System.out.println("\n====== View All Student ======\n");
         
         FileManager manager1 = new FileManager();
         manager1.readAllStudents();
         
          
         System.out.println();
    }
    
    
    public void searchStudent(){
        
        String searchedId;
        
        
        
        System.out.println("\n====== Search Student ======");
         
        System.out.print("Enter Student ID :- ");
         searchedId = scanner.nextLine().trim();
         
         FileManager fileMananger = new FileManager();
      //     fileMananger.searchStudentyId(searchedId);
         System.out.println();
         
         
          
    }
     
    
     
}
