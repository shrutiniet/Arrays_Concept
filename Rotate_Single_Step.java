package Arrays_Concepts;
import java.util.*;
public class Rotate_Single_Step {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int rot=sc.nextInt();
		if(rot>n)
			rot=rot%n;
		Rotate(arr,rot);
		for(int x: arr)
			System.out.print(x+" ");
	}
	public static void Rotate(int[]arr, int rot)
	{
		Reverse(arr,0,arr.length-1);
		Reverse(arr,0, rot-1);
		Reverse(arr, rot, arr.length-1);
	}
	public static void Reverse(int [] arr, int s, int e)
	{		
		while(s<e)
		{
			int tmp=arr[s];
			arr[s]=arr[e];
			arr[e]=tmp;
			s++;
			e--;
			
		}
	}

}
