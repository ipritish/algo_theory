package algorithms.dp;

public class MaximumSubArrayK {
	
	private static int maximum_sub_array_sum (int[] a){
		int max_so_far = 0;
		int max_ending_here = 0;
		for (int i=0; i<a.length; i++){
			
			max_ending_here = Math.max(0, max_ending_here+a[i]);
			max_so_far = Math.max(max_ending_here, max_so_far);
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		int[] a = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		int result = maximum_sub_array_sum(a);
		System.out.println("result : " + result);
		
		int[] b = {1,-4,3,-4};
		int resultb = maximum_sub_array_sum(b);
		System.out.println("result : " + resultb);
		
		int[] c = {-3,-5,-3,-9,-10,-2,-43,-23,-12,-7};
		int resultc = maximum_sub_array_sum(c);
		System.out.println("result : " + resultc);

	}

}
