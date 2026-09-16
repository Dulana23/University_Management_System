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
        
         
         
          
    }
     
    
     
}
