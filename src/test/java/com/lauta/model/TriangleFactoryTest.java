/*
 * Source code copyright David Lauta 
 * All rights reserved 
 */
package com.lauta.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Dave
 */
public class TriangleFactoryTest {
    
    public TriangleFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of makeTriangle method, of class TriangleFactory.
     */
    @Test
    public void testMakeTriangleIsoceles() {
        System.out.println("makeTriangle Isoceles");
        double sideA = 3.0;
        double sideB = 4.0;
        double sideC = 4.0;
        TriangleFactory instance = new TriangleFactory();
        BaseT result = instance.makeTriangle(sideA, sideB, sideC);
        assertTrue(result instanceof Isoceles );
    }
    
    @Test
    public void testMakeTriangleEquilateral() {
        System.out.println("makeTriangle Equilateral");
//        double sideA = 1.5;
//        double sideB = 1.5;
//        double sideC = 1.5;
        double sideA = 3.0;
        double sideB = 3.0;
        double sideC = 3.0;
        TriangleFactory instance = new TriangleFactory();
        BaseT result = instance.makeTriangle(sideA, sideB, sideC);
        assertTrue(result instanceof Equilateral );
    }

    @Test
    public void testMakeTriangleScalene() {
        System.out.println("makeTriangle Scalene");
        double sideA = 3.0;
        double sideB = 4.0;
        double sideC = 5.0;

        TriangleFactory instance = new TriangleFactory();
        BaseT result = instance.makeTriangle(sideA, sideB, sideC);
        assertTrue(result instanceof Scalene );
    }

    @Test
    public void testMakeTriangleNaT() {
        System.out.println("makeTriangle NotaTriangle");
        double sideA = 4.0;
        double sideB = 6.0;
        double sideC = 11.0;
        TriangleFactory instance = new TriangleFactory();
        BaseT result = instance.makeTriangle(sideA, sideB, sideC);
        assertTrue(result instanceof NotaTriangle );
    }
}
