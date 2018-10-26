
public class Matrix {

	final int[] matrix;
	final int row, column;
	
	public Matrix(int[] Nmatrix, int Nrow, int Ncolumn) {
		// TODO Auto-generated constructor stub
		matrix = Nmatrix;
		row = Nrow;
		column = Ncolumn;
	}
	public static boolean isSquareMatrix(Matrix mat) {
		// Determines whether matrix is a square matrix
		if (mat.row == mat.column)
			return true;
		else 
			return false;
	}
	public static int[] add(Matrix one, Matrix two) {
		//Adds two matrixes together
		int[] aux = new int[one.matrix.length-1];
		if (one.row == two.row && one.column == two.column) {
			for (int element=0; element <= one.matrix.length-1; element++)
				aux[element] = one.matrix[element] + two.matrix[element];
			return aux;
			}
		else
			return aux;
	}
	public static int[] sub(Matrix one, Matrix two) {
		//Subtracts two matrixes together
		int[] aux = new int[one.matrix.length-1];
		if (one.row == two.row && one.column == two.column) {
			for (int element=0; element <= one.matrix.length-1; element++)
				aux[element] = one.matrix[element] - two.matrix[element];
			return aux;
			}
		else
			return aux;
	}
	
}
