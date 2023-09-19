package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd1 = new CD("Best Songs Ever", 700.0, 480.0, "CD-R");
        CD cd2 = new CD("Tom Petty", 750.0, 550.0, "CD-RW");
        CD cd3 = new CD("Best Songs Ever", 700.0, 480.0, "CD-R");

        DVD dvd1 = new DVD("Pitch   Black", 3500.0, 2775.0, "DVD-R");
        DVD dvd2 = new DVD("Matrix", 3650.0, 2925.0, "DVD-RW");
        DVD dvd3 = new DVD("Godfather", 3220.0, 2485.0, "DVD-R");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd1.readData();
        cd1.spinDisc();
        cd1.writeData(150.0);

        dvd1.readData();
        dvd1.spinDisc();
        dvd1.writeData(7000.0);
        System.out.println(cd1.getDiscInfo());
    }
}