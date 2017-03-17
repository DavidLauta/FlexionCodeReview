/*
 * Source code copyright David Lauta 
 * All rights reserved 
 */
package com.lauta.model;

/**
 * This class represents a Triangle where none of the sides are equal length
 * @author Dave
 */
public class Scalene extends BaseT implements Triangle{
    
    public Scalene(double sideA, double sideB, double sideC){
        super();
        setSides(sideA, sideB, sideC);
    }
    @Override
    public String getName(){
        String name = "The triangle with the sides " + getSideA() + " " + getSideB() +" " + getSideC() +", is a Scalene triangle";
        return name;
    }
    
}