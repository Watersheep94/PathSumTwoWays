package pathSumTwoWays;

import static org.junit.Assert.*;

import org.junit.Test;

public class PathSumTwoWaysTest {

	@Test
	public void testSmallMatrix() {
		
		int[][] matrix = new int[][] {
			{ 5, 25 },
			{ 20, 10 }
		};
		
		int minPath = PathSumTwoWays.findMinimumPathSum(matrix, matrix.length);
		assertEquals("Minimum path sum is incorrect.", 35, minPath);
	}
	
	@Test
	public void testLargeMatrix() {
		
		int[][] matrix = new int[][] {
			{ 131, 673, 234, 103, 18 },
			{ 201, 96,  342, 965, 150 },
			{ 630, 803, 746, 422, 111 },
			{ 537, 699, 497, 121, 956 },
			{ 805, 732, 524, 37,  331 },
		};
		
		int minPath = PathSumTwoWays.findMinimumPathSum(matrix, matrix.length);
		assertEquals("Minimum path sum is incorrect.", 2427, minPath);
	}

}
