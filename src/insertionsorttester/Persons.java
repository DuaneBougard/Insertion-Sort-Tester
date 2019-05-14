/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsorttester;

/**
 *
 * @author DUANE BOUGARD 3566258
 */
public class Persons{
    
    String surname,firstName;
    int age;
    
    public Persons(){
        surname="Unknown";
        firstName="Unknown";
        age=0;
    }
    public Persons(String surname,String firstName,int age){
     this.surname = surname;
     this.firstName = firstName;
     this.age = age;     
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return ("\n"+"person : surname: " + getSurname() + ", firstName : " + getFirstName() + ", age : " + getAge());
    }
     
    
}
