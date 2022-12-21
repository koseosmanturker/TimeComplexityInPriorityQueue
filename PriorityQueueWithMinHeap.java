
public class PriorityQueueWithMinHeap implements PriorityQueue {
	
	private static final int CAP = 100000;
	private int[] list = new int[CAP];
	private int size;
	
	public PriorityQueueWithMinHeap() {
		size = 0;
	}

	@Override
	public int peek() {
		return list[0];
	}

	@Override
	public void insert(int item) {
		
		if(size < CAP) {
			list[size] = item;
			heapUp(size);
			size++;
		}
		else {
			throw new RuntimeException();
		}
		
	}

	@Override
	public int deleteMin() {
		
		if(size == 0) {
			throw new RuntimeException();
		}
		
		int itm = list[0];
		list[0] = list[size - 1];
		size--;
		heapDown(0);
		
		return itm;
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
	
	private void heapDown(int loc) {
		
		while(loc < size) {
			
			if(Right(loc) < size) {
				
				if(list[Left(loc)] <= list[Right(loc)]) {
					
					if(list[loc] > list[Left(loc)]) {
						loc = swap(loc, Left(loc));
						continue;
					}
					else {
						break;
					}
				}
				
				if(list[Right(loc)] <= list[Left(loc)]) {
					
					if(list[loc] > list[Right(loc)]) {
						loc = swap(loc, Right(loc));
						continue;
					}
					else {
						break;
					}
					
				}
				
			}
			
			else if(Left(loc) < size) {
				
				if(list[loc] > list[Left(loc)]) {
					loc = swap(loc, Left(loc));
					continue;
				}
				else {
					break;
				}
			}
			else {
				break;
			}
		}
			
	}
		
	
	
	private void heapUp(int loc) {
		
		while(loc > 0) {
			
			if(list[loc] < list[Parent(loc)]) {
				loc = swap(loc, Parent(loc));	
			}
			else {
				break;
			}
			
		}
		
	}
	
	private int Parent(int n) {
		return (n - 1) / 2;
	}
	
	private int Right(int n) {
		return (2 * n) + 2;
	}
	
	private int Left(int n) {
		return (2 * n) + 1;
	}
	
	public int swap(int loc, int swapLoc) {
		
		int e = list[loc];
		list[loc] = list[swapLoc];
		list[swapLoc] = e;
		loc = swapLoc;
		
		return loc;
	}

}
