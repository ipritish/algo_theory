package algorithms.divideandconquer;

public class MaximumSubArray {
	
	private static int max_cross_sub_array_sum(int[] a, int low, int mid, int high){
		int left_sum = Integer.MIN_VALUE;
		int right_sum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i=mid; i>=low ;i--){
			sum = sum + a[i];
			if (sum > left_sum){
				left_sum = sum;
				
			}
		}
		sum = 0;
		for (int j=mid+1;j<=high;j++){
			sum = sum + a[j];
			if (sum > right_sum){
				right_sum = sum;
			}
		}
		
		
		return left_sum + right_sum;
		
	}
	
	private static int find_sum_max_subarray(int[] a, int low, int high){
		if (high == low){
			return a[low];
		}
		else{
			int mid = (high + low)/2;
			int left_sum =  find_sum_max_subarray(a,low,mid);
			int right_sum = find_sum_max_subarray(a,mid+1,high);
			int cross_sum = max_cross_sub_array_sum(a,low,mid,high);
			return Math.max(Math.max(left_sum,right_sum),cross_sum);
		}
	}


	public static void main(String[] args) {
		int[] a = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		int result = find_sum_max_subarray(a, 0, a.length-1);
		System.out.println("result : " + result);
		
		int[] b = {1,-4,3,-4};
		int resultb = find_sum_max_subarray(b,0,b.length-1);
		System.out.println("result : " + resultb);
		
		int[] c = {-3,-5,-3,-9,-10,-2,-43,-23,-12,-7};
		int resultc = find_sum_max_subarray(c, 0, c.length-1);
		System.out.println("result : " + resultc);

	}

}
