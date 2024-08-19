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

public class ClassRoom {
    
    private int ID;
    private String location;
    private int MaxCapacity;
    private int numStudents;
    private boolean z; //for java excution
    public ArrayList <course> courses;

    public ClassRoom() {
    }

    public ClassRoom(int ID, String location, int MaxCapacity) {
        this.ID = ID;
        this.location = location;
        this.MaxCapacity = MaxCapacity;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public int getMaxCapacity() {
        return MaxCapacity;
    }

    public void setMaxCapacity(int MaxCapacity) {
        this.MaxCapacity = MaxCapacity;
    }

    public boolean isZ() {
        return z;
    }

    public void setZ(boolean z) {
        this.z = z;
    }
    

public void addStudent(){
    
    if(numStudents<MaxCapacity){
        System.out.println("Student added to class successfully");
        numStudents++;
        
    }else{
        System.out.println("Classroom is full");  
    }
}

public void Checker(){
    if(numStudents < MaxCapacity){
      z = true;
    }else{
        z=false;
    }
}


public int getNumStudents(){
    return numStudents;
}
 public void displayCoursesClass(){
     System.out.println("Courses for Classroom" +"  "+ this.getLocation()+ "  " + "is :" );
    for(course d : courses){
        System.out.println(d.getCourseName()+ "\n");
    }
   
}
  
    @Override
    public String toString() {
        return "ClassRoom{" + "ID=" + ID + ", location=" + location + ", MaxCapacity=" + MaxCapacity + ", numStudents=" + numStudents + '}';
    }

}
