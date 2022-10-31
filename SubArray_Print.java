package Arrays_Concepts;
import java.util.*;
public class SubArray_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<=n-1;i++)
		{
			for(int j=i;j<=n-1;j++)
			{
				Print(arr,i,j);
				System.out.println();
			}
		}

	}
	public static void Print(int[]arr, int i, int j)
	{
		for(int a=i;a<=j;a++)
		{
			System.out.print(arr[a]+" ");
		}
	}

}
