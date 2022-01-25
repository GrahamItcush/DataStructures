package A7;

import java.util.LinkedList;

public class Graph {

	// Represents the number of vertices (nodes) in the graph
	private int numVertices;

	// Stores the adjacency matrix
	private int[][] adjMatrix;

	// Stores the adjacency lists (note it is an array of LinkedLists)
	private LinkedList<Integer>[] adjListArray;

	public Graph(int[][] adjMatrix) {
		this.adjMatrix = adjMatrix;
		this.numVertices = adjMatrix.length;
		adjListArray = new LinkedList[numVertices];
		generateAdjList();
	}

	private void generateAdjList() {
		for (int i = 0; i < numVertices; i++) {
			adjListArray[i] = new LinkedList<Integer>();
			for (int j = 0; j < numVertices; j++) {
				if (adjMatrix[i][j] == 1)
					adjListArray[i].add(j);
			}
		}

	}

	// A method to print the adjacency matrix
	public void printMatrix() {
		for (int i = 0; i < numVertices; i++) {
			for (int j = 0; j < numVertices; j++) {
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	// A method to print the adjacency list
	public void printList() {
		for (int i = 0; i < numVertices; i++) {
			for (int j = 0; j < adjListArray[i].size(); j++) {
				System.out.print(adjListArray[i].get(j) + " ");
			}
			System.out.println();
		}
	}
}
