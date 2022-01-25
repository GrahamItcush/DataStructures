package A8;

public class HashTableTest {
	public static void main(String args[]) {
		
		HashTable table = new HashTable(13);

		int[] testArray1 = {11,49,24,37,54,50,19};
		int[] testArray2 = {13,26,39,52,65,78,91};
		int[] testArray3 = {10,11,13,16,20,25,31,38,46,55,65};
		int[] random = randomArray(7); //change the size of the random array here
		
		int[] insert = testArray1; //change which array you're testing here
		
		System.out.println("Linear Probing: ");
		table.setCollisionHandling(table.LINEAR_PROBE);
		for(int i : insert) table.add(i);
		System.out.println(table.toString());
		table.clear();

		System.out.println("Quadratic Probing: ");
		table.setCollisionHandling(table.QUADRATIC_PROBE);
		for(int i : insert) table.add(i);
		System.out.println(table.toString());
		table.clear();

		System.out.println("Double Hashing: ");
		table.setCollisionHandling(table.DOUBLE_HASHING);
		for(int i : insert) table.add(i);
		System.out.println(table.toString());
		table.clear();
	}
	
	private static int[] randomArray(int size) {
		int[] r = new int[size]; //create a new array of the given size 
		for(int i = 0; i < size; i++) {
			//populate with random two-digit integers (10-99)
			r[i] = (int)(Math.random()*90)+10; 
		}		
		return r;
	}
}
