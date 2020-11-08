
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Systemcall {
	List<String> Argument;
	
	public Systemcall(String...args ) {
		Argument=Arrays.asList(args);
	}
	
	public List getArgs() {
		return Argument;
	}
	

	public String Execute() {
		return "Call completed ,OK\n}";
	}

	
	
}
