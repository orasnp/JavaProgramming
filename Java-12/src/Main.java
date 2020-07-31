import java.util.Scanner;
public class Main { 
    public static void main(String[] args) { 
    	int a,b,c;
    	int maxValue;
    	Scanner scan=new Scanner(System.in);
    	System.out.print("A:");
    	a=Integer.parseInt(scan.nextLine());
    	System.out.print("B:");
    	b=Integer.parseInt(scan.nextLine());
    	System.out.print("C:");
    	c=Integer.parseInt(scan.nextLine());
    	
    	maxValue=Math.max(Math.max(a,b),c);
    	System.out.println(maxValue);
    	
    	scan.close();
    }

    } 

 