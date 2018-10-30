
public class Matrix {

	private int matrix[][];
	
	public Matrix(int[][] nMatrix) {
		// TODO Auto-generated constructor stub
		matrix = nMatrix;
	}
	public static boolean isSquareMatrix(Matrix mat) {
		// Determines whether matrix is a square matrix, meaning # of rows equal # of columns
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
	public static int[][] transpose(Matrix mat){
		//Returns the transpose of a matrix
		int[][] aux = new int[mat.matrix.length-1][mat.matrix[0].length];
        for(int row = 0; row < mat.matrix.length-1; row++) {
            for(int col = 0; col< mat.matrix[0].length-1; col++) {
                aux[row][col] = mat.matrix[col][row];
            }
		} return aux;	
	
	}
	public static int[][] multiply(Matrix one, Matrix two){
		//Returns the product of two matrices
		int[][] aux = new int[one.matrix.length-1][two.matrix[0].length];
		if (one.matrix[0].length==two.matrix.length) {
	        for(int element = 0; element < one.matrix.length; element++) {         // rows from m1
	            for(int element2 = 0; element2 < two.matrix[0].length; element2++) {     // columns from m2
	                for(int element3 = 0; element3 < one.matrix[0].length; element3++) { // columns from m1
	                    aux[element][element2] += one.matrix[element][element3] * two.matrix[element3][element2];
	                }
	            }
	        }
			return aux;
		} else return aux;
	}
	public static int[][] multiply(Matrix mat, int n){
		//Returns matrix with all its elements multiplied by n integer
		for (int row=0; row<mat.matrix.length; row++) {
			for (int col=0; col<mat.matrix[0].length; col++) {
				mat.matrix[row][col] = mat.matrix[row][col] * n;
			}
		}
		return mat.matrix;
	}
}
