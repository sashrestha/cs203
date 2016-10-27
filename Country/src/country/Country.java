/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country;

import java.util.Comparator;

/**
 *
 * @author sashrestha
 */
/**
 /**
   A country with a name and area.
*/
public class Country implements Comparator<Country>
{
   /**
      Constructs a country.
      @param aName the name of the country
      @param anArea the area of the country
   */
   public Country(String aName, double anArea)
   {
      name = aName;
      area = anArea;
   }

   /**
      Gets the name of the country.
      @return the name
   */
   public String getName()
   {
      return name;
   }

   /**
      Gets the area of the country.
      @return the area
   */
   public double getArea()
   {
      return area;
   }


   
   
   public static 
        Comparator<Country> createComparatorByName(final boolean increasing)
   {
       int direction;
       
       if (increasing) direction = 1; else direction = -1;
       
        class NameComparator implements Comparator<Country>
        {
            public int compare(Country country1, Country country2)
            {
                return 
                direction * (country1.getName().compareTo(country2.getName()));

            }

        }
        
        Comparator<Country> comp = new NameComparator();
        return comp;
   }
        
   public static 
        Comparator<Country> createComparatorByArea(final boolean increasing)
   {
       int direction;
       
       if (increasing) direction = 1; else direction = -1;
       
        class NameComparator implements Comparator<Country>
        {
            public int compare(Country country1, Country country2)
            {            
                if (country1.getArea() < country2.getArea()) 
                    return direction * (-1);
                if (country1.getArea() > country2.getArea()) 
                    return direction * 1;
                return 0;

            }

        }
        
        Comparator<Country> comp = new NameComparator();
        return comp;
   }

   private String name;
   private double area;

    @Override
    public int compare(Country o1, Country o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}