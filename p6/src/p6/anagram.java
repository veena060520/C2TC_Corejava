package p6;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
         System.out.println("Enter First String");
         String str1=input.nextLine();
         System.out.println("Enter Second String");
         String str2=input.nextLine();
          if(str1.length() ==str2.length()) {
        	  char[] charArray1=str1.toCharArray();
        	  char[] charArray2=str2.toCharArray();
          
        	  Arrays.sort(charArray1);
        	  Arrays.sort(charArray2);
        	      
        	  boolean result=Arrays.equals(charArray1,charArray2) ;
        	  
        	  if(result) {
        		  System.out.println(str1 +"and" +str2 +"are anagram");
        	  }
        	  else {
        		  System.out.println(str1 +"and" +str2 +"are not anagram");
        	  }
        	 input.close();
        	 
        	  }
         
          }





	}


