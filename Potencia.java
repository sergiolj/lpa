package recursividade;

public class Potencia {

	public static void main(String[] args) {
		System.out.println(potencia(2,3));

	}
	public static int potencia(int x, int n) {
		if (n==0) {
			return 1;
		}
		return x*potencia(x,n-1);
	}
}
