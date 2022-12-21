
public class PriorityQueueWithLinkedList implements PriorityQueue{
	
	private Node head;
	private static final int CAP = 100000;
	private int size;
	
	private class Node{
		
		public int data;
		public Node next;
		
		public Node() {
			next = null;
			size = 0;
		}
		
		public Node(int itm) {
			data = itm;
		}
	}
	
	public PriorityQueueWithLinkedList() {
		head = null;
	}

	@Override
	public int peek() {
		
		if(isEmpty()) {
			throw new RuntimeException();
		}
		
		Node walk = head;
		int min = walk.data;
		
		while(walk != null) {
			if(walk.data < min) {
				min = walk.data;
			}
			walk = walk.next;
		}
		
		return min;
	}

	@Override
	public void insert(int item) {
		
		if(!(size < CAP)) {
			throw new RuntimeException();
		}
		
		Node newNode = new Node(item);
		
		if(head == null) {
			head = newNode;
			size++;
			return;
		}
	
		Node walk = head;
		
		while(walk != null) {
			if(walk.next == null) {
				walk.next = newNode;
				size++;
				return;
			}
			walk = walk.next;
		}
		
		
	}

	@Override
	public int deleteMin() {
		
		if(isEmpty()) {
			throw new RuntimeException();
		}
		
		if(head.next == null) {
			int min = head.data;
			head = null;
			size--;
			return min;
		}
		
		int min = head.data;
		Node minNode = head;
		Node walk = head;
		Node prev = head;
		
		while(walk != null) {
			if(walk.next == null) {
				break;
			}
			if(walk.next.data < min) {
				min = walk.next.data;
				minNode = walk.next;
				prev = walk;
			}
			walk = walk.next;
		}
		
		if(prev == head && minNode == head) {
			head = head.next;
			size--;
			return min;
		}
		prev.next = minNode.next;
		size--;
		
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
	
	@Override
	public String toString() {
		
		String str = "{";
		
		Node walk = head;
		while(walk != null) {
			str += walk.data;
			if(walk.next != null) {
				str += "->";
			}
			walk = walk.next;
		}
		
		str += "}";
		
		return str;
	}
	
}
