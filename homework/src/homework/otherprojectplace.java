package homework;

import java.util.Scanner;
import java.util.Arrays;

public class otherprojectplace {
	public static void main(String[] args) {
		/*
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println(var4);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		/*
		int arr[] = new int[10];
		System.out.println(arr.length);
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int) (Math.random()* 10) + 1;
			Arrays.sort(arr);
			System.out.println(arr[i]);
		}
		*/
			
		int arr[] = new int[10];
		for(int i = 0; i < 10; i++) {
		int a = sc.nextInt();
		arr[i] = a;
		System.out.println(arr[i]);
		}
		
		
		
		/*
		System.out.print("�Է�asdfsadafsdafsdafsdafdaf : ");
		String a = sc.nextLine();
		System.out.print("�Է� sadfsadfsdafsadfsdafsdaf: ");
		String b = sc.nextLine();
		
		System.out.println(a);	
		System.out.println(b);
		*/	
		
		/*
		int[] arr1 = {100, 2, 3, 45, 1, 0, 90};
		Arrays.sort(arr1);
		for(int i = 1;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		*/
	}
}
