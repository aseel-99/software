package calc;
import java.awt.*;  
import java.awt.event.*;
import java.util.Scanner;  
import java.awt.*;
import java.lang.*;
	
public class Calc1
{
	





public static int add(int n1, int n2)
{  
	
	int reuslt= n2+n1;
	return reuslt;
	
	
	}
public static int mult(int n1, int n2)
{  
	
	int reuslt= n1*n2;
	return reuslt;
	
	
	}
public static int div(int n1, int n2)
{  
	
	int reuslt= n2/n1;
	return reuslt;
	
	
	}

public static int sub(int n1, int n2)
{  
	
	int reuslt= n2-n1;
	return reuslt;
	
	
	}

public static void main(String[] args) {
    Scanner Calc = new Scanner(System.in);
    int n1;
    int n2;
    int Answer;

    System.out.println("Enter the first number: ");
    n1 = Calc.nextInt();
    System.out.println("Enter the second number:" );
    n2 = Calc.nextInt();
    int reuslt = add(n1,n2);
    System.out.println("Answer:" + reuslt);
    int reuslt1 = sub(n1,n2);
    System.out.println("Answer:" + reuslt1);
    int reuslt2 =mult(n1,n2);
    System.out.println("Answer:" + reuslt2);
    int reuslt3 = div(n1,n2);
    System.out.println("Answer:" + reuslt3);
   
    
}
}