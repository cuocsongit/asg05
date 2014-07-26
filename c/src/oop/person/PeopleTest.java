/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop.person;

import java.util.Date;
import java.util.ArrayList;
import people.*;
/**
 *
 * @author Sony
 */
public class PeopleTest {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee newbie = new Employee("Newbie", new Date("2/10/1989"), 1000000);
        Manager boss = new Manager("Boss", new Date("2/23/1986"), 4000000);
        boss.setAssistant(newbie);
        Manager biggerBoss = new Manager("Big Boss", new Date("3/12/1969"), 10000000);
        biggerBoss.setAssistant(boss);
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(newbie);
        list.add(boss);
        list.add(biggerBoss);
        for( int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
  
    }
    
}
