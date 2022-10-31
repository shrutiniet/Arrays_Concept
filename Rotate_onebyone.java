package Arrays_Concepts;
import java.util.*;
public class Rotate_onebyone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr =new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int rot=sc.nextInt();
		if(rot>n)
			rot=rot%n;
		Rotate(arr,rot);
		for(int x:arr)
			System.out.print(x+" ");
	}
	public static void Rotate(int[]arr, int rot)
	{
		for(int i=0;i<rot;i++)
			Rotate_once(arr);
	}
	public static void Rotate_once(int [] arr)
	{
		int tmp=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=tmp;
	}

}
