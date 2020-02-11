package cs;

import java.util.Scanner;
class Caluclator{
	 int subtract(int a,int b){
	        return a-b;
	    }
	    
	    int add(int a,int b){
	        return a+b;
	    }
	    int multiply(int a,int b){
	        return a*b;
	    }
	    double divide(double a,double b){
	        double r=a/b;
	        return r;
	    }
}
public class epam3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter a value:");
		int a=s.nextInt();
		
		System.out.println("enter b value");
		int b=s.nextInt();
		System.out.println("enter operation '+','-','/','*':");
		char c=s.next().charAt(0);
		Caluclator x1=new Caluclator();
		if(c=='-')				
		System.out.println(x1.subtract(a,b));
		else if(c=='+')
		System.out.println(x1.add(a,b));
		else if(c=='/') {
			
		
			System.out.println(x1.divide((double)a,(double)b));
		}
		else
		System.out.println(x1.multiply(a,b));
		
		
		
		
	}
}
