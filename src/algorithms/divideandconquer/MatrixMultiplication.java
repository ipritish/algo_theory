package algorithms.divideandconquer;


//assuming proper matrix structure
public class MatrixMultiplication {
	
	private static int[][] matrixMultiply(int[][] a, int[][] b ){
		int[][] c = new int[a.length][b[0].length];
		if (a[0].length == b.length){
			System.out.println("We can multiply these array");
			for (int i=0 ; i<a.length; i++){
				for (int j=0; j<b.length; j++){
					
				}
			}
			
			
		}
		return c;
	} 

	public static void main(String[] args) {
		int[][] a = new int[][]{{2,4,5,1,6},{1,1,1,1,1},{3,6,4,1,6},{6,4,2,4,5},{5,5,5,5,5}};
		int[][] b = new int[][]{{2,4,5,1,6},{1,1,1,1,1},{3,6,4,1,6},{6,4,2,4,5},{5,5,5,5,5}};
		
		System.out.println("A length : " + a[0].length);
		System.out.println("B length : " + b[0].length);
		matrixMultiply(a, b);

	}

}
