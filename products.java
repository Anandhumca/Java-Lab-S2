import java.util.Scanner;
class products
{
	int pcode;
	String pname;
	double price;
	public products(int pc,String pn,double pr)
	{
		pcode=pc;
		pname=pn;
		price=pr;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int pc;
		String pn;
		double pr;
		System.out.println("Enter the details of product1(code,name,price)");
		pc=sc.nextInt();
		pn=sc.next();
		pr=sc.nextDouble();
		products p1=new products(pc,pn,pr);
		
		System.out.println("Enter the details of product2(code,name,price)");
		pc=sc.nextInt();
		pn=sc.next();
		pr=sc.nextDouble();
		products p2=new products(pc,pn,pr);
		
		System.out.println("Enter the details of product3(code,name,price)");
		pc=sc.nextInt();
		pn=sc.next();
		pr=sc.nextDouble();
		products p3=new products(pc,pn,pr);
		
		products low=p1;
		
		if(p2.price<low.price)
		{
			low=p2;
		}
		if(p3.price<low.price)
		{
			low=p3;
		}
		System.out.println("Lowest price product:"+low.pname);
	}
}
		
