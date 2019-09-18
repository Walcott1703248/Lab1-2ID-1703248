public class RecursionMathlib {
	public abstract class RecursionMathLib extends Mathlib {
		public int gcd(int x, int y) {
			System.out.println("Recursive gcd not implemented");
		if(y==0){
			return x;
		}
		if(x>=y && x!=0){
			return gcd(y,x % y);
		}
		return 0;
		}
		public int ack(int x, int y) {
			return 0;
		}
		public int fb(int x) {
			return 0;
		}
		public int hano(int n) {
			return 0;
			}

		}
}
