package org.launchcode;
import studios.areaofacircle.Circle;
import java.util.Scanner;

public class Area {

    public static void main(String args[]){
        double pi = 3.14;
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius of the circle -");
        try {
             radius = input.nextDouble();
             do{
                 System.out.println("Please enter radius of the circle -");
                 radius = input.nextDouble();
             }while(radius<0);

             double areaOfCircle = Circle.getArea(radius);
             System.out.println("Area of circle is " + areaOfCircle);
        }catch(Exception e) {
            System.out.println("Please enter a valid number!");
        }
        input.close();
    }
}

