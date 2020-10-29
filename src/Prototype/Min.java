/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.Hashtable;

/**
 *
 * @author PC
 */
public class Min {

    private static Hashtable<Integer, Employee> shapeMap = new Hashtable<>();

    public static Employee getType(Integer id) throws Exception {
        Employee employee = shapeMap.get(id);
        return (Employee) employee.clone();
    }

    public static void loadCache() {
        Junior circle = new Junior();
        circle.setId(1);
        shapeMap.put(circle.getId(), circle);

        Senior senior = new Senior();
        senior.setId(2);
        shapeMap.put(senior.getId(), senior);

        Supervisor supervisor = new Supervisor();
        supervisor.setId(3);
        shapeMap.put(supervisor.getId(), supervisor);
    }

    public static void main(String[] args) throws Exception {
        loadCache();

        Employee employee1 = (Employee) getType(1);
        System.out.println("Employee : " + employee1.getType());

        Employee employee2 = (Employee) getType(2);
        System.out.println("Employee : " + employee2.getType());

        Employee employee3 = (Employee) getType(3);
        System.out.println("Employee : " + employee3.getType());
    }
}
