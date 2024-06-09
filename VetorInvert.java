package recursividade;

public class VetorInvert {

	public static void main(String[] args) {
		int [] n=new int []{1,2,3,4,5};
		int i=0;
		int f=n.length-1;
		mostra(n);
		invert(n,i,f);
		mostra(n);
	}
	public static void mostra(int[] v) {
		for(int i=0;i<v.length;i++) {
			System.out.print(v[i]+" ");
		}
		System.out.println();
	}
	public static void invert(int []v, int i, int f) {
		if (i<f) {
			trocar(v,i,f);
			invert(v,i+1,f-1);
		}
	}
	private static void trocar(int[] v, int i, int f) {
		int aux=v[i];
		v[i]=v[f];
		v[f]=aux;
	}
}
