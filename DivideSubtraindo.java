package recursividade;

public class DivideSubtraindo {

	public static void main(String[] args) {
		System.out.println(divmenos(12,2));

	}
	public static int divmenos(int x, int y) {
		if (x==y) {
			return y;
		}
		return x-divmenos(x-y,y);
	}
}
