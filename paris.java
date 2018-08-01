package pleasure;

public class paris {
	public static void main(String[] args) {
		int[]arr= {2,3,4,1,8,9,6,7,5,0};
		paris sorter = new paris();//初始化
		sorter.sort(arr);//调用排序方法
	}
	public void sort(int[]array) {
		int index;
		for(int i=1;i<array.length-i;i++) {
			index=0;
			for(int j=0;j<=array.length-i;j++) {
				if(array[j]>array[index]) {
					index=j;
				}
			}
				int temp=array[array.length-i];
				array[array.length-i]=array[index];
				array[index]=temp;
				}
				showArray(array);
			}
			public void showArray(int[] array) {
				for(int i:array) {
					System.out.print("<"+i);
				}
				System.out.println();
			
	
	}

}
