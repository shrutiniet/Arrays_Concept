package Arrays_Concepts;
import java.util.*;
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int val=sc.nextInt();
		int out=indexOf(arr,val);
		System.out.println(out);		
		}

	public static int indexOf(int [] arr, int val)
	{
		int s=0;
		int e=arr.length-1;
		while(s<=e)
		{
			int mid=(s+e)/2;
			if(val==arr[mid])
				return mid;
			else if(val<arr[mid])
				e=mid-1;
			else
				s=mid+1;				
		}
		return -1;
		
	}

}
