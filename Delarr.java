package Datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Delarr {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size:");
		int n=sc.nextInt();
		int[] num = new int[20]; 

		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("enter del pos:");
		int del=sc.nextInt();
		num[del-1]=0;
		for(int pos=del-1;pos<=n;pos++)
		{
			num[pos]=num[pos+1];
		}
		n--;
		System.out.println(Arrays.toString(num));
	}

}
