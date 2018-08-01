package pleasure;

import java.util.Arrays;

public class clean {
	public static void main(String[] args) {
		int[] arr = { 8, 6, 9, 5, 3, 7, 4, 20, 2 };
		clean sorter = new clean();
		sorter.sort(arr);
	}

	public void sort(int[] array) {
		for (int i = 1; i <= array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {						
				if (array[j] > array[j + 1]) {
					int temp = array[j];

					array[j] = array[j + 1];

					array[j + 1] = temp;
				}
			}
		}
		showArray(array);
	}
	public void showArray(int[]array) {
		int newarr[]=Arrays.copyOfRange(array, 0, 2);
		for(int i=0;i<newarr.length;i++) {
			System.out.println(newarr[i]);
		}
		

	
	}

}
