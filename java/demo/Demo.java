package com.cty.demo;
import java.util.Scanner;
public class Demo {
	   public static void main(String[]args){ 
	   System.out.println("What's your name?");
	   Scanner in=new Scanner(System.in); 
	   String name=in.nextLine();
	   System.out.print("Hello,"+name);
	   in.close();
	   }
}
	    
	   
