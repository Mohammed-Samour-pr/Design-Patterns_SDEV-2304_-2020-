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
public class SedanCar extends car {

    public SedanCar() {
        super(Cartype.SEDAN);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building sedan car");
        // add accessories
    }

}
