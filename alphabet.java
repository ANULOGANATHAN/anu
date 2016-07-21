# anu

public class alphabet {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	char b=s.next().charAt(0);
	if((b>=65&&b<=90)||(b>=97&&b<=122))
	{
		System.out.println("character");
	}
	else{
		System.out.println("not character");
	}
	}
