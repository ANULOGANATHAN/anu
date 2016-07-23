# anu

package org.ksrce.logic2.loop;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	
		int sum=0;
		while (n > 0) {
			int a = n % 10;
			n = n / 10;
			sum=sum+a;
		}
		System.out.println("sum digits" +sum);
	}

}
