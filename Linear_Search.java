package Arrays_Concepts;
import java.util.*;
public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int loc=-1;
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int val=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==val)
			{
				loc=i+1;
				break;
			}
		}
		if(loc==-1)
			System.out.println("Not available");
		else
			System.out.println("Available at= "+ loc);

	}

}
