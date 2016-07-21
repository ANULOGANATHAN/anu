
public class Leap {

	public static void main(String[] args) {
		int year;
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		int lp = y % 4;
		if (lp == 0) {
			System.out.println("leap");
		} else {
			System.out.println("not leap");
		}
	}

}
