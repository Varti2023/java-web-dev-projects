package org.launchcode;
import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter rectangle length - ");
        int length = input.nextInt();
        System.out.println("Please enter rectangle width - ");
        int width = input.nextInt();
        int area = length * width;
        input.close();
  System.out.println("Area of rectangle is - "+area);
    }
}