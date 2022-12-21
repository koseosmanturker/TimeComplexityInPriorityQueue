
public class PriorityQueueWithSortedArray implements PriorityQueue{
	
	private static final int CAP = 100000;
	private int[] elements = new int[CAP];
	private int size;
	
	public PriorityQueueWithSortedArray() {
		size = 0;
	}
	
	@Override
	public int peek() {
		
		if(isEmpty()) {
			throw new RuntimeException();
		}
		
		return elements[0];
	}

	@Override
	public void insert(int item) {
		
		if(size >= CAP) {
			throw new RuntimeException();
		}
		
		if(size == 0) {
			elements[0] = item;
			size++;
			return;
		}
		
		int idx = -1;
		
		for(int i = 0; i < size; i++) {
			if(item <= elements[i]) {
				idx = i;
				break;
			}
		}
		
		if(idx == -1) {
			elements[size] = item;
			size++;
			return;
		}
		
		
		for(int j = size; j > idx; j--) {
			elements[j] = elements[j - 1];
		}
		elements[idx] = item;
		size++;
		
	}

	@Override
	public int deleteMin() {
		
		if(isEmpty()) {
			throw new RuntimeException();
		}
		
		int min = elements[0];
		size--;
		
		for(int i = 0; i < size; i++) {
			elements[i] = elements[i + 1];
		}
		
		return min;
	}

	@Override
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		
		if(size == 0) {
			return true;
		}
		return false;
		
	}
	
	
	
}
