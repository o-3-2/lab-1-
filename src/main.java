
public class main {

	public static void main(String[] args) {
		Mystack stack=new Mystack();
		kernel kernel=new kernel(stack);
		kernel.calls();

		
		stack.push("a");
		
		 kernel.ExecuteCall(0);
		 
		 
		 stack.push("a");
	       stack.push("b");
	       kernel.ExecuteCall(1);
	       
	       stack.push("a");
	       stack.push("b");
	       stack.push("c");
	       kernel.ExecuteCall(2);
	       
	       
	       stack.push("a");
	       stack.push("b");
	       stack.push("c");
	       stack.push("d");
           kernel.ExecuteCall(3);
           
           
           stack.push("a");
	       stack.push("b");
	       stack.push("c");
	       stack.push("d");
	       stack.push("e");
	       kernel.ExecuteCall(4);
	       
	       
	       
	       
	}

}
