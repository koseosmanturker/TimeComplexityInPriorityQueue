import java.util.Random;

public class Main {
	
	public static final int RANDOMRANGE = 1000000;
	public static final int ADD = 10000;
	public static final int MAX = 80000;
	
	public static void main(String[] args) {
		
		PriorityQueueWithMinHeap pqm = new PriorityQueueWithMinHeap();
		PriorityQueueWithLinkedList pqll = new PriorityQueueWithLinkedList();
		PriorityQueueWithSortedArray pqa = new PriorityQueueWithSortedArray();
		
		Random random = new Random();
		
		
		/******************* Linked List *******************/
		System.out.println("Linked List");
		int size = 10000;
		
		while(size <= MAX) {
			
			long startInsertNanoLL = System.nanoTime();
			long startInsertCurrentLL = System.currentTimeMillis();
	
			for(int i = 0; i < size; i++) {
				pqll.insert(random.nextInt(RANDOMRANGE));
			}
			long endInsertNanoLL = System.nanoTime();
			long endInsertCurrentLL = System.currentTimeMillis();
			
			System.out.println("Insert Linked List Milli Sec (Size = " + size + "): " + (endInsertCurrentLL - startInsertCurrentLL));
			System.out.println("Insert Linked List Nano Sec (Size = " + size + "): " + (endInsertNanoLL - startInsertNanoLL));
			
			
			long startDeleteNanoLL = System.nanoTime();
			long startDeleteCurrentLL = System.currentTimeMillis();
			
			while(!pqll.isEmpty()) {
				pqll.deleteMin();
			}
			long endDeleteNanoLL = System.nanoTime();
			long endDeleteCurrentLL = System.currentTimeMillis();
			
			System.out.println("Delete Linked List Milli Sec (Size = " + size + "): " + (endDeleteCurrentLL - startDeleteCurrentLL));
			System.out.println("Delete Linked List Nano Sec (Size = " + size + "): "+ (endDeleteNanoLL - startDeleteNanoLL));
			System.out.println();
			
			size += ADD ;
		}
		
		
		/******************* Sorted Array *******************/
		System.out.println("SORTED ARRAY");
		size = 10000;
		
		while(size <= MAX) {
			
			long startInsertNanoSortedArray = System.nanoTime();
			long startInsertCurrentSortedArray = System.currentTimeMillis();
	
			for(int i = 0; i < size; i++) {
				pqa.insert(random.nextInt(RANDOMRANGE));
			}
			long endInsertNanoSortedArray = System.nanoTime();
			long endInsertCurrentSortedArray = System.currentTimeMillis();
			
			System.out.println("Insert Sorted Array Milli Sec (Size = " + size + "): " + (endInsertCurrentSortedArray - startInsertCurrentSortedArray));
			System.out.println("Insert Sorted Array Nano Sec (Size = " + size + "): " + (endInsertNanoSortedArray - startInsertNanoSortedArray));
			
			
			long startDeleteNanoSortedArray = System.nanoTime();
			long startDeleteCurrentSortedArray = System.currentTimeMillis();
			
			while(!pqa.isEmpty()) {
				pqa.deleteMin();
			}
			long endDeleteNanoSortedArray = System.nanoTime();
			long endDeleteCurrentSortedArray = System.currentTimeMillis();
			
			System.out.println("Delete Sorted Array Milli Sec (Size = " + size + "): " + (endDeleteCurrentSortedArray - startDeleteCurrentSortedArray));
			System.out.println("Delete Sorted Array Nano Sec (Size = " + size + "): "+ (endDeleteNanoSortedArray - startDeleteNanoSortedArray));
			System.out.println();
			
			size += ADD ;
		}
		
		
		/******************* Min Heap *******************/
		System.out.println("MIN HEAP");
		size = 10000;
		
		while(size <= MAX) {
			
			long startInsertNanoMinHeap = System.nanoTime();
			long startInsertCurrentMinHeap = System.currentTimeMillis();
	
			for(int i = 0; i < size; i++) {
				pqm.insert(random.nextInt(RANDOMRANGE));
			}
			long endInsertNanoMinHeap = System.nanoTime();
			long endInsertCurrentMinHeap = System.currentTimeMillis();
			
			System.out.println("Insert Min Heap Milli Sec (Size = " + size + "): " + (endInsertCurrentMinHeap - startInsertCurrentMinHeap));
			System.out.println("Insert Min Heap Nano Sec (Size = " + size + "): " + (endInsertNanoMinHeap - startInsertNanoMinHeap));
			
			
			long startDeleteNanoMinHeap = System.nanoTime();
			long startDeleteCurrentMinHeap = System.currentTimeMillis();
			
			while(!pqm.isEmpty()) {
				pqm.deleteMin();
			}
			long endDeleteNanoMinHeap = System.nanoTime();
			long endDeleteCurrentMinHeap = System.currentTimeMillis();
			
			System.out.println("Delete Min Heap Milli Sec (Size = " + size + "): " + (endDeleteCurrentMinHeap - startDeleteCurrentMinHeap));
			System.out.println("Delete Min Heap Nano Sec (Size = " + size + "): "+ (endDeleteNanoMinHeap - startDeleteNanoMinHeap));
			System.out.println();
			
			size += ADD ;
		}
		
	}
	
	

}
