/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author inmar
 */
public class OperatorTest {
    
    public OperatorTest() {
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
     * Test of add method, of class Operator.
     */
    @Test
    /*
    //provocando un fallo
    public void testAdd() {
        System.out.println("add");
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(3);
        Operator instance = new Operator();
        String expResult = "f";
        String result = instance.add(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    */
    
    //sin generar un fallo
    public void testAdd() {
        System.out.println("add");
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(3);
        num.add(5);
        Operator instance = new Operator();
        String expResult = "8";
        String result = instance.add(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    

    /**
     * Test of quit method, of class Operator.
     */
    @Test
    public void testQuit() {
        System.out.println("quit");
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(3);
        num.add(5);
        Operator instance = new Operator();
        String expResult = "2";
        String result = instance.quit(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of div method, of class Operator.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(2);
        num.add(6);
        Operator instance = new Operator();
        String expResult = "3";
        String result = instance.div(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of multi method, of class Operator.
     */
    @Test
    public void testMulti() {
        System.out.println("multi");
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(3);
        num.add(5);
        Operator instance = new Operator();
        String expResult = "15";
        String result = instance.multi(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
