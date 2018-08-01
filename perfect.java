package pleasure;

public class perfect {
	public static void main(String[] args) {
		int arr[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("原二维数组：");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { 
				System.out.print("\t" + arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("互调后的二维数组：");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { 

				System.out.print("\t" + arr[j][i]);
			}
			System.out.println();
		}
	}
}


