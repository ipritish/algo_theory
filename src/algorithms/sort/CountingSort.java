package algorithms.sort;

import java.util.Arrays;

public class CountingSort {
	
	
	public static void counting_sort(int[] a, int[] b, int k){
		
		System.out.println("A length : "+a.length +" B length : "+ b.length);
		
		int[] c = new int[k+1];
		for(int i=0; i<k+1; i++){
			c[i] = 0;
		}
		for(int j=0 ;j<a.length;j++){
			c[a[j]] = c[a[j]] + 1;
		}
		for(int p=1; p<k+1;p++){
			c[p] = c[p] + c[p-1];
		}
		int t = a.length - 1;
		System.out.println(t);
		for(;t>=0;t--){
			b[c[a[t]] -1 ] = a[t];
			c[a[t]] = c[a[t]] - 1;
		}
		
	}
	
	public static int find_max_val(int[] a){
		int max = 0;
		for(int i=0; i<a.length; i++){
			if(max <= a[i]){
				max = a[i];
			}
		}
		return max;
	}
	
	public static int[] getNewArray(int[] a){
		int[] arr = new int[a.length];
		for(int i=0;i<a.length;i++){
			arr[i] = a[i];
		}
		return arr;
		
	}
	
	public static void main(String[] args){
		int[] a = {1,5,3,4,4,2,3,6,3,4,7,9,2};
		int[] b = {43,65,23,43,34,34,23,43,23,23,33,67};
		
		int[] newA = getNewArray(a);
		int[] newB = getNewArray(b);
		
		counting_sort(a, newA, find_max_val(a));
		counting_sort(b, newB, find_max_val(b));
		System.out.println(Arrays.toString(newA));
		System.out.println(Arrays.toString(newB));
		
		
	}

}
