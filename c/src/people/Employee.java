/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package people;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Sony
 */
public class Employee extends Person{
    
    private double salary;
    
    //constructor with three arguments
    public Employee(String theName, Date birthDay, double theSalary) {
        super(theName, birthDay);
        salary = theSalary;
    }
    
    //constructor copy from Employee object
    public Employee(Employee employee) {
        super(employee.getName(), employee.getBirthDay());
        salary = employee.salary;
    }
    
    // method return salary
    public double getSalary() {
        return salary;
    }
    
    //overiding method toString()
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        return String.format("%s %s %.2f",getName(),format.format( getBirthDay() ), salary);
    }
}
