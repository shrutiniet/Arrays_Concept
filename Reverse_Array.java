package Arrays_Concepts;
import java.util.*;
public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int s=0;
		int e=arr.length-1;
		while(s<e)
		{
			int tmp=arr[s];
			arr[s]=arr[e];
			arr[e]=tmp;
			s++;
			e--;
		}
		for(int x: arr)
			System.out.print(x+" ");

	}

}
