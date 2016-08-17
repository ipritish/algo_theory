package algorithms.divideandconquer;


//assuming proper matrix structure
public class MatrixMultiplication {
	
	private static int[][] matrixMultiply(int[][] a, int[][] b ){
		int[][] c = new int[a.length][b[0].length];
		if (a[0].length == b.length){
			System.out.println("We can multiply these array");
			for (int i=0 ; i<a[0].length; i++){
				for (int j=0; j<b.length; j++){
					c[i][j] = 0;
					for (int k=0; k<a[0].length;k++){
						c[i][j] = c[i][j] + a[i][k]*b[k][j]; 
					}
					
				}
			}
			
			
		}
		return c;
	} 

	public static void main(String[] args) {
		int[][] a = new int[][]{{2,4,5,1,6},{1,1,1,1,1},{3,6,4,1,6},{6,4,2,4,5},{5,5,5,5,5}};
		int[][] b = new int[][]{{2,4,5,1,6,7},{1,1,1,1,1,7},{3,6,4,1,6,7},{6,4,2,4,5,7},{5,5,5,5,5,7}};
		
		System.out.println("A length : " + a[0].length);
		System.out.println("B length : " + b[0].length);
		int[][] c = matrixMultiply(a, b);
		System.out.println("C first Entry" + c[0][0]);

	}

}
