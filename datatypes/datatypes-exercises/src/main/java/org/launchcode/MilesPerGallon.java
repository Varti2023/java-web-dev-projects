package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String  args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Number of mile driven -");
        Double miles = input.nextDouble();
        System.out.print("Gas consumed in gallons - ");
        Double gasConsumption = input.nextDouble();
        Double mpg = miles/gasConsumption;
        System.out.print("Miles per gallon is - "+mpg+ "mpg");
        input.close();
    }
}
