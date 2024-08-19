/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrg;

/**
 *
 \
 */
public class Person {
    protected String name;
    protected String address;
    protected String teleNum;
    protected String dateOfbirth;
 public Person(){
}

    public Person(String name, String address, String teleNum, String dateOfbirth) {
        this.name = name;
        this.address = address;
        this.teleNum = teleNum;
        this.dateOfbirth = dateOfbirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTeleNum() {
        return teleNum;
    }

    public void setTeleNum(String teleNum) {
        this.teleNum = teleNum;
    }

    public String getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }
 
}
