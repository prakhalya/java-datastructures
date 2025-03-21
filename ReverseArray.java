package Datastructure;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size:");
		int n=sc.nextInt();
		int[] num = new int[n]; 

		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(num[i]);
		}
		for(int i=0;i<n/2;i++)
		{
			int temp=num[i];
				num[i]=num[n-i-1];
				num[n-i-1]=temp;
		}
		System.out.println("reversed array");
		for(int i=0;i<n;i++)
		{
			System.out.println(num[i]);
		}
	}
	
   
}
