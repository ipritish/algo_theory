package algorithms.sort;


//wrong look into it
public class MergeSort {
	
	
	private static void merge(int a[], int p, int q, int r){
		
		int n1 = q - p + 1;
		int n2 = r-q;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		
		for (int i=0; i<n1; i++){
			L[i] = a[p+i];
		}
		for (int j=0; j<n2; j++){
			R[j] = a[q+j];
		}
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for (int k=p ; k<r; k++){
			if (L[i] <= R[j]){
				a[k] = L[i];
				i++;
						
			}
			else{
				a[k] = R[j];
				j++;
			}
		}
		
		
	}
	
	private static void mergeSort(int[] a, int p, int r){
		if (p < r){
			int q = (p + r) /2;
			mergeSort(a,p,q);
			mergeSort(a,(q + 1),r);
			merge(a,p,q,r);
		}
		
	}

	public static void main(String[] args) {
		
		int[] a = {2,4,5,4,4,8,7,6,2};
		
		int[] b = {4,6,2,8,5,0,1,5,7,8};
		
		mergeSort(a,0,a.length);
		mergeSort(b,0,b.length );
		
		for (int i=0 ; i< a.length; i++){
			System.out.println(a[i]);
		}
		
		System.out.println("For B");
		
		for (int i=0 ; i< b.length; i++){
			System.out.println(b[i]);
		}
		

	}

}
