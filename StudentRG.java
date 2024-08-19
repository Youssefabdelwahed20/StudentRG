/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrg;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.time.LocalTime;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter; 
import java.io.BufferedReader;
import java.io.FileReader;


/**
 *
 * 
 */
public class StudentRG {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args)throws FileNotFoundException {
        // TODO code application logic here
Department d1 = new Department("IT" , 0001);
Department d2 = new Department("ai",002);
Department d3 = new Department("Data science", 003);
Department d4 = new Department("Devolpment",0004);
Department d5 = new Department("IS" , 0005 );

Student s1 = new Student(225038,2021,"first",d1,"ahmed","miami","01286868668","2004");
Student s2 = new Student(225071, 2022,"second",d2,"omar","alex","013353838253","2003");
Student s3 = new Student(225046, 2023, "first" , d3 ,"abdelmalek","sidi gaber","013458527755" ,"2004");
Student s4 = new Student(225079, 2021, "second", d4 ,"hossam","miami","0128642757" ,"2005");
Student s5 = new Student(225021, 2020, "second", d5 ,"ali","miami","013013013013" ,"1995");

ClassRoom cl1= new ClassRoom(2516 ,"A2-L1",2);
ClassRoom cl2 = new ClassRoom(2062 , "A2-L2" ,2);
ClassRoom cl3 = new ClassRoom(2042 , "A2-L3" ,2);
ClassRoom cl4 = new ClassRoom(2892 , "A2-L4" ,2);
ClassRoom cl5 = new ClassRoom(2472 , "A1-L4" ,2);

course c1 = new course("programming 2", d1 , "second" ,6,"programming 1", "oop , oop2" , 3 , 1.00 ,cl1,LocalTime.of(12, 0), LocalTime.of(14, 0),DayOfWeek.MONDAY);
course c2 = new course("probability 2" , d2 , "second" ,6,"probability 1","the life of prop" , 3 , 1.00 ,cl1,LocalTime.of(11,0), LocalTime.of(1, 0),DayOfWeek.MONDAY);
course c3 = new course("data 2", d1 ,"first" ,7,"History of data" , 3 ,1.00,cl2,LocalTime.of(1,0), LocalTime.of(4,0),DayOfWeek.THURSDAY);
course c4 = new course("Calculus", d1 , "second" ,7, "Integration" , 3 , 1.00 ,cl3,LocalTime.of(11,0), LocalTime.of(23, 0),DayOfWeek.SATURDAY);
course c5 = new course("Cyber security" , d1 , "first" ,8, "data , data" , 3 , 1.00 ,cl3,LocalTime.of(1,0), LocalTime.of(4, 0),DayOfWeek.THURSDAY);

Instructor i1 = new Instructor(0001,"Dr.kholy","miami","012021021012","13/13/2013");
Instructor i2 = new Instructor(0002,"Dr.Ahmed","miami","012021021012","13/13/2013");
Instructor i3 = new Instructor(0003,"Dr.Ali","miami","012021021012","13/13/2013");
Instructor i4 = new Instructor(0004,"Dr.Mai","miami","012021021012","13/13/2013");
Instructor i5 = new Instructor(0005,"Dr.shaimaa","miami","012021021012","13/13/2013");


//Student : 

//s1.checkPrerequisite(c5, 0); 
//s1.displayCourses();
//s1.registerCourse(c5);
//s1.toString();
//s1.ready //for java excution
//s1.Checkcourse(c5); //for java excution

//course : 

//c1.CheckTimeConflict(c1, c2);
//c1.displayInstructors();
//c1.displayStudents();
//c1.Check_Capacity();
//c1.toString();


//c1.AddCourseToClassRoom(); //for java excution
//c1.AddIns(i5); //for java excution
//c1.AddStudentToCourse(s5); //for java excution
//c1.AddToClass(); //for java excution
//c1.PrecourseVal(); //for java excution
//c1.avPlace(); //for java excution
//c1.timeConflict(c5); //for java excution

//ClassRoom

//cl1.displayCoursesClass();
//cl1.toString();
//cl1.Checker(); //for java excution
//cl1.addStudent(); //for java excution

//Instructor


//i1.displayDepartments();
//i1.addDep(d5);
//i1.teachCourse(c5);
//i1.toString()

//Department

//d1.addFacilites("Fridge");
//d1.displayFacilites();
//d1.toString();






//file maker 
try{
    File output= new File("D:Data.txt");
PrintWriter writeToFile = new PrintWriter(output);
writeToFile.println(s1.toString()+"\n");
writeToFile.println(s2.toString()+"\n");
writeToFile.println(s3.toString()+"\n");
writeToFile.println(s4.toString()+"\n");
writeToFile.println(s5.toString()+"\n");
writeToFile.println(d1.toString()+"\n");
writeToFile.println(d2.toString()+"\n");
writeToFile.println(d3.toString()+"\n");
writeToFile.println(d4.toString()+"\n");
writeToFile.println(d5.toString()+"\n");
writeToFile.println(c1.toString()+"\n");
writeToFile.println(c2.toString()+"\n");
writeToFile.println(c3.toString()+"\n");
writeToFile.println(c4.toString()+"\n");
writeToFile.println(c5.toString()+"\n");
writeToFile.println(i1.toString()+"\n");
writeToFile.println(i2.toString()+"\n");
writeToFile.println(i3.toString()+"\n");
writeToFile.println(i4.toString()+"\n");
writeToFile.println(i5.toString()+"\n");
writeToFile.println(cl1.toString()+"\n");
writeToFile.println(cl2.toString()+"\n");
writeToFile.println(cl3.toString()+"\n");
writeToFile.println(cl4.toString()+"\n");
writeToFile.println(cl5.toString()+"\n");

writeToFile.close();
 }
 catch(IOException e){
 
System.out.println("An error occurred.");
}   

    }
}


    
