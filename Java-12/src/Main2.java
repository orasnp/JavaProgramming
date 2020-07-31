import java.util.Scanner;
public class Main2 { 
    public static void main(String[] args) { 
    	double rad,area,circum;
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Radius = ");
    	rad = scan.nextDouble();
    	area = Math.PI*(Math.pow(rad, 2));
    	System.out.println("Area: " + area);
    	circum=2*Math.PI*rad;
    	System.out.println("Circumference:" + circum);
    	
    	
    }

    } 

 
