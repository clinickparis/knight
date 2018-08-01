package pleasure;

public class shrink {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 7; i++) { 
			int a = (int) 2 + (int) (Math.random() * 29);
			if (a % 2 == 0) {

			} else {
				a += 1;
			}

			System.out.println(a);
			sum = sum + a;
		}
		System.out.println("2到32之间的六个任意偶数和为" + sum);
	}

}