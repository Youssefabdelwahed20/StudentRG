/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrg;
import java.util.ArrayList;

/**
 *
 * 
 */
public class Instructor extends Person {
    
    private int insID;
    public ArrayList <Department> Department_Of_Instructor= new ArrayList<>();
    
    public Instructor(int insID, String name, String address, String teleNum, String dateOfbirth) {
        super(name, address, teleNum, dateOfbirth);
        this.insID = insID;
    }


    public Instructor() {
    }

 

    public int getInsID() {
        return insID;
    }

    public void setInsID(int insID) {
        this.insID = insID;
    }
    
 
    public void teachCourse(course c) {
        c.AddIns(this);
        System.out.println("Instructor " +  this.getName() +  " is now teaching" +" "+c.getCourseName()+" "+  "Course");
    }
    //to add departments for the instructor
    public void addDep(Department d){
        this.Department_Of_Instructor.add(d);
    }
 public void displayDepartments(){
     System.out.println("Departments for Instructor" +"  "+ this.getName()+ "  " + "is :" );
    for(Department d : Department_Of_Instructor){
        System.out.println(d.getName()+ "\n");
    }
    
}

    @Override
    public String toString() {
        return "Instructor{" + "insID=" + insID + ", name=" + this.getName() + ", address=" + this.getAddress() + ", telephoneNumber=" + this.getTeleNum() + ", dateOfBirth=" + this.getDateOfbirth() +  '}';
    }



 
}