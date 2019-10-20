package com.sstech.java_practice;


public class App 
{
    public static void main( String[] args ){
    	
    	int num3=20;
    	int grandTotal;
    	
    	//ifElse();
    	//calculations(10,20);
    	//int totalNum= calUsingReturn(10, 20);
    	
    	//grandTotal=num3+totalNum;
    	forLoop();
    	
    	
    	
      	
        
    }
    
    public static void ifElse() {
    	
    	int mynumber= 84;
    	if(mynumber>90) {
    		System.out.println("A");
    	}
    	else if(mynumber>80 && mynumber<=90) {
    		//System.out.println("B");
    		if(mynumber<=90 && mynumber>85) {
    			System.out.println("B+");
    		}
    		else {
    			System.out.println("B-");
    		}
    	}
    	else {
    		System.out.println("others");
    	}
    		
    }
    
    public static void calculations(int num1, int num2) {
    	
    	int total=num1+num2;
    	System.out.println(total);
    }
    
    public static int calUsingReturn(int num1, int num2) {
    	
    	int total=num1+num2;
    	return total;
    }
    
    public static void forLoop() {
    	String months[]= {"Jan","feb","mar"};

    	for(int i=months.length-1;i>=0;i--) {
    		System.out.println(months[i]);
    	}
    }
    
    
    
}
