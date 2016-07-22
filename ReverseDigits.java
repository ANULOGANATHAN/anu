# anu

public class ReverseDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];

		int n = scan.nextInt();
		int i = 0, a;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			arr[i] = a;

			System.out.print(arr[i]);
			i++;
		}

	}

}
