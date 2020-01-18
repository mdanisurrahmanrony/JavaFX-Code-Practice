/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableview;

/**
 *
 * @author USER
 */
public class Person {
    
    String name;
    int id;
    double salary;

    Person(String name, int id, double salary) {    //by default ei constructor protected obosthay ase
        this.name = name;
        this.id = id;
        this.salary = salary;
    } 

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
}
