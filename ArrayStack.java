public class ArrayStack<T> implements Stack<T>{

 	protected T[] arr=(T[]) new Object[10];
	protected int top=-1;

	protected void growArray(){
		T[] arr2 = (T[]) new Object[arr.length*2];
		for (int i=0; i<arr.length; i++){
			arr2[i]=arr[i];
		}
		arr=arr2;
	}

	public T pop(){
		if (empty()){
			throw new RuntimeException("Stack is empty");
		}

		return arr[top--];
	}


	public boolean empty(){
		return (top==-1);
	}

	public T peek() {
		if(empty()){
			throw new RuntimeException("Stack is empty");
		}
		return arr[top];
	}

	public void push(T item){
		if(top==arr.length-1)
			growArray();
		arr[++top]=item;
		
	}

	protected void printArray(T[] arr){
		for(int i=0;i<=top;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}