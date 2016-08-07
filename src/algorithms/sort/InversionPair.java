package algorithms.sort;

public class InversionPair {
	
	private static int totalInversionPair = 0;
	
	public static int getTotalInversionPair() {
		return totalInversionPair;
	}


	public static void setTotalInversionPair(int totalInversionPair) {
		InversionPair.totalInversionPair = totalInversionPair;
	}


	private static void findTotalInversionPair(int a[], int p, int q, int r){
		
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
        while (i < n1)
        {
        	while(j< n2){
				if (L[i] > R[j]){
					setTotalInversionPair(getTotalInversionPair() + 1);
					
							
				}
				j++;
			}
        	j = 0;
        	i++;
			
		}
		
	}
	

	private static void divideArray(int[] a, int p, int r){
		if (p < r){
			int q = p + (r - p) /2;
			divideArray(a,p,q);
			divideArray(a,(q + 1),r);
			findTotalInversionPair(a,p,q,r);
		}
		
	}

	public static void main(String[] args) {
		
		int[] a = {2,4,5,4,4,8,7,6,2};
		
		int[] b = {4,6,2,8,5,0,1,5,7,8};
		
		divideArray(a,0,a.length - 1);
		//mergeSort(b,0,b.length-1 );
		
		System.out.println("Total inversion pair for a " + getTotalInversionPair());
		setTotalInversionPair(0);
		
		divideArray(b,0,b.length-1);
		System.out.println("Total inversion pair for b " + getTotalInversionPair());
		
		
		

	}

}
