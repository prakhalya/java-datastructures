package Datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class rotatearr {
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
		System.out.println("enter the no of rotation:");
		int r=sc.nextInt();
		   
	        for (int i = 0; i < r; i++) {
	            int first = num[0];
	            for (int j = 0; j < n - 1; j++) {
	                num[j] = num[j + 1];
	            }
	            num[n - 1] = first;
	        }
		System.out.println(Arrays.toString(num));
	}
}
