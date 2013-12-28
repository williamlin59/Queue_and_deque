
public class Arrayqueue <E> implements Queue<E>{
	protected int front=0;
	protected int rear=0;
	protected int N;
	protected E A[];
	public Arrayqueue(int arraylength){
		N=arraylength;
		A=(E[])new Object[N];
	}
	@Override
	public int size() {
		return rear-front;
	}

	@Override
	public boolean isEmpty() {
		return rear==0&&front==0;
	}

	@Override
	public E front() throws EmptyQueueException {
		if (rear==0&&front==0)
			throw new EmptyQueueException("Queue is empty");
		else{
			return A[0];
		}
		
	}

	@Override
	public void enqueue(E element) {
		if(rear==N){//if the stack size reach the array size
			E temp[]=(E[])new Object[N*2];//define a new array with type E which is doubled the size of array A.
			System.arraycopy(A, 0, temp, 0, N);//copy all the elements to the new array.
			A=(E[])new Object[N*2];//double the size of array A.
			System.arraycopy(temp, 0, A, 0, N);//copy all the elements back to array A.
			A[rear]=element;//store the object in A[n] and then increment the size of stack by n++.
			rear++;
		}
		else{
			A[rear]=element;
			rear++;
		}
		
	}

	@Override
	public E dequeue() throws EmptyQueueException {
		if (rear==0&&front==0)
			throw new EmptyQueueException("Queue is empty");
		else{
			E temp=(E)new Object();//declare a temp variable in type Object and cast it to type E.
			temp=A[front];//assign the value stored in A[n-1] to temp
			A[front]=null;
			front++;
			return temp;//return the element that A[n-1]used to store.
		}
	}

	public String toString() {
		int size=rear-front;
       String out = "[" + size + "] "; 
       for (int i=0; i<A.length; i++) { //loop that track the whole array.
           out += A[i] + " "; 
       } 
       return out; //return variable that stored all elements in the array.
   } 
	
}
