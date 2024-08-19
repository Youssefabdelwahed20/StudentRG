/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrg;

/**
 *
 * 
 */
import java.util.ArrayList;

public class Student extends Person {
    private int stdID;
    private int Enrolledyr;
    private String Semeter;
    private Department dStudent;
    public ArrayList <course> RegCourse = new ArrayList<>();
    private double gpa;
   
    //checkprequiste() , registercourse()
   boolean ready = false; 
   

   
    public Student(int stdID, int Enrolledyr, String Semeter, Department dStudent,String name, String address, String teleNum, String dateOfbirth) {
        super(name, address, teleNum, dateOfbirth);
        this.stdID = stdID;
        this.Enrolledyr = Enrolledyr;
        this.Semeter = Semeter;
        this.dStudent = dStudent;
        this.RegCourse = new ArrayList<>();
    }
    

    public Student() {
    }

    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public int getEnrolledyr() {
        return Enrolledyr;
    }

    public void setEnrolledyr(int Enrolledyr) {
        this.Enrolledyr = Enrolledyr;
    }

    public String getSemeter() {
        return Semeter;
    }

    public void setSemeter(String Semeter) {
        this.Semeter = Semeter;
    }

    public Department getdStudent() {
        return dStudent;
    }

    public void setdStudent(Department dStudent) {
        this.dStudent = dStudent;
    }

    public ArrayList<course> getRegCourse() {
        return RegCourse;
    }

    public void setRegCourse(ArrayList<course> RegCourse) {
        this.RegCourse = RegCourse;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    
  
    public void checkPrerequisite(course c ,double gpa1){
        if(gpa1>=c.getGpa() && c.PrecourseVal() == 0 && Checkcourse(c) == false){
       ready = true;
       System.out.println("Student ready to register, no PreCourse is needed!");
   }
        else if(gpa1>=c.getGpa() && c.PrecourseVal() == 1 && Checkcourse(c) == false){
            ready = true;
       System.out.println("Student ready to register , the last course is"+" " +c.getPreCourses());
        }else if(gpa1<c.getGpa()){
            ready=false;
            System.out.println("Sorry , the student is not ready yet");
        }else if(Checkcourse(c) == true){
            ready = false;
            System.out.println("Student" + " " + this.getName() + " has already taken this course!");
        }
        
   
    }
  
 public void registerCourse(course c){ 
  if (ready == true && c.avPlace() == true){
      this.RegCourse.add(c);
      c.AddStudentToCourse(this);
      System.out.println("Registerd successfully for" +" "+this.getName()+ " in "+c.getCourseName() );
      c.AddToClass();
      ready = false;
  }  else if(ready == true && c.avPlace() == false){
      System.out.println("Sorry, couldn't register reason : ");
      c.AddToClass();
  }
  else if(ready == false){
      System.out.println("Please check Prerequisite before registering ");
  }

 
 }
 
 public void displayCourses(){
     System.out.println("Courses for Student" +" "+ this.getName()+ " " + "is :" );
    for(course c : RegCourse){
        System.out.println(c.getCourseName() + "\n");
    }
     
 }

 // checkprequistiss() 
    public boolean Checkcourse(course c){
   return RegCourse.contains(c);
    }

    @Override
    public String toString() {
        return "Student{" + "stdID=" + stdID + ", Enrolledyr=" + Enrolledyr + ", Semeter=" + Semeter + ", dStudent=" + dStudent + ", gpa=" + gpa + '}';
    }

 }
 
 




