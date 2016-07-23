# anu

package org.ksrce.strBuf;

public class package org.ksrce.strBuf;

public class Palindrom {

	public static void main(String[] args) {
		
		String str2 = "eye";
		String str3 = "";
		for (int i = str2.length() - 1; i >= 0; i--) {

			str3 = str3 + str2.charAt(i);
		}
		if (str2.equals(str3)) {
			System.out.println("palidrome");
		} else {
			System.out.println("not palindrome");
		}
	}

}


	
