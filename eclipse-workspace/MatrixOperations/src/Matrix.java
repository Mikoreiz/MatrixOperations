
public class Matrix {

	private int matrix[][];
	
	public Matrix(int Nrow, int Ncolumn) {
		// TODO Auto-generated constructor stub
		matrix = new int[Nrow][Ncolumn];
	}
	public static boolean isSquareMatrix(Matrix mat) {
		// Determines whether matrix is a square matrix
		if (mat.matrix.length == mat.matrix[0].length)
			return true;
		else 
			return false;
	}
	public static int[][] add(Matrix one, Matrix two) {
		//Adds two matrixes together
		int[][] aux = new int[one.matrix.length-1][one.matrix[0].length-1];
		if (one.matrix.length==two.matrix.length && two.matrix[0].length==two.matrix[0].length) {
	        for(int row = 0; row < one.matrix.length-1; row++) {
	            for(int col = 0; col< one.matrix[0].length-1; col++) {
	                aux[row][col] = one.matrix[row][col] + two.matrix[row][col];
	            }
			} return aux;
		}
		else return aux;
	}

	public static int[][] sub(Matrix one, Matrix two) {
		//Subtracts two matrixes together
		int[][] aux = new int[one.matrix.length-1][one.matrix[0].length-1];
		if (one.matrix.length==two.matrix.length && two.matrix[0].length==two.matrix[0].length) {
	        for(int row = 0; row < one.matrix.length-1; row++) {
	            for(int col = 0; col< one.matrix[0].length-1; col++) {
	                aux[row][col] = one.matrix[row][col] - two.matrix[row][col];
	            }
			} return aux;
		}
		else return aux;
	}
	public static int[][] transpose (Matrix mat){
		//Returns the transpose of a matrix
		int[][] aux = new int[mat.matrix.length-1][mat.matrix[0].length];
        for(int row = 0; row < mat.matrix.length-1; row++) {
            for(int col = 0; col< mat.matrix[0].length-1; col++) {
                aux[row][col] = mat.matrix[col][row];
            }
		} return aux;	
	
	}
}

