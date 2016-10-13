package ds.stack;

public class App 
{
	public static void main(String[] args) {
		Stacks theStack = new Stacks(3);
		
//		theStack.push(20);  // will display 5th
//		theStack.push(40);  // will display 4th
//		theStack.push(60);  // will display 3rd
//		theStack.push(80);  // will display 2nd
//		theStack.push(100); // will display 1st
		
		
		
//		while(!theStack.isEmpty())
//		{
//			long value = theStack.pop();
//			System.out.println(value);
//		}
		
		System.out.println(reverseString("Lenny"));
		
	}
	
	public static String reverseString(String str)
	{
		int stackSize = str.length(); // the max stack size will be the length of whatever word is passed in
		
		Stacks theStack = new Stacks(stackSize); // make the stack
		
		for (int j = 0; j < str.length(); j++)
		{
			char ch = str.charAt(j); // getting a character from the input string
			theStack.push(ch); // since we're extracting a character at time --> we push each character further into the array so when we print it'll come out in reverse
		}
		
		String result = "";
		
		while(!theStack.isEmpty())
		{
			char ch = theStack.pop();
			result += ch; // appending the output
		}
		
		return result;
	}
}
