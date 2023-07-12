# TimeComplexityInPriorityQueue

A priority queue is an abstract data type for storing a collection of prioritized elements that supports arbitrary element insertion, but supports removal of elements in order of priority, that is, the element with first priority can be removed at any time. <br/>


## The Priority Queue ADT<br/>
As an ADT, a priority queue P supports the following functions:<br/>
-isEmpty(): returns true if pqueue is empty otherwise false<br/>
-size(): Return the number of elements in P.<br/>
-insert(item): Insert a new element e into P.<br/>
-min() or peek(): Return a reference to an element of P with the smallest associated key value (but do not remove it); an error condition occurs if the priority queue is empty.<br/>
deleteMin(): Remove from P the element referenced by min(); an error condition occurs if the priority queue is empty.<br/>
<br/>
<br/>
Example : The following table shows a series of operations and their effects on an initially empty priority queue P. Each element consists of an integer, which we assume to be sorted according to the natural ordering of the integers. Note that
each call to min returns a reference to an entry in the queue, not the actual value. Although the “Priority Queue” column shows the items in sorted order, the priority queue need not store elements in this order.
<br/>
Operation 	Return 	Priority Queue<br/>
insert(5) 	– 		{5}<br/>
insert(9)		– 		{5,9}<br/>
insert(2) 	– 		{2,5,9}<br/>
insert(7) 	– 		{2,5,7,9}<br/>
min() 		[2] 		{2,5,7,9}<br/>
removeMin() 	[2]  		{5,7,9}<br/>
size() 		3 		{5,7,9}<br/>
min() 		[5] 		{5,7,9}<br/>
removeMin()	[5]		{7,9}<br/>
removeMin() 	[7]  		{9}<br/>
removeMin() 	[9]		{}<br/>
empty() 		true 		{}<br/>
removeMin() 	invalid operation {}<br/>
<br/>

## interface PriorityQueue<br/>
public interface PriorityQueue{<br/>
	  &nbsp;&nbsp;  public int peek();<br/>
	  &nbsp;&nbsp;  public void insert(int item);<br/>
	  &nbsp;&nbsp;  public int deletMin();<br/>
	  &nbsp;&nbsp;  public int size();<br/>
}<br/>
<br/>
## Implementing a Priority Queue with an array<br/>

In this section, we show how to implement a priority queue by storing its elements in an Linked list. We may consider two realizations, depending on whether we sort the elements of the list.
Implementation with an Unsorted array
Let us first consider the implementation of a priority queue P by an unsorted linked list L. A simple way to perform the operation insert(e) on P is by adding each new element at the begining  of L. This implementation of insert takes O(1) time.

Since the insertion does not consider key values, the resulting list L is unsorted. As a consequence, in order to perform either of the operations min or removeMin on P, we must inspect all the entries of the list to find one with the minimum key value. Thus, functions min and removeMin take O(n) time each, where n is the number of elements in P at the time the function is executed.
<br/>
Implementation with a Sorted Array
An alternative implementation of a priority queue P also uses a list L, except that this time let us store the elements sorted by their key values. Specifically, we represent the priority queue P by using a list L of elements sorted by nondecreasing key values, which means that the first element of L has the smallest key. 

We can implement function min in this case by accessing the element associated with the first element of the list L. Likewise, we can implement the removeMin function of P by removing first node of list L. Assuming that L is implemented as a linked list, operations min and removeMin in P take O(1) time, so are quite efficient.


Following table compares the running times of the functions of a priority queue realized by means of an unsorted and sorted list, respectively. There is an interesting contrast between the two functions. An unsorted list allows for fast insertions but slow queries and deletions, while a sorted list allows for fast queries and deletions, but slow insertions.
<br/>
Operation &nbsp; &nbsp;		Unsorted List 	&nbsp; &nbsp;	Sorted List<br/>
size, empty 	&nbsp; &nbsp; &nbsp;	O(1) 		    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  	O(1)<br/>
insert 	&nbsp; &nbsp; &nbsp; &nbsp;	&nbsp; &nbsp; &nbsp;  &nbsp;	O(1) &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;      O(n)<br/>
min, deleteMin &nbsp; O(n) &nbsp;	&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;    		O(1)<br/>

<br/>
## Task 1<br/>
Implement  Priority Queue using Linked List and perform 80,000 random value insertions while calculating running time(number of iterations) for each operation and record them.
<br/>
## Task 2 <br/>
Implement  Priority Queue using MinHeap, and perform 80,000 random value insertions while calculating running time(number of iterations) for each operation and record them.

<br/>
Run Time of a Program
The program performance is the amount of time needed to run a program and can be estimated analytically  or observed experimentally.   In order to observe running time of our PQueue implementation we shall desing an experiment such that we will be abable to make conculsion about running time performace of our implementation(sorted and unsorted linked list).  
Why do want to do a performance analysis of algorithms? <br/>
*To determine the practicality of algorithm<br/>
*To predict run time on large instance<br/>
*To compare two algorithms that have different implementations  <br/>
<br/>
The running time of our algorithm can be effected by cpu speed and number of inputs.  Since cpu performance will be fixed during experiment, only number of inputs (input size) effects running time of our algorithm.

## ALL RUNNING TIME COMPARISONS IN THE PriorityQueue_TimeComplexity_202028022.pdf 
(https://github.com/koseosmanturker/TimeComplexityInPriorityQueue/blob/main/PriorityQueue_TimeComplexity_202028022.pdf)https://github.com/koseosmanturker/TimeComplexityInPriorityQueue/blob/main/PriorityQueue_TimeComplexity_202028022.pdf)

