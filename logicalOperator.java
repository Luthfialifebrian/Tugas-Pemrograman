public class logicalOperator {
	public static void main(String[] args) {

		int x = 10;
		boolean y = (x == 11);
		boolean z = x != 10 && x < 10;
		boolean a = !z;
	
		System.out.println(x);
		
		System.out.println(y);
		
		System.out.println(z);
		
		System.out.println(a);
	}
}