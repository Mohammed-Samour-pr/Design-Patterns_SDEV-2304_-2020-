/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Factory.CarType.Cartype;
import static Factory.CarType.Cartype.VANS;

/**
 *
 * @author PC
 */
public class CarFactory {

    public static car buildCar(Cartype model) {
        car car0 = null;
        switch (model) {
            case VANS:
                car0 = new VANSCAR();
                break;

            case SEDAN:
                car0 = new SedanCar();
                break;

            case SUVS:
                car0 = new SUVSCar();
                break;

            default:
                // throw some exception
                break;
        }
        return car0;
    }

}
