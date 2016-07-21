# anu

public class Fact {

	public static void main(String[] args) {
		int i=1;
		int n = Integer.parseInt(args[0]);
		int b = 1;
		do {
			b = b * i;
			i++;
			
		}while(i<=n);
		System.out.println("factorial value is  " + b);
	}

}
