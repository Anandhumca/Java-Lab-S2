import java.util.Scanner;
public class search
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int n=sc.nextInt();
		
		int[] num=new int[n];
		
		System.out.println("Enter the elements:");
		
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.print("Enter the element to search:");
		int key=sc.nextInt();
		boolean found=false;
		
		for(int i=0;i<n;i++)
		{
			if(num[i]==key)
			{
				System.out.println("Element found at position "+(i+1));
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Element not found");
		}
		sc.close();
	}
}
		
