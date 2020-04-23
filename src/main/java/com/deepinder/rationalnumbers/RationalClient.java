package com.deepinder.rationalnumbers;

/********************************************************************
 * Programmer:	Deepinder Kaur
 * Class:  CS30S
 *
 * Assignment: Rational numbers
 * Program Name:  RationalClient
 *
 * Description: Does math operation with rational numbers
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;

public class RationalClient {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;		// string data input from keyboard
        String strout;		// processed info string to be output
        String bannerOut;		// string to print banner to message dialogs

        String prompt;		// prompt for use in input dialogs

        String delim = "[ :]+";	// delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();
        // new line character for file writing
        
        
        Rational[] Rational = new Rational [100];   // array of employees
        Rational m1 = new Rational();     // amy the employee
    	
    // ***** create objects *******
    
        //DecimalFormat df1 = new DecimalFormat("##.###");
    
    // the ProgramInfo class has both a default and initialized constructor
    // so you can choose which model you want to employ
    
        //ProgramInfo programInfo = new ProgramInfo();
        //ProgramInfo programInfo = new ProgramInfo("assignment name");
        
        BufferedReader fin = new BufferedReader(new FileReader("datafile"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    	
    // ********** Print output Banner **********

        //System.out.println(programInfo.getBanner("A1Q2"));
        //fout.println(programInfo.getBanner("A1Q2"));

        //System.out.println(programInfo.getBanner());
        //fout.println(programInfo.getBanner());
	    	
    // ************************ get input **********************
/* input will now come from an external file so there
        will not normally be a need for a prompt
    
        prompt = "Enter your prompt text here. \n";	
        prompt += "you may need to add additional lines\n";
        prompt += "or delete some of these prompt lines.\n\n";

        strin = JOptionPane.showInputDialog(bannerOut + prompt);	 
*/
        // read a line of data from the external text file

    // ************************ processing ***************************
    
    
        strin = fin.readLine(); //reads first line of the data
        
        while (strin != null) {
           
           // System.out.println(strin); 
            
            strin = fin.readLine();            // reads the rest of the data
           
        } // end eof
                
        Rational n1 = new Rational(10, 20);
        Rational n2 = new Rational(40, 60);
        
        Rational result= new Rational();
        Rational result2= new Rational();
        Rational result3 = new Rational();
        
        result.times(n1, n2);     // multiply
        result2.divide(n1, n2);  // division
        result3.addition(n1, n2); // addition
        
        System.out.println(n1.toString() + " * " + n2.toString() +" = "+ result.toString()); // multiplication
        System.out.println(n1.toString() + " / " + n2.toString() +" = "+ result2.toString()); // division
        System.out.println(n1.toString() + " + " + n2.toString() +" = "+ result3.toString()); // addition
        
    // ************************ print output ****************************
    
    
    // ******** closing message *********
        
        //System.out.println(programInfo.getClosingMessage());
        //fout.println(programInfo.getClosingMessage());
        
    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        //fout.close();               // close output stream
        
    }  // end main
}  // end class
