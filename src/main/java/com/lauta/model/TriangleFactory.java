/*
 * Source code copyright David Lauta 
 * All rights reserved 
 */
package com.lauta.model;

import java.math.BigDecimal;

/**
 * This superclass factory will validate that the sides given can construct a
 * triangle Returns a sub class of type Equilateral, Isoceles, Scalene or NaT
 *
 * @author Dave
 */
public class TriangleFactory {

    public TriangleFactory() {
    }

    public BaseT makeTriangle(double sideA, double sideB, double sideC) {

        if (isT(sideA, sideB, sideC)) {
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
        return new NaT(sideA, sideB, sideC);
    }

    //This will calcluate the Angles from the sides and determine that the sum == 180
    private boolean isT(double sideA, double sideB, double sideC) {
        double angleA, angleB, angleC;
        double sideA2, sideB2, sideC2;
        double radA, radB, radC;
        try {
            sideA2 = sideA * sideA;
            sideB2 = sideB * sideB;
            sideC2 = sideC * sideC;

            radA = Math.abs(( sideB2 + sideC2 - sideA2 ) / ( 2.0 * sideB * sideC));
            if ( radA > 1.0 ){ //Radians must be between 0.0 and 1.0
                System.out.println("isT result " + false);
                return false;
            }
            angleA = Math.acos( (double)(BigDecimal.valueOf(radA).setScale(4,BigDecimal.ROUND_HALF_UP).doubleValue()) );
            angleA = Math.toDegrees(angleA);
            
            radB = Math.abs(( sideA2 + sideC2 - sideB2 ) / ( 2.0 * sideA * sideC));
            if ( radB > 1.0 ){ //Radians must be between 0.0 and 1.0
                System.out.println("isT result " + false);
                return false;
            }
            angleB = Math.acos( BigDecimal.valueOf(radB).setScale(8,BigDecimal.ROUND_HALF_UP).doubleValue() );
            angleB = Math.toDegrees(angleB);
            
            radC = Math.abs((sideA2 + sideB2 - sideC2 ) / ( 2.0 * sideA * sideB));
            if ( radC > 1.0 ){ //Radians must be between 0.0 and 1.0
                System.out.println("isT result " + false);
                return false;
            }
            angleC = Math.acos( BigDecimal.valueOf(radC).setScale(8,BigDecimal.ROUND_HALF_UP).doubleValue() );
            angleC = Math.toDegrees(angleC);
            
            //System.out.println(angleA + " " + angleB + " " + angleC + " " + (angleA + angleB + angleC));
        } catch (Exception e) {
            System.err.println("isT exception " + e.getClass().getName() + " " + e.getMessage());
            //e.printStackTrace();
            return false;
        }
        boolean result = ( 0.005 > Math.abs(180.0 - angleA - angleB - angleC));
        System.out.println("isT result " + result);// +  " " + (180.0 - angleA - angleB - angleC));
        return result;
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
