/*
 * Source code copyright David Lauta 
 * All rights reserved 
 */
package com.lauta.model;

/**
 * This factory will validate that the sides given can construct a
 * triangle Returns a sub class of type Equilateral, Isoceles, Scalene or NaT
 *
 * @author Dave
 */
public class TriangleFactory {

    public TriangleFactory() {
    }

    public BaseT makeTriangle(double sideA, double sideB, double sideC) {

        if (isTriangle(sideA, sideB, sideC)) {
            if (isEquilateral(sideA, sideB, sideC)) {
                return new Equilateral(sideA, sideB, sideC);
            }
            if (isIsoceles(sideA, sideB, sideC)) {
                return new Isoceles(sideA, sideB, sideC);
            }
            if (isScalene(sideA, sideB, sideC)) {
                return new Scalene(sideA, sideB, sideC);
            }
        }
        //Bad case -- IsT returned invalid result
        return new NotaTriangle(sideA, sideB, sideC);
    }

    // A triangle can be create from three sides if the sum of the two shortest sides is > the longest side.
     private boolean isTriangle(double sideA, double sideB, double sideC) {
         //brute force
         if ( sideA >= sideB && sideA >= sideC ){
             return sideA < sideB + sideC;
         }
         if ( sideB >= sideA && sideB >= sideC ){
             return sideB < sideA + sideC;
         }
         if ( sideC >= sideA && sideC >= sideB ){
             return sideC < sideA + sideB;
         }
         return false;
     }
     
  
    //Determine if the sides are all equal length
    private boolean isEquilateral(double sideA, double sideB, double sideC) {
        return (sideA == sideB) && (sideA == sideC);
    }

    //Determine if two sides are equal length
    private boolean isIsoceles(double sideA, double sideB, double sideC) {
        if ((sideA == sideB) && (sideA != sideC)) {
            return true;
        }
        if ((sideA == sideC) && (sideA != sideB)) {
            return true;
        }
        if ((sideB == sideC) && (sideA != sideB)) {
            return true;
        }
        return false;
    }

    //Determine no two sides are equal length
    private boolean isScalene(double sideA, double sideB, double sideC) {
        return (!isEquilateral(sideA, sideB, sideC) && !isIsoceles(sideA, sideB, sideC));
    }
}
