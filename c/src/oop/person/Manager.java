/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop.person;

import java.text.SimpleDateFormat;
import java.util.Date;
import people.*;
/**
 *
 * @author Sony
 */
public class Manager extends Employee{
    
    private Employee assistant;
    
    //constructor with 4 arguments
    public Manager(String theName, Date birthDay, double salary) {
        super(theName, birthDay, salary);
    }
    
    //constructor copy from Manager object
    public Manager(Manager manager) {
        super(manager.getName(), manager.getBirthDay(), manager.getSalary());
        assistant = new Employee( manager.getAssistant() );
    }
    
    public Employee getAssistant() {
        return new Employee(assistant);
    }
    
    public void setAssistant(Employee newAssistant) {
        assistant = new Employee(newAssistant);
    }
    
    //overiding method toString()
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        return String.format("%s %s %.2f %s", getName(), format.format( getBirthDay() ),
                getSalary(), assistant.getName());
    }
}
