public class ArrayQueue<T> implements Queue<T>{

	protected T[] arr = (T[]) new Object[10];
	protected int head=0;


	public T dequeue(){
		if(empty()){ 
			throw new RuntimeException("Cannot dequeue the array is empty");
		}
		for(int i=1;i<=head;i++){
			arr[i-1]=arr[i];
		}

		head--;
		return arr[0];
	}


	protected void growArray(){
		T[] arr2 = (T[]) new Object[arr.length*2];
		for(int i=0;i<arr.length;i++)
			arr2[i]=arr[i];
		arr=arr2;
	}

	protected boolean full(){
		return (head>arr.length);

	}

	public boolean empty(){
		return (head==0);
	}

	public void enqueue(T item){
		if(head>=arr.length-1){
			growArray();
		}
		arr[++head]=item;

	}	
}