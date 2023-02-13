import java.util.* ;
import java.io.*; 
public class Mapcoloring {
	public static String graphColoring(int[][] adjMatrix, int m) {

    	int n = adjMatrix.length;
		int color[] = new int[n];
		for(int i = 0; i < n; i++) {
			if(adjMatrix[i][i] == 1) {
				return "NO";
			}
		}

		if(colorGraph(adjMatrix, m, 0, color, n, 0)) return "YES";
		
		return "NO";


	}

	public static boolean colorGraph(int[][] adjMatrix, int m, int index, int[] color, int n, int v) {
		if(v == n) {
			return true;
		}
		for (int j = 1; j <= m; j++) {
			if(isSafe(adjMatrix, color, n, j, v)) {
				color[v] = j;
				if(colorGraph(adjMatrix, m, index, color, n, v + 1)) {
					return true;
				}
				color[v] = 0;
			}
		}
		return false;
	}



	public static boolean isSafe(int[][] adjMatrix, int[] color, int n, int c, int v) {
		for (int i = 0; i < n; i++) {
			if(adjMatrix[v][i] == 1 && c == color[i]) {
				return false;
			}
		}
		return true;
	}	


	
}
