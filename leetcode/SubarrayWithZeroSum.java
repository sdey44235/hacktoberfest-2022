package prefixSumZero;

import java.util.HashSet;
public class SubarrayWithZeroSum {
	
	public static boolean subarraywithzerosum(int[] a)
	{
		int n=a.length;
		
		Set<Integer> set = new HashSet<>();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
			if(set.contains(sum))
			{
				return true;
			}
			set.add(sum);
		}
		return false;
	}

	public static void main(String[] args) {
		
		int[] arr= {2,3,1,-4,3,2};
		subarraywithzerosum(arr);
		
		

	}

}
