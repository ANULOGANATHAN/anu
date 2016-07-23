# anu


package org.ksrce.logic3.array;

import java.util.Scanner;

public class Reversearray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int i;

		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		for (i = 0; i < 10; i++) {
			arr[i] = s.nextInt();
		}
		for (i = 0; i < 10; i++) {
			System.out.println(" array order:"+arr[i]);	
		}
		System.out.println("\n");
		for (int j = arr.length-1; j >=0; j--) {
			System.out.println(" reverse array order:"+arr[j]);	
		}
	}
}
