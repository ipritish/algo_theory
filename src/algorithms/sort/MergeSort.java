package algorithms.sort;

public class MergeSort {
	
	
	private static void merge(){
		
	}
	
	private static void mergeSort(int[] a, int p, int r){
		
	}

	public static void main(String[] args) {
		
		int[] a = {2,4,5,4,4,8,7,6,2,8,4,2,1};
		
		int[] b = {4,6,2,8,5,0,1,5,7,8};
		
		mergeSort(a,0,a.length - 1);
		mergeSort(b,0,b.length - 1);
		
		for (int i=0 ; i< a.length; i++){
			System.out.println(a[i]);
		}
		
		System.out.println("For B");
		
		for (int i=0 ; i< b.length; i++){
			System.out.println(b[i]);
		}
		

	}

}
