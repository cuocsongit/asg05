/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop.person;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sony
 */
public class Person {
    
    //the variable contain person's name 
    private String name;
    
    //the variable contain person's birthday
    private Date birthday;
    
    //contructor with 2 arguments name and birthday
    public Person(String theName, Date birthDay) {
        name = theName;
        birthday = birthDay;
    }
    
    //contructor copy from Person object
    public Person(Person person) {
        name = person.name;
        birthday = person.birthday;
    }
    
    //method return person's name
    public String getName() {
        return name;
    }
    
    //method return person's birthday
    public Date getBirthDay() {
        return birthday;
    }
    
    //overiding method toString()
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        return String.format("%s %s", name, format.format(birthday));
    }
}
