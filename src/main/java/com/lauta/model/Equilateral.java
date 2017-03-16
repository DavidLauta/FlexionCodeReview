/*
 * Source code copyright David Lauta 
 * All rights reserved 
 */
package com.lauta.model;

/**
 * This class represents a Triangle where the sides are all equal length
 * @author Dave
 */
public class Equilateral extends BaseT implements Triangle{
    
    public Equilateral(double sideA, double sideB, double sideC){
        super();
        setSides(sideA, sideB, sideC);
    }
    @Override
    public String getName(){
        String name = "The triangle with the sides " + getSideA() + " " + getSideB() +" " + getSideC() +", is an Equilateral triangle";
        return name;
    }
    
}
