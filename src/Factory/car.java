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
public abstract class car {

    public car(Cartype model) {
        this.model = model;
        arrangeParts();
    }

    private void arrangeParts() {
        // Do one time processing here
    }

    // Do subclass level processing in this method
    protected abstract void construct();

    private Cartype model = null;

    public Cartype getModel() {
        return model;
    }

    public void setModel(Cartype model) {
        this.model = model;
    }

}
