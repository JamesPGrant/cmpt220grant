
public class StackOfIntegers {
	private int[] elements;
	private int size;
	
	public StackOfIntegers() {
		elements = new int[10]; 
	}
	
	public StackOfIntegers(int size) {
		elements = new int[size];
	}
	
	public boolean empty() {
		return size == 0;
	}
	
	public int peek() {
		if (!empty())
			return elements[size - 1];
		return -1;
	}
	
	public void push(int value) {
		if (size != elements.length) {
			elements[size] = value;
			size++;
		}
	}
	
	public int pop() {
		if (!empty()) {
			size--;
			return elements[size];
		}
		return -1;
	}
	
	public int getSize() {
		return size;
	}
	public int reverse(){
		for(int i = size; i <elements.length / 2; i++) {
		int size = elements[i];
		elements[i] = elements[elements.length - i - 1];
		elements[elements.length - i - 1] = size;
		return size;
	}
		return size;
	}
}