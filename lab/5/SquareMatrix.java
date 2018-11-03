
public class SquareMatrix {

	public static void main(String[]args) {
		final int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		double[][] set = new double[matrix[0].length][matrix.length];
		for(int i = 0; i < matrix.length; i++) {
			for(int a = 0; a < matrix[i].length; a++) {
				set[a][i] = matrix[i][a];
				System.out.print(set[a][i] + " ");
		}
		System.out.println(transposeMatrix(set));
		}
		}
		public static double[][] transposeMatrix(double [][] m){
	        double[][] set = new double[m[0].length][m.length];
	        for (int i = 0; i < m.length; i++)
	            for (int j = 0; j < m[0].length; j++)
	                set[j][i] = m[i][j];
	        return set;
	    }

	}


