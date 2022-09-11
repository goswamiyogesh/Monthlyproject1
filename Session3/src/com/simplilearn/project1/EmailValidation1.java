package com.simplilearn.project1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.*;

public class EmailValidation1 {

	public static void main(String[] args) {
		
    ArrayList<String> emails = new ArrayList<String>();
    //initialize array of string(reference email id's)
    emails.add("Yogesh123@gmail.com");
    emails.add("Himpriya981@gmail.com");
    emails.add("Sunita147@gmail.com");
    emails.add("Mahavir258@gmail.com");
    emails.add("Rohit369@gmail.com");
    emails.add("Soniapayla123@gmail.com");
    emails.add("Akksh987@gmail.com");
    emails.add("Navdeepbawa098@gmail.com");
    emails.add("Athravbawa567@gmail.com");
    
   //To take input from user
    Scanner sc = new Scanner(System.in);
    System.out.println(" Please Enter your emails to validate:");
    String mail = sc.nextLine();
    
   //syntax  for pattern matching
    Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
    Matcher matcher = pattern.matcher(mail);{
     if(matcher.matches()) {
    	  System.out.println("Pattern matched");  	
    	}
     else {
    	 System.out.println("Pattern  not matched");  	
     }
     }
    //To check whether USER given email id is matched with array of string
	       boolean flag = false;
		   for(String i:emails) {
           if(i.equals(mail)) {
    	      flag = true;
         	    break;
         }	
    	}
    
           if(flag){
	          System.out.println("Valid");
      }
           else {
	    	  System.out.println("Invalid");
	      }
	        sc.close();
          }
}
            
      
     
    
      
    	  
	  
	  
	  
   


