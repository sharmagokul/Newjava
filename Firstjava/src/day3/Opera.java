package day3;

public class Opera {
	public static void main(String[] args) {
		
		//1 Arithmetic operators + - * / %
		
		int a=20, b=10;
		
		System.out.println("sum of a and b is:" +(a+b));
		System.out.println("diff of a and b is:" +(a-b));
		System.out.println("multipilcation of a and b is:" +(a*b));
		System.out.println("Division of a and b is:"+(a/b));
		System.out.println("Modulo division of a and b is:"+(a%b));
		
		//2 Relational /comparison operators > >= < <= != ==  true/false
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a>b);
		b=20;
		System.out.println(a<=b);
		System.out.println(a>=b);
		
		System.out.println(a!=b);
		System.out.println(a==b);
		
		boolean res= a>b;
		System.out.println(res);
		
		//3 Logical operators   &&  || !
	
		//works between 2 boolean values
				
		boolean x=true;
		boolean y=false;
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1=10>20;
		System.out.println(b1);
		
		boolean b2=20>10;
		System.out.println(b2);
		

		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		
		System.out.println((10<20) && (20>10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
