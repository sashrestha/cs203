/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

import java.util.Comparator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sashrestha
 */
public class BankAccountTest {
    
    public BankAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class BankAccount.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        BankAccount instance = new BankAccount("Kelly", 99.99);
        String expResult = "Kelly";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getBalance method, of class BankAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        BankAccount instance = new BankAccount("Kelly", 99.99);
        double expResult = 99.99;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of createComparatorByName method, of class BankAccount.
     */
    @Test
    public void testCreateComparatorByName() {
        System.out.println("createComparatorByName");
        // in decreasing order
        boolean increasing = false;
        BankAccount instance = new BankAccount("Kelly", 99.99);
        BankAccount instance2 = new BankAccount("Nelly", 199.99);
        int result = BankAccount.createComparatorByName(increasing).compare(instance, instance2);
        assertTrue(result > 0);
        int result2 = BankAccount.createComparatorByName(increasing).compare(instance2, instance);
        assertTrue(result2 < 0);
        // in increasing order
        increasing = true;
        int result3 = BankAccount.createComparatorByName(increasing).compare(instance2, instance);
        assertTrue(result3 > 0);
    }
    
    

    /**
     * Test of createComparatorByBalance method, of class BankAccount.
     */
    @Test
    public void testCreateComparatorByBalance() {
        System.out.println("createComparatorByName");
        // in decreasing order
        boolean increasing = false;
        BankAccount instance = new BankAccount("Kelly", 99.99);
        BankAccount instance2 = new BankAccount("Nelly", 199.99);
        int result = BankAccount.createComparatorByBalance(increasing).compare(instance, instance2);
        assertTrue(result > 0);
        int result2 = BankAccount.createComparatorByBalance(increasing).compare(instance2, instance);
        assertTrue(result2 < 0);
        // in increasing order
        increasing = true;
        int result3 = BankAccount.createComparatorByBalance(increasing).compare(instance2, instance);
        assertTrue(result3 > 0);
    }

   
    
}
