package Datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Arran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] num = new int[n];  // Use the correct size based on user input

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        
        int index = 0; 

       
        for (int i = 0; i < n; i++) {
            if (num[i] != 0) {
                num[index++] = num[i];  
            }
        }

        
        while (index < n) {
            num[index++] = 0;
        }

        System.out.println(Arrays.toString(num));
    }
}


