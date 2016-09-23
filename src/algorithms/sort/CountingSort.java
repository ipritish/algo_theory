package algorithms.sort;

import java.util.Arrays;

public class CountingSort {
	
	
	public static void counting_sort(int[] a, int[] b, int k){
		
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
	
	public static void main(String[] args){
		int[] a = {1,5,3,54,34,22,43,64,23,34,67,90,23};
		int[] b = {43,65,23,43,34,34,23,43,23,23,33,67};
		
		int[] c = new int[a.length];
		for(int i=0;i<a.length;i++){
			c[i] = a[i];
		}
		
		System.out.println(find_max_val(a));
		System.out.println(find_max_val(b));
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		
		
	}

}
