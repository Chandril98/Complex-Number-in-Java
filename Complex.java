import java.lang.*;
import java.util.Scanner;

class Calc 
{
	float img , real, a, b, c, d; // local variable 
	
	Calc(){} //do nothing constructer or default constructer
	
	Calc(float r, float i)             // parameterized constructer
	{
		real= r;                 // setting some properties of the object
		img=i;
		
	}
	
	void display()
	{
		System.out.println(real+" +i" +img ); // display complex number
	}
	
	
	Calc add(Calc c2)  // c3 return type is calc ... return type is Calc ,add is the fuction name , Calc c2 because the object we are passing is a Calc
	{
		Calc res = new Calc(); // another object res
		
		res.real = real + c2.real;
		res.img = img + c2.img;
		
		return(res); //store inside c3
	}
	Calc sub(Calc c2)  // c3 return type is calc ... return type is Calc ,sub is the fuction name , Calc c2 because the object we are passing is a Calc
	{
		Calc res1= new Calc(); // another object res1
		
		res1.real = real - c2.real;
		res1.img = img - c2.img;
		
		return(res1); //store inside c3
	}
}

class Complex
{
	public static void main(String args[])
    {
		
		Scanner user = new Scanner(System.in);
		System.out.println("Enter 1st num Real part");
		float a= user.nextFloat();
		System.out.println("Enter 1st num Imaginary part");
		float b = user.nextFloat();
		System.out.println("Enter 2nd num Real part");
		float c= user.nextFloat();
		System.out.println("Enter 2nd num Imaginary part");
		float d = user.nextFloat();
		
		
		
		Calc c1 = new Calc(a,b);  //two objects of calc class
		Calc c2 = new Calc(c,d);
		
		System.out.println("1st Complex number ");
		c1.display();
		System.out.println("2nd Complex number");
		c2.display();
		
		Calc c3 = new Calc(); // another object to store result
		
		c3 = c1.add(c2);   //using c1 call function add and pass it to c2 ..as it will return to c3 which is also a calc line 18..
	    System.out.println("Addition :");
		c3.display(); // result for addition
		
		c3 = c1.sub(c2); // same logic but this time for substraction
		System.out.println("Substarction :");
		c3.display(); // result for substraction
		
		
		
	}  	
	
	
}