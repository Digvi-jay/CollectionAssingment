import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question1 {
	static Map<Integer,String>map = new HashMap<Integer,String>();
	public static void main(String[] args) {
		Question1 q = new Question1();
		
	// Entering values directly using put.	
		map.put(1,"java");
		map.put(2, "SalseForce");
		map.put(3, "SQL");
		map.put(4, "AWS");
		
		System.out.println(map);
		
		System.out.println("____________________________________________________");
		
		
		//-------------------------------------------------
		//By user input.
		
		
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		System.out.println("enter 1 for entry ");
		
		System.out.println("enter 0 to exit");
		
		System.out.println("enter 2 to print map ");
		
		System.out.println("-------------------------------------------------");
		
		
		int x = sc.nextInt();
		
		
		
		if(x ==1) {
			
			
			System.out.println("enter key */Integer/*");
			int k = sc.nextInt();
			
			System.out.println("enter value */String/*");
			String v = sc.next();
			
			
			q.entermap(k, v);
		}
		else if(x==2) {
			q.displaymap();
		}
		else if(x==0) {
			break;
		}
		
		
		
			
		
		}
	
	
	}
	
	
	
	
	
	
	public void entermap(int k,String v) {	
		map.put(k, v);
				
	}
	
	public void displaymap() {
		//Using Iterator to store map as set in m.
				
			
			//Expression to return value in form of Key and Value.
					System.out.println(m.getKey()+" "+m.getValue());
					
					
					
	}
		
	}
	
	
}
