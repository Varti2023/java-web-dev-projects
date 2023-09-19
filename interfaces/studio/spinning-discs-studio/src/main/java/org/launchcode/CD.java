package org.launchcode;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {
    // TODO: Implement your custom interface.

    public CD(String name, Double storageCapacity, Double storageUsed, String type) {
        super(name, storageCapacity, storageUsed, type);
    }


    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm");
    }

    @Override
    public void readData() {
        System.out.println("The CD is running!!!");

    }
// TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
