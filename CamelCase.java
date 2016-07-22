# anu


public class CamelCase {

	public static void main(String[] args) {
		
		String str="have a nice day";
		String[] str1=str.split(" ");
		String ans = "";
		for(int i=0;i<str1.length;i++){
			String s=str1[i].toLowerCase();
			if(i!=0){
				char ch = str1[i].charAt(0);
				ch = (char) (ch-32);
				str1[i] = ch+str1[i].substring(1, str1[i].length());
			}
			ans+=str1[i];
		}
		

System.out.println(ans);
	}

}
