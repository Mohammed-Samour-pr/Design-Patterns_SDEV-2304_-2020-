/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Factory.CarType.Cartype;

/**
 *
 * @author PC
 */
public class Min {

    public static void main(String[] args) {

        System.out.println(CarFactory.buildCar(Cartype.SEDAN));
        System.out.println(CarFactory.buildCar(Cartype.SUVS));
        System.out.println(CarFactory.buildCar(Cartype.VANS));

    }

}
