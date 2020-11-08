import java.util.HashMap;
import java.util.Map;
import java.util.Set;





public class kernel {
	
	
	private Mystack stack;
private HashMap<Integer, Systemcall> Systemcall;
	kernel(Mystack stack){
		this.stack=stack;
		Systemcall = new HashMap();
		
		
		Systemcall.put(0, new Systemcall("a"));
		Systemcall.put(1, new Systemcall("a", "b"));
		Systemcall.put(2, new Systemcall("a", "b", "c"));
		Systemcall.put(3, new Systemcall("a", "b", "c", "d"));
		Systemcall.put(4, new Systemcall("a", "b", "c", "d", "e"));
		
		
	}
	
	void ExecuteCall(int f) {		
		var adress =Systemcall.get(f);
	if (!Systemcall.containsKey(f)) {
		System.out.print("Call number " + f+ " does not exist\n");
		return;
	}
		System.out.print(Systemcall.get(f).Execute());
		
	}
	
	
     
	void calls() {
		Systemcall.entrySet().forEach(
				entry -> 
				System.out.println(entry.getKey()+" "+" "+ entry.getValue().getArgs()));
	}
	
	
				
}
