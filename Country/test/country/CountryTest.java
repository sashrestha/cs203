/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sashrestha
 */
public class CountryTest {
    
    public CountryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Country.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Country instance = new Country("Belgium", 30000);
        String expResult = "Belgium";
        String result = instance.getName();
        assertTrue(expResult.equals(result));
    }

    /**
     * Test of getArea method, of class Country.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Country instance = new Country("Belgium", 30000);
        double expResult = 30000;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
    }

   
    
  
}
