/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Q2;

import Factory_Q2.CarType.Cartype;

/**
 *
 * @author PC
 */
public class SUVSCar extends car {

    public SUVSCar() {
        super(Cartype.SUVS);
        construct();
    }

    @Override

    protected void construct() {
        System.out.println("Building Suvs car");

        // add accessories
    }
}
