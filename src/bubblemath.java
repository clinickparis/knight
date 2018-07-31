
public class bubblemath {
	public static void main(String[]args) {
		int[] arr= {1,3,4,6,8,9,12,15,17,21,34};
		bubblemath sorter=new bubblemath();
		
		sorter.sort(arr);
	}
	
	public void sort(int[] array) {
		for(int i=1;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
			}
		}
		
		showArray(array);
	}
	public void showArray(int[]array) {
		for(int i:array) {
			System.out.print("<"+i);
		}
		System.out.println();
	}
				
	
	

}
