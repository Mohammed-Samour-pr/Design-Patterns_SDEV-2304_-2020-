/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype_Q3;

/**
 *
 * @author PC
 */
public class Employee implements Cloneable {

    int id;
    String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Junior extends Employee {

    public Junior() {
        type = "Junior";
    }
}

class Senior extends Employee {

    public Senior() {
        type = "Senior";
    }
}

class Supervisor extends Employee {

    public Supervisor() {
        type = "Supervisor";
    }
}
