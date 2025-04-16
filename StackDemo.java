setText(String.valueOf(n1 + n2)); 
} 
if (e.getSource() == b2) { 
t3.setText(String.valueOf(n1 - n2)); 
} 
if (e.getSource() == b3) { 
t3.setText(String.valueOf(n1 * n2)); 
} 
if (e.getSource() == b4) { 
t3.setText(String.valueOf(n1 / n2)); 
} 
if (e.getSource() == b5) { 
System.exit(0); 
} 
} 
public static void main(String[] args)  { 
new calculator();
} 
} 
3.Stack
import java.util.*; 
import java.io.*; 
public class StackDemo { 
    public static void main(String args[]) 
    { 
     // Creating an empty Stack 
     Stack<Integer> stk = new Stack<Integer>(); 
     // Use add() method to add elements 
     stk.push(10); 
     stk.push(15); 
     stk.push(30); 
     stk.push(20); 
     stk.push(5); 
     // Displaying the Stack 
     System.out.println("Initial Stack: " + stk); 
     // Fetching the element at the head of the Stack 
     System.out.println("The element at the top of the stack is: " + stk.peek()); 
     // Removing elements using pop() method 
     System.out.println("Popped element: " + stk.pop()); 
     System.out.println("Popped element: " + stk.pop()); 
// Displaying the Stack after pop operation 
System.out.println("Stack after pop operation: " + stk); 
System.out.println("The element at the top of the stack is: " + 
stk.peek()); 
} 
} 
