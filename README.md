# anu

public class Large {

	public static void main(String[] args) {
		int[] arr = new int[3];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			arr[i] = s.nextInt();
		}
		int max = arr[0];

		for (int j = 0; j < 3; j++) {
			if (max < arr[j]) {
				max = arr[j];

			}
		}
		System.out.println(max);
	}

}
