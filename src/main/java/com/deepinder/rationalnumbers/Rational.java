package com.deepinder.rationalnumbers;

/********************************************************************
 * Programmer:	Deepinder Kaur
 * Class:  CS30S 
 *
 * Assignment: April exam
 *
 * Description: Rational expressions
 ***********************************************************************/

// import libraries as needed here

public class Rational {
    //*** Class Variables ***
    
    private int numer;
    private int denom;
    
    //*** Instance Variables ***
    
    //*** Constructors ***
    
     /*****************************************
    * Description: default constructor
    * 
    * ****************************************/
      public Rational(){
          
            int num = 0;
            int den = 1;
           
        }  //end default constructor
      
    /*****************************************
    * Description: initialized constructor
    * 
    * @param        int num 
    * @param        int den 
    * ****************************************/
      public Rational(int num, int den){
          
            numer = num;
            denom = den;
           
        } //end initialized constructor
        
    //*** Getters ***
    /*****************************************
    * Description:  get numerator
    * 
    * Interface:
    * 
    * @return       returns the numerator value
    * ****************************************/
    public int getNumer() {
        return numer;
    }
 
    /*****************************************
    * Description:  get denominator
    * 
    * Interface:
    * 
    * @return       return the denominator value
    * ****************************************/
    public int getDenom() {
        return denom;
    }
    //*** Setters ***

    /*****************************************
    * Description: returns the numerator
    * 
    * Interface:
    * 
    * @param       Numer: int, numerator
    * ****************************************/

     public void setNumer(int numer) {
         
        this.numer = numer;
        
      } // end set numer
     
    /*****************************************
    * Description: returns the denominator
    * 
    * Interface:
    * 
    * @param       Denom: int, denimoniator
    * ****************************************/
//   
     public void setDenom(int denom) {
         
         this.denom = denom;
         
       } // end set denom
     
    /*****************************************
    * Description: returns a new rational after multiplying
    * 
    * Interface:
    * 
    * @param       n1; int
    * @param       n2; int
    * ****************************************/
        
    public void times(Rational n1, Rational n2){
        
        numer= n1.numer * n2.numer;
        denom = n1.denom * n2.denom;
        
        reduce();
        } //end time (multiply)

  
   /*****************************************
    * Description: returns a new rational after dividing
    * 
    * Interface:
    * 
    * @param       n1; int
    * @param       n2; int
    * ****************************************/
   
    public void divide(Rational n1, Rational n2){
        
        numer = n1.numer * n2.denom;
        denom = n1.denom * n2.numer;
        
        reduce();
        } // end divide
    
    /*****************************************
    * Description: returns a new rational after addition
    * 
    * Interface:
    * 
    * @param       n1; int
    * @param       n2; int
    * ****************************************/
    
    public void addition(Rational n1, Rational n2){
        
        numer = ( n1.numer * n2.denom ) + ( n2.numer * n1.denom); 
        denom = n1.denom * n2.denom;
        
        reduce();
    } // end addition
    
    /*****************************************
    * Description: finds greatest common divisor 
    * 
    * Interface:
    * 
    * @param       n1; int
    * @param       n2; int
    * ****************************************/
    
   private int gcd (int n1, int n2){
      while (n1 != n2)
         if (n1 > n2)
            n1 = n1 - n2;
         else
            n2 = n2 - n1;

      return n1;
   } // end gcd
   
   /*****************************************
    * Description: returns a new rational after reducing
    * 
    * Interface:
    * 
    * @param       n1; int
    * @param       n2; int
    * ****************************************/
       
     private void reduce ()
   {
      if (numer!= 0)
      {
         int divisor = gcd (Math.abs(numer), denom);

         numer = numer / divisor;
         denom = denom / divisor;
      }// end if
   } //end reduce
   
    /*****************************************
    * Description:  overrides 
    * 
    * Interface:
    * 
    * @return:      to string
    * ****************************************/ 
    @Override  
    public String toString() {
        
        return  +  numer + "/" + denom;
        
    } //end override

} // end of public class
