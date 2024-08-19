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
public class Department {

    private String name;
    private int id;
    public ArrayList <String> listOfFacilites=new ArrayList<>();
//constractor(param)

    public Department(String name, int id) {
        this.name = name;
        this.id = id;
    }


  
//constractor()
    public Department() {
    }

    //setter and getter 
    //setter to change value
    //getter to access value 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getListOfFacilites() {
        return listOfFacilites;
    }

    public void setListOfFacilites(ArrayList<String> listOfFacilites) {
        this.listOfFacilites = listOfFacilites;
    }
    public void addFacilites(String x){
        this.listOfFacilites.add(x);
    }
   public void displayFacilites(){
     System.out.println("Facilites for Department" +"  "+ this.getName()+ "  " + "is :" );
    for(String s : listOfFacilites){
        System.out.println(s + "\n");
    }
   
}

    @Override
    public String toString() {
        return "Department{" + "name=" + name + ", id=" + id + '}';
    }
   
}
