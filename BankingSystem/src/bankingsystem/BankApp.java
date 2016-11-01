package bankingsystem;

import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sashrestha
 */
public class BankApp {
     

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BankingSystem b = new BankingSystem();
        
        BankAccount acc1 = new BankAccount("Gabrielle", 99898.87);
        BankAccount acc2 = new BankAccount("Jonah", 109.00);
        BankAccount acc3 = new BankAccount("Nneoma", 998.00);
        
        
        b.addAccount(acc1);
        b.addAccount(acc2);
        b.addAccount(acc3);
        
        // Printing out a list of the bank accounts
        System.out.println("List of Bank Accounts");
        for (BankAccount a : b.accounts)
         System.out.println(a.getName() + " " + a.getBalance());
         System.out.println();
      

        // Sorting the accounts by increasing balance
        Collections.sort(b.accounts, BankAccount.createComparatorByBalance(true));

        // Now the array list is sorted by balance (increasing)
        System.out.println("List of accounts sorted by increasing balance");
        for (BankAccount a : b.accounts)
           System.out.println(a.getName() + " " + a.getBalance());
           System.out.println();
      
 
    }
    
}
