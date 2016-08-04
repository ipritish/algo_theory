package algorithms.sort;

public class SelectionSort {
	
	private static void selectionSort(int[] a){
		for (int i=0 ;i< a.length;i++){
			int min_value = a[i];
			for (int j=i;j<a.length;j++){
				if (min_value >= a[j]){
					min_value = a[j];
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
	}

	public static void main(String[] args) {
		
		int[] a = {2,4,5,4,4,8,7,6,2,8,4,2,1};
		
		int[] b = {4,6,2,8,5,0,1,5,7,8};
		
		selectionSort(a);
		selectionSort(b);
		
		for (int i=0 ; i< a.length; i++){
			System.out.println(a[i]);
		}
		
		System.out.println("For B");
		
		for (int i=0 ; i< b.length; i++){
			System.out.println(b[i]);
		}

	}

}
