package algorithms;

public class InsertionSort {
	
	
	private static void insertion_sort(int[] a){
		for (int j=1 ; j< a.length;j++){
			int key = a[j];
			int i = j-1;
			while(i>=0 && a[i] > key){
				a[i+1] = a[i];
				i = i-1;
			}
			a[i+1] = key;
		}
		//return a;
	}
	
	public static void main(String[] args){
		System.out.println("Test");
		int[] a = {2,4,5,4,4,8,7,6,2,8,4,2,1};
		insertion_sort(a);
		//System.out.println(b.length);
		
		for (int i=0 ; i< a.length; i++){
			System.out.println(a[i]);
		}
		
	}

}
