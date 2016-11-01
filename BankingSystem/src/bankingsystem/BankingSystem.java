/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author sashrestha
 */
public class BankingSystem {
    
    ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
    
    public void addAccount(BankAccount acc){
        
        accounts.add(acc);
    }
  
    
}
