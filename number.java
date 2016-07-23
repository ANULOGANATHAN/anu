# anu

package org.ksrce.logic.number;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		int[] a = new int[5];
		int count = 0;int count1 = 0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			a[i] = scanner.nextInt();
		}
		for (int j = 0; j < 5; j++) {
			if (a[j] >= 0) {

				count++;

			} else if (a[j] <= -1) {
				
				count1++;
			}
		}
				System.out.println(" positive number is " + count);
			

				System.out.println("negative number" + count1);
			}

		

	}

