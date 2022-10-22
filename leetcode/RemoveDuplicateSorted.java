package removeDuplicateSorted;

import java.util.Scanner;
public class RemoveDuplicateSorted {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int i=1,j=1;
		while(i<n && j<n)
		{
			if(arr[j] != arr[i])
			{
				arr[j+1]=arr[i];
				j++;
			}
			i++;
		}
		for(int k=0;k<n;k++)
		{
			System.out.print(arr[k]+" ");
		}
		

	}

}
