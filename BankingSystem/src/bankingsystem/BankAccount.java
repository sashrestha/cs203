/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

import java.util.Comparator;

/**
 *
 * @author sashrestha
 */
/**
 /**
   A Bank account with a name and balance.
*/
public class BankAccount implements Comparator<BankAccount>
{
    
 /**
      Constructs a bankAccount.
      @param aName the name of the bankAccount
      @param aBalance the balance of the bankAccount
   */
   public BankAccount(String aName, double aBalance)
   {
      name = aName;
      balance = aBalance;
   }

   /**
      Gets the name of the bankAccount.
      @return the name
   */
   public String getName()
   {
      return name;
   }

   /**
      Gets the balance of the bankAccount.
      @return the balance
   */
   public double getBalance()
   {
      return balance;
   }


   
   
   public static 
        Comparator<BankAccount> createComparatorByName(final boolean increasing)
   {
       int direction;
       
       if (increasing) direction = 1; else direction = -1;
       
        class NameComparator implements Comparator<BankAccount>
        {
            public int compare(BankAccount acc1, BankAccount acc2)
            {
                return 
                direction * (acc1.getName().compareTo(acc2.getName()));
            }
        }
        
        Comparator<BankAccount> comp = new NameComparator();
        return comp;
   }
        
   public static 
        Comparator<BankAccount> createComparatorByBalance(final boolean increasing)
   {
       int direction;
       
       if (increasing) direction = 1; else direction = -1;
       
        class NameComparator implements Comparator<BankAccount>
        {
            public int compare(BankAccount acc1, BankAccount acc2)
            {            
                if (acc1.getBalance() < acc2.getBalance()) 
                    return direction * (-1);
                if (acc1.getBalance() > acc2.getBalance()) 
                    return direction * 1;
                return 0;

            }

        }
        
        Comparator<BankAccount> comp = new NameComparator();
        return comp;
   }

   private String name;
   private double balance;

    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
