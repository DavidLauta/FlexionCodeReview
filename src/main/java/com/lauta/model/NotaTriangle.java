/*
 * Source code copyright David Lauta 
 * All rights reserved 
 */
package com.lauta.model;

/**
 * This class represents a Triangle where the sides do not create a valid Triangle
 * @author Dave
 */
public class NotaTriangle extends BaseT implements Triangle{
    
    public NotaTriangle(double sideA, double sideB, double sideC){
        super();
        setSides(sideA, sideB, sideC);
    }
    @Override
    public String getName(){
        String name = "For the triangle with the sides " + getSideA() + " " + getSideB() +" " + getSideC() +"; No triangle can be created. \nThis is not a triangle";
        return name;
    }
    
}
