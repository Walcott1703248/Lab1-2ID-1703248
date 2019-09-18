
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Iteration iterationLibray=new Iteration();
 RecursionMathlib recursionLibray=new RecursionMathlib();
 
 System.out.println("Iteration");
 runTestCode(iterationLibray);
 
 System.out.println("Recursion");
 runTestCode(recursionLibray);
 
	}

	private static void runTestCode(RecursionMathlib recursionLibray) {
		
		System.out.println("gcd(4,2)="+recursionLibray.gcd(4,2));
		// TODO Auto-generated method stub
		
	}

}
