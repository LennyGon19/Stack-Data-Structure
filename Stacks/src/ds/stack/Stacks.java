package ds.stack;

// ds stands for Data Structure --> Stack is a data structure

public class Stacks 
{
	private int maxSize;	    // stores the size of the stack
	// private long[] stackArray; // Container that stores the list of items of type long
	private char[] stackArray;
	private int top; 		   // This variable represents the index position of the last item that was placed on top of the stack
	

	public Stacks (int size) // initializes the stack array
	{
		this.maxSize = size; // so maxSize is going to be the size passed in through the argument
		this.stackArray = new char[maxSize]; //the stack array will be initialized with the size passed to maxSize
		this.top = -1; //since arrays start index 0, we're initializing at -1 
		// because there's nothing at the top
		// so when we actually start placing items on the stack it'll be in the 0 index
		// REMEMBER TOP IS THE INDEX POSITION OF THAT LAST ITEM PUSHED ONTO THE STACK
	}
	
	
	public void push(char j) // will put things on top of the stack
	{
		if(isFull()) // prevent from pushing more items than allowed
		{
			System.out.println("This stack is already full");
		}
		else
		{
		top++;   // top is incremented
		stackArray[top] = j; // so the top of the stack will always equal to the newly pushed item ==> j
		}
		
	}
	
	public char pop() // return the item we popped
	{
		if(isEmpty()) // prevent from popping more items than there are in the stack
		{
			System.out.println("The stack is already empty");
			return '0';
		}
		else
		{
		int old_top = top; // copy the current top item
		 
		top--; // reduce the index number
		
		return stackArray[old_top]; // return the index position of the item we intend to remove
		}
	}
	
	public char peak() // view the last item placed on top of the stack
	{
		return stackArray[top];
	}
	
	public boolean isEmpty()
	{
		
		
		return (top == -1);
		
	}
	
	public boolean isFull()
	{
		return (maxSize - 1 == top);
	}
	
	/*
	 * basic Stack Implementation
	 * 
	 * Items arent actually being removed
	 * we are using pointers that will point to different cells to maintain the value that is supposed to considered the top value on the stack
	 * 
	 * in reality the cells that are in the array are being overwritten with new data
	 * 
	 * and when we use the pop methods the pointer is going to reduce by 1
	 * 
	 * and when we push things it points to cell that is going to increase by 1
	 * 
	 * so top is used to reference certain cells in the array
	 * 
	 * so nothing is really being removed
	 * 
	 */
}

