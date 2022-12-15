
public class Matrix {

	public static void main(String[] args) {
		int rows=2,col=3;
		int [][]arr1 = {{3,4,5},{6,7,8}};
		int [][]arr2 = {{2,1,3},{5,4,6}};
		
		AddTwoMatrix(arr1,arr2,rows,col);

	}
	// static method for addition of two matrices
	public static void AddTwoMatrix(int [][]arr1,int [][]arr2,int rows,int col) {
		int [][]sum = new int[rows][col];
		for(int i=0; i<rows;i++) {
			for(int j=0; j<col;j++) {
				sum[i][j] = arr1[i][j]+ arr2[i][j];
			}
		}
		printMatrix(sum);
	}
	// static method for print the sum of two matrices
	public static void printMatrix(int [][]sum) {
		System.out.println("Sum of two matrices is: ");
		for(int[] row: sum) {
			for(int col:row) {
				System.out.print(col +" ");
			}
			System.out.println();
		}

	}

}
