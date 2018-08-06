package pathSumTwoWays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PathSumTwoWays {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		int size = 80;
		int[][] matrix = new int[size][size];
			
		//boilerplate code to read matrix.txt file
		File file = new File("matrix.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		//read each line and add it the matrix array
		try {
			String line = bufferedReader.readLine();
			int row = 0;
			while (line != null) {
				int col = 0;
				String[] values = line.split(",");
				for (int i = 0; i < values.length; i++) {
					matrix[row][col] = Integer.parseInt(values[i]);
					col++;
				}
				line = bufferedReader.readLine();
				row++;
			}		
		} catch (IOException e) {
			e.getStackTrace();
		}
						
		System.out.println("The minimum path sum is " + findMinimumPathSum(matrix, size));
		
	}
	
	/*
	 * Use dynamic programming to find the minimum path sum
	 */
	public static int findMinimumPathSum(int[][] matrix, int size) {
		
		int n = size - 1;
		
		for (int i = n; i >= 0; i--) {
		    for (int j = n; j >= 0; j--) {
		    	if (i < n && j < n) {
		            matrix[i][j] += Math.min(matrix[i + 1][j], matrix[i][j + 1]);
		        } else if (i < n) {
		            matrix[i][j] += matrix[i + 1][j];
		        } else if (j < n) {
		        	matrix[i][j] += matrix[i][j + 1];
		        }
		    }
		}
		 
		return matrix[0][0];
	}
}