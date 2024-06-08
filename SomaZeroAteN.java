package recursividade;

public class SomaZeroAteN {

	public static void main(String[] args) {
		int c=0;
		System.out.println(soma(5,c));

	}
	public static int soma(int n, int c) {
		if (c==n) {
			return n;
		}
		return c+soma(n,c+1);
	}
}
