package leadersInArray;

import java.util.Scanner;
public class LeadersInArray {
	
	public static void leaderArray(int[] arr)
	{
		int[] ar=new int[arr.length];
		int j=0;
		int largest=Integer.MIN_VALUE;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
				System.out.println(arr[i]+" ");
				ar[j++]=arr[i];
			}
		}
		for(int k=j-1;k>=0;k--)
		{
			System.out.println(ar[k]+" ");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements ");
		int n=sc.nextInt();
		
		int[] a=new int[n];
		System.out.println("enter the elements ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		leaderArray(a);
		
	}

}
