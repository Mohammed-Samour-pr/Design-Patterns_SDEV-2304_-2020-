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
public class VANSCAR extends car {

    VANSCAR() {
        super(Cartype.VANS);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building VANS car");
        // add accessories
    }

}
