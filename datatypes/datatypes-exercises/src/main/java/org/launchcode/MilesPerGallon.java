package org.launchcode;
import java.util.Scanner;

public class MilesPerHour {

    public static void main(String  args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Number of mile driven -");
        Double miles = input.nextDouble();
        System.out.print("Gas consumed in gallons - ");
        Double gasConsumption = input.nextDouble();
        Double mph = miles/gasConsumption;
        System.out.print("Miles per Hour is - "+mph+"mph");
    }
}
