/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrg;

import java.time.DayOfWeek;
import java.util.*;
import java.time.LocalTime;
/**
 *
 * 
 */
public class course {
private String courseName ;
private ArrayList <Instructor> Instructor;
private Department dCourse ;
private String term ;
private int periods ;
private String preCourses ;
private String textbooks ;
private int credits ;
public ArrayList <Student> Students;
private ClassRoom c; 
private ClassRoom t;
private double gpa;
private LocalTime StartTime;
private LocalTime endTime;
private DayOfWeek Day;

public course(){

};

public course(String courseName,Department dCourse, String term,int periods, String preCourses, String textbooks, int credits, double gpa, ClassRoom classroom, LocalTime StartTime, LocalTime endTime,DayOfWeek Day) {
this.courseName = courseName;
this.Instructor = new ArrayList<>();
this.dCourse = dCourse;
t=classroom; 
c = new ClassRoom(classroom.getID(),classroom.getLocation(),classroom.getMaxCapacity()); 
if(c.getMaxCapacity()>0){
    c.setZ(true);
}else{c.setZ(false);
}
this.AddCourseToClassRoom();
this.term = term;
this.periods = periods;
this.preCourses = preCourses;
this.textbooks = textbooks;
this.credits = credits;
this.Students = new ArrayList<>();
this.gpa = gpa;
 this.StartTime = StartTime;
 this.endTime = endTime;
this.Day =Day;
}
public course(String courseName,Department dCourse, String term,int periods, String textbooks, int credits, double gpa, ClassRoom classroom, LocalTime StartTime, LocalTime endTime,DayOfWeek Day) {
this.courseName = courseName;
this.Instructor = new ArrayList<>();
this.dCourse = dCourse;
t=classroom; 
c = new ClassRoom(classroom.getID(),classroom.getLocation(),classroom.getMaxCapacity()); 
if(c.getMaxCapacity()>0){   
    c.setZ(true);
}else{c.setZ(false);}
this.AddCourseToClassRoom();
this.term = term;
this.periods = periods;
this.textbooks = textbooks;
this.credits = credits;
this.Students = new ArrayList<>();
this.gpa = gpa;
 this.StartTime = StartTime;
 this.endTime = endTime;
this.Day =Day;
}




public String getCourseName() {
return courseName;
}

public void setCourseName(String courseName) {
this.courseName = courseName;
}

public Department getdCourse() {
return dCourse;
}

public void setdCourse(Department dCourse) {
this.dCourse = dCourse;
}

public String getTerm() {
return term;
}

public void setTerm(String term) {
this.term = term;
}

    public int getPeriods() {
        return periods;
    }

    public void setPeriods(int periods) {
        this.periods = periods;
    }

  

    public ClassRoom getClassroom() {
        return c;
    }

    public void setClassroom(ClassRoom classroom) {
        this.c = classroom;
    }

public String getPreCourses() {
return preCourses;
}

public void setPreCourses(String preCourses) {
this.preCourses = preCourses;
}

public String getTextbooks() {
return textbooks;
}

public void setTextbooks(String textbooks) {
this.textbooks = textbooks;
}

public int getCredits() {
return credits;
}

public void setCredits(int credits) {
this.credits = credits;
}

    public ArrayList<Student> getStudent() {
        return Students;
    }

    public void setStudent(ArrayList<Student> student) {
        this.Students = student;
    }

    public double getGpa() {
        return gpa;
    }

    public ArrayList<Instructor> getInstructor() {
        return Instructor;
    }

    public void setInstructor(ArrayList<Instructor> Instructor) {
        this.Instructor = Instructor;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ClassRoom getT() {
        return t;
    }

    public void setT(ClassRoom t) {
        this.t = t;
    }
 
// teachCourse() Methoud in instractor class
public void AddIns(Instructor c){
    this.Instructor.add(c);
}
    
  public int PrecourseVal(){
      if (this.preCourses != null){
          return 1;
      }else{
          return 0;
      }
  }
  
  //registercourse()
  public void AddToClass(){
      c.addStudent();
      c.Checker();
  }
  
  //ClassRoom
  
  public boolean avPlace(){
      if(c.isZ() == true){
          return true;
      }
      else{
          return false;
      }
  }
  
 //for java excuting
  
  //CheckTimeConflict
  public boolean timeConflict(course second ){

 return (this.StartTime.isBefore(second.endTime) && this.endTime.isAfter(second.StartTime) && this.Day==second.Day && this.t == second.t);   
    
}
  
  public void CheckTimeConflict(course c1,course c2){
      if (c1.timeConflict(c2)) {
            System.out.println("There is a time conflict between " + c1.getCourseName() + " and " + c2.getCourseName());
        } else {
            System.out.println("There is no time conflict between " + c1.getCourseName() + " and " + c2.getCourseName());
        }
    
  }
  
  public void Check_Capacity(){
    if(c.getNumStudents() < c.getMaxCapacity()){
        System.out.println("There is place in classroom in "+courseName);
    }else{
        System.out.println("There is no place in classroom in "+courseName);
    }
  }
public void displayInstructors(){
     System.out.println("Instructors for Course" +" "+this.getCourseName()+ " " + "is :" );
    for(Instructor d : Instructor){
        System.out.println(d.getName()+ "\n");
    }
}

//registercourse()
public void AddStudentToCourse(Student s){
    this.Students.add(s);
}


public void AddCourseToClassRoom(){
    this.t.courses.add(this);
}
public void displayStudents(){
     System.out.println("Students for Course" +" "+this.getCourseName()+ " " + "is :" );
    for(Student d : Students){
        System.out.println(d.getName()+ "\n");
    }
}

    @Override
    public String toString() {
        return "course{" + "courseName=" + courseName + ", term=" + term + ", periods=" + periods + ", preCourses=" + preCourses + ", textbooks=" + textbooks + ", credits=" + credits + ", gpa=" + gpa + '}';
    }


}