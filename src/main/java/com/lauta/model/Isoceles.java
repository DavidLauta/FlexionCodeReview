/*
 * Source code copyright David Lauta 
 * All rights reserved 
 */
package com.lauta.model;


/**
 * This class represents a Triangle where two of the sides are equal length
 * @author Dave
 */
public class Isoceles extends BaseT implements Triangle{
    
    public Isoceles(double sideA, double sideB, double sideC){
        super();
        setSides(sideA, sideB, sideC);
    }
    @Override
    public String getName(){
        String name = "The triangle with the sides " + getSideA() + " " + getSideB() +" " + getSideC() +", is an Isoceles triangle";
        return name;
    }
    
}
