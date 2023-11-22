import java.io.*;

public class input {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bfn = new BufferedReader(
			new InputStreamReader(System.in));
		
		String radiusInputan = bfn.readLine();
		int radius = Integer.parseInt(radiusInputan);
		
		double luas = 3.14 * radius * radius;
		
		System.out.println(luas);
	}
}