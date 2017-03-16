/*
 * Source code copyright David Lauta 
 * All rights reserved 
 */
package com.lauta.model;

/**
 * Base class of Triangle Types
 * @author Dave
 */
abstract public class BaseT implements Triangle{
    
    private double sideA;
    private double sideB;
    private double sideC;
    
    public void setSides(double a, double b, double c){
        sideA = a;
        sideB = b;
        sideC = c;
    }
    @Override
    abstract public String getName();

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }


}
