package Arrays_Concepts;
import java.util.Scanner;
public class Max_subarray_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			if(sum<0)
				sum=0;
			max=Math.max(max,sum);
		}
		System.out.println(max);

	}

}
