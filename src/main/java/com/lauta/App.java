/*
 * Source code copyright David Lauta 
 * All rights reserved 
 */
package com.lauta;

import com.lauta.model.Triangle;
import com.lauta.model.TriangleFactory;
import java.util.Scanner;

/**
 * This is the main entry point for this application.
 * This will prompt the user for three sides, construct the appropriate triangle and print its name.
 * @author Dave
 */
public class App {
    public static void main(String[] args){
        App app = new App();
        double[] sides = app.parseInput(args);
        TriangleFactory factory = new TriangleFactory( );
        Triangle t = factory.makeTriangle(sides[0], sides[1], sides[2] );
        System.out.println( t.getName() );
    }
    
    private double[] parseInput(String[]args ){
        double [] sides = new double[3];//{3,3,4};
        int index = 0;
        if ( args.length >= 3 ){
            try{
            sides[0] = Double.parseDouble(args[0]);
            sides[1] = Double.parseDouble(args[1]);
            sides[2] = Double.parseDouble(args[2]);
            return sides;
            }catch(Exception e){
                
                System.out.println("Invalid parameters to program. " + e.getClass().getName() + " " + e.getMessage());
            }
        }
        Scanner scan = new Scanner(System.in);        
        System.out.print("Please enter a the value of the first side's length: ");
        sides[index++] = (scan.nextDouble());
        System.out.print("Please enter a the value of the second side's length: ");
        sides[index++] = (scan.nextDouble());
        System.out.print("Please enter a the value of the third side's length: ");
        sides[index++] = (scan.nextDouble());
        return sides;
    }
}
