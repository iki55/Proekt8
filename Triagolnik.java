package proekt_8;

import java.util.Scanner;

public class Triagolnik {

	public static void main(String[] args) {
	Double a,b,c;
	Scanner tastatura = new Scanner(System.in);
	System.out.println("Programot proveruva dali se formira triagolnikot i dali  e pravoagolen,ostroagolen ili tapoagolen");
	System.out.println("Vnesete ja prvata strana=");
	a =tastatura.nextDouble();
	System.out.println("Vnesete ja vtorata strana=");
    b =tastatura.nextDouble();
    System.out.println("Vnesete ja tretata strana=");
	c=tastatura.nextDouble();
	if (a+c>b && a+b>c && b+c>a) {
		System.out.println ("Se formira triagolnik");}
	else {
		System.out.println ("Ne se formira triagolnik");
		System.exit(0);}
	if (c*c==a*a+b*b | b*b==a*a+c*c | a*a==b*b+c*c )
		System.out.println ("Triagolnikot e pravoagolen");
	if  (c*c>a*a+b*b |a*a>c*c+b*b | b*b>a*a+c*c )
	System.out.println ("Triagolnikot e ostroagolen");
	else 
		System.out.println ("Triagolnikot e tapoagolen");
		
	
	

	}

}
