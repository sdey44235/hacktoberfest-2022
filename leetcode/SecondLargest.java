package secondLargestElement;

import java.util.Scanner;

public class SecondLargest {

	public static int secondLargest(int[] arr) {
		
		int largest=0;
		int second=-1;
		if(arr.length<2)
		{
			return -1;
		}
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				second=largest;
				largest=i;
			}
			else if(arr[i]<largest)
			{
				if(second==-1 || arr[i]>second)
				{
					second=i;
				}
			}
		}
		return second;

	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=sc.nextInt();
		
		int[] a=new int[n];
		
		System.out.println("enter the values");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=secondLargest(a);
		System.out.println("the second largest element is "+a[max]);
	}

}
