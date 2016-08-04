package algorithms.sort;


//right
public class MergeSort {
	
	
	private static void merge(int a[], int p, int q, int r){
		
		int n1 = q - p + 1;
		int n2 = r-q;
		int i;
		int j;
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for (i=0; i<n1; i++){
			L[i] = a[p+i];
		}
		for (j=0; j<n2; j++){
			R[j] = a[q+j + 1];
		}

		i = 0;
		j = 0;
		int k = p;
        while (i < n1 && j < n2)
        {
			if (L[i] <= R[j]){
				a[k] = L[i];
				i++;
						
			}
			else{
				a[k] = R[j];
				j++;
			}
			k++;
		}
        
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            a[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (j < n2)
        {
            a[k] = R[j];
            j++;
            k++;
        }
		
		
	}
	
	private static void mergeSort(int[] a, int p, int r){
		if (p < r){
			int q = p + (r - p) /2;
			mergeSort(a,p,q);
			mergeSort(a,(q + 1),r);
			merge(a,p,q,r);
		}
		
	}

	public static void main(String[] args) {
		
		int[] a = {2,4,5,4,4,8,7,6,2};
		
		int[] b = {4,6,2,8,5,0,1,5,7,8};
		
		mergeSort(a,0,a.length - 1);
		mergeSort(b,0,b.length-1 );
		
		//System.out.println(a.length);
		//System.out.println(b.length);
		
		for (int i=0 ; i< a.length; i++){
			System.out.println(a[i]);
		}
		
		System.out.println("For B");
		
		for (int i=0 ; i< b.length; i++){
			System.out.println(b[i]);
		}
		

	}

}
