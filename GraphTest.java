package A7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class GraphTest {
 public static void main(String[] args) {

  System.out.println("Graph 1:");
  Graph graph1 = new Graph(randomMatrix(4));
  graph1.printMatrix();
  graph1.printList();
  
  System.out.println("\nGraph 2:");
  Graph graph2 = new Graph(randomMatrix(6));
  graph2.printMatrix();
  graph2.printList();
 }
 
 //This method is to create an NxN matrix with random numbers
 private static int[][] randomMatrix(int numVertices) {
  int[][] matrix = new int[numVertices][numVertices];
  
  for(int row = 0; row < numVertices; row++) {
   for(int col = 0; col < numVertices; col++) {
    if(row == col) {
     matrix[row][col] = 0;
    }else {
     matrix[row][col] = (int) (Math.round(Math.random()));
    }
   }
  }
  
  return matrix;
 }
}
